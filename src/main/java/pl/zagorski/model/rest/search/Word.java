package pl.zagorski.model.rest.search;

import java.util.List;

public class Word {
    private String id;
    private String language;
    private Headword headword;
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
