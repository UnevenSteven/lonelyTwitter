package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by steven on 18/01/18.
 */

public abstract class Mood {
    private Mood mood;
    private Date date;

    public Mood(Mood mood) {
        this.mood = mood;
        this.date = new Date();
    }

    public Mood(Mood mood, Date date) {
        this.mood = mood;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Mood getMood() {
        return this.mood;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public abstract String MoodString();
}