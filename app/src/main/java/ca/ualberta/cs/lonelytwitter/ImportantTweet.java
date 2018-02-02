
/*
 * Important Tweet
 * Version 1
 * Feb 1, 2018
 * Copyright (c) 2018 Team 24. CMPUT301. University of Alberta - All RIghts Reserved.
 *   You may use, distribute or modify this code under terms and conditions of Code of Student Behaviour at
 *   University ofAlberta.
 *   You can find a copy of the license in this project. Otherwise, please contact ssan@ualberta.ca
 * /
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * an important tweet
 * @author steven
 * @version 1
 *
 * @see Tweet
 * @see NormalTweet
 */

public class ImportantTweet extends Tweet {
    /**
     * Constructs an important tweet
     *
     * @param message the message of the tweet
     */
    ImportantTweet(String message){
        super(message);
    }

    /**
     * construct an important tweet
     * @param message the message of the tweet
     * @param date the date of the tweet
     */

    ImportantTweet(String message, Date date){
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
