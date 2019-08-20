package pl.zagorski.model.rest.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.JsonAdapter;
import pl.zagorski.model.rest.adapter.AlwaysListTypeAdapterFactory;

import java.util.List;

public class Word {
    @JsonProperty(value = "id")
    private String id;
    @JsonProperty(value = "language")
    private String language;
    @JsonAdapter(AlwaysListTypeAdapterFactory.class)
    private List<Headword> headword;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<Headword> getHeadword() {
        return headword;
    }

    public void setHeadword(List<Headword> headword) {
        this.headword = headword;
    }
}
