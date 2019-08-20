package pl.zagorski.model.rest.sense;

import com.google.gson.annotations.JsonAdapter;
import pl.zagorski.model.rest.adapter.AlwaysListTypeAdapterFactory;

import java.util.List;

public class Translation {
    @JsonAdapter(AlwaysListTypeAdapterFactory.class)
    private List<Language> en;

    public List<Language> getEn() {
        return en;
    }

    public void setEn(List<Language> en) {
        this.en = en;
    }
}
