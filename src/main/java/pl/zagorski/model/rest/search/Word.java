package pl.zagorski.model.rest.search;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Word {
    @JsonProperty(value = "id")
    private String id;
    @JsonProperty(value = "language")
    private String language;
    @JsonProperty(value = "headword")
    private Headword headword;
    @JsonProperty(value = "senses")
    private List<Sense> senses;

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

    public Headword getHeadword() {
        return headword;
    }

    public void setHeadword(Headword headword) {
        this.headword = headword;
    }

    public List<Sense> getSenses() {
        return senses;
    }

    public void setSenses(List<Sense> senses) {
        this.senses = senses;
    }
}
