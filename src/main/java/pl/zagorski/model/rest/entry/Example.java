package pl.zagorski.model.rest.entry;

import pl.zagorski.model.rest.sense.Translation;

public class Example {
    private String text;
    private Translation translations;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Translation getTranslations() {
        return translations;
    }

    public void setTranslations(Translation translations) {
        this.translations = translations;
    }
}
