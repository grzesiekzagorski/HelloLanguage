package pl.zagorski.service.rest;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import pl.zagorski.model.rest.entry.ResultModeEntry;
import pl.zagorski.model.rest.search.ResultModeSearch;
import pl.zagorski.model.rest.sense.ResultModeSense;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;

@Service
public class ConnectApiLanguageServiceImpl implements ConnectApiLanguageService {

    @Value("${api.auth.username}")
    private String username;
    @Value("${api.auth.password}")
    private String password;
    @Value("${api.host}")
    private String host;

    @Override
    public ResultModeSearch apiConnectSearch(String source, String language, boolean morph, String pos, int sample,
                                 int page, int page_length, boolean analyzed) {
        HttpHeaders httpHeaders = createHeaders(username, password);
        HttpEntity<String> httpEntity = new HttpEntity<>("parameters", httpHeaders);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<ResultModeSearch> exchange = restTemplate.exchange(buildUrlSearch(source, language, morph, pos,
                sample, page, page_length, analyzed).toUriString(), HttpMethod.GET,
                httpEntity, ResultModeSearch.class);
        return exchange.getBody();
    }

    private UriComponents buildUrlSearch(String source, String language, boolean morph, String pos, int sample,
                                         int page, int page_length, boolean analyzed) {
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.put("source", Collections.singletonList(source));
        params.put("language", Collections.singletonList(language));
        params.put("morph", Collections.singletonList(String.valueOf(morph)));
        params.put("pos", Collections.singletonList(pos));
        params.put("sample", Collections.singletonList(String.valueOf(sample)));
        params.put("page", Collections.singletonList(String.valueOf(page)));
        params.put("page-length", Collections.singletonList(String.valueOf(page_length)));
        params.put("analyzed", Collections.singletonList(String.valueOf(analyzed)));

        return UriComponentsBuilder.newInstance()
                .scheme("https")
                .host(host + "/search")
                .queryParams(params)
                .build();
    }

    @Override
    public ResultModeEntry apiConnectEntry(String entry_id) {
        HttpHeaders httpHeaders = createHeaders(username, password);
        HttpEntity<String> httpEntity = new HttpEntity<>("parameters", httpHeaders);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<ResultModeEntry> exchange = restTemplate.exchange(buildUrlEntry(entry_id), HttpMethod.GET,
                httpEntity, ResultModeEntry.class);
        return exchange.getBody();

    }

    private String buildUrlEntry(String entry_id) {
        String url = new StringBuilder()
                .append("https://")
                .append(host)
                .append("/")
                .append("entries")
                .append("/")
                .append(entry_id)
                .toString();
        return url;
    }

    @Override
    public ResultModeSense apiConnectSense(String sense_id) {
        HttpHeaders httpHeaders = createHeaders(username, password);
        HttpEntity<String> httpEntity = new HttpEntity<>("parameters", httpHeaders);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<ResultModeSense> exchange = restTemplate.exchange(buildUrlSense(sense_id), HttpMethod.GET,
                httpEntity, ResultModeSense.class);
        return exchange.getBody();
    }

    private String buildUrlSense(String sense_id) {
        String url = new StringBuilder()
                .append("https://")
                .append(host)
                .append("/")
                .append("senses")
                .append("/")
                .append(sense_id)
                .toString();
        return url;
    }

    private HttpHeaders createHeaders(String username, String password) {
        return new HttpHeaders() {{
            String auth = username + ":" + password;
            byte[] encodedAuth = Base64.encodeBase64(
                    auth.getBytes(Charset.forName("US-ASCII")));
            String authHeader = "Basic " + new String(encodedAuth);
            set("Authorization", authHeader);
            setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        }};
    }
}
