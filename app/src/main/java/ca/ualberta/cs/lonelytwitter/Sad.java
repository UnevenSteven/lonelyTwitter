package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by steven on 18/01/18.
 */

public class Sad extends Mood {
    public Sad(Mood mood) {
        super(mood);
    }
    public Sad(Mood mood, Date date) {
        super(mood, date);
    }

    @Override
    public String MoodString() {
        return "Sad";
    }
}
