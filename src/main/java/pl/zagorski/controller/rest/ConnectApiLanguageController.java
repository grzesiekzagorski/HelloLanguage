package pl.zagorski.controller.rest;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.zagorski.model.rest.entry.ResultModeEntry;
import pl.zagorski.model.rest.search.ResultModeSearch;
import pl.zagorski.model.rest.sense.ResultModeSense;
import pl.zagorski.service.rest.ConnectApiLanguageService;

@RestController
public class ConnectApiLanguageController {

    @Autowired
    private ConnectApiLanguageService connectApiLanguageService;

    @GetMapping("/connectApiSearch")
    public ResultModeSearch tryConnectWithApiSearch(){
        ResultModeSearch resultModeSearch = connectApiLanguageService.apiConnectSearch("global","pl",false,"noun",
                10000,1,10,false);
        return resultModeSearch;
    }

    @GetMapping("/connectApiEntry/{entry_id}")
    public ResultModeEntry tryConnectWithApiEntry(@PathVariable String entry_id){
        return connectApiLanguageService.apiConnectEntry(entry_id);
    }

    @GetMapping("/connectApiSense/{sense_id}")
    public ResultModeSense tryConnectWithApiSense(@PathVariable String sense_id){
        return connectApiLanguageService.apiConnectSense(sense_id);
    }

}
