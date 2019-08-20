package pl.zagorski.model.view;

import org.springframework.beans.factory.annotation.Autowired;
import pl.zagorski.service.WordDelivery;

/**
 * Na 1 Level składa się 30 słow. Każdy level składa się z 3 części.
 */
public class LearnView {
    @Autowired
    private WordDelivery wordDelivery;

    /**
     * funkcja wyświetlająca wszystkie słowa z danego levelu
     */
    public void prepareWordsToBeRepeated(int level){

    }
    /**
     * funkcja wyświetlająca wszystkie słowa z danej części danego levelu
     */
    public void prepareWordsToBeRepeatedInPart(int level, int part){

    }

    public void prepareNew

}
