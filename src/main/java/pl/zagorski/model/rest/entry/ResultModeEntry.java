package pl.zagorski.model.rest.entry;

import java.util.List;

public class ResultModeEntry {
    private String id;
    private String source;
    private String language;
    private int version;
    private Headword headword;
    private List<Sense> senses;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
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
