package pl.zagorski.service.rest;

import pl.zagorski.model.rest.entry.ResultModeEntry;
import pl.zagorski.model.rest.search.ResultModeSearch;
import pl.zagorski.model.rest.sense.ResultModeSense;

public interface ConnectApiLanguageService {
    ResultModeSearch apiConnectSearch(String source, String language, boolean morph, String pos, int sample,
                                      int page, int page_length, boolean analyzed);
    ResultModeEntry apiConnectEntry(String entry_id);
    ResultModeSense apiConnectSense(String sense_id);
}
