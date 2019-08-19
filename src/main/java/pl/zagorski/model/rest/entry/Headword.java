package pl.zagorski.model.rest.entry;

public class Headword {
    private String text;
    private Pronunciation pronunciation;
    private String pos;
    private String gender;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Pronunciation getPronunciation() {
        return pronunciation;
    }

    public void setPronunciation(Pronunciation pronunciation) {
        this.pronunciation = pronunciation;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
