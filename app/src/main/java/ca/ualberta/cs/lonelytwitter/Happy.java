package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by steven on 18/01/18.
 */

public class Happy extends Mood {
    public Happy(Mood mood) {
        super(mood);
    }
    public Happy(Mood mood, Date date) {
        super(mood, date);
    }

    @Override
    public String MoodString() {
        return "Happy";
    }
}
