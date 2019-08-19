package pl.zagorski.model.rest.entry;

import pl.zagorski.model.rest.sense.Translation;

import java.util.List;

public class Sense {
    private String id;
    private String definition;
    private Translation translations;
    private List<Example> examples;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public Translation getTranslations() {
        return translations;
    }

    public void setTranslations(Translation translations) {
        this.translations = translations;
    }

    public List<Example> getExamples() {
        return examples;
    }

    public void setExamples(List<Example> examples) {
        this.examples = examples;
    }
}
