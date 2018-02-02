
/*
 * Version 1
 * Copyright (c) 2018 Team 24. CMPUT301. University of Alberta - All RIghts Reserved.
 * You may use, distribute or modify this code under terms and conditions of Code of Student Behaviour at
 * University ofAlberta.
 * You can find a copy of the license in this project. Otherwise, please contact ssan@ualberta.ca
 * /
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * This class repsents a tweet
 * @author steven
 * @version 1.0
 */

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;

    /**
     * Contructs a tweet instance using the given message
     * @param message the message of the tweet
     */

    Tweet(String message){

        this.message = message;
        date = new Date();
//        message = message;
    }

    Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    public String getMessage(){
        return message;
    }

    /**
     * sets the message of the tweet
     *
     * @param message the new message of the tweet
     * @throws TweetTooLongException is thrown when the message is over 140 characters
     */

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() < 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }
    //date of the tweet
    public Date getDate(){
        return date;
    }

    //sets date
    public void setDate(Date date){
        this.date = date;
    }

    //declare if important
    public abstract Boolean isImportant();

    //format tweet
    public String toString() {
        return date.toString() + " | " + message;

    }
}
