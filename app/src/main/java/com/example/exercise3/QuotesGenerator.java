package com.example.exercise3;

import java.util.concurrent.ThreadLocalRandom;

public class QuotesGenerator {
    String[] quotes= {"Be yourself, everyone else is already taken.", "Be the change that you wish to see in the world.", "In three words I can sum up everything I've learned about life: it goes on.", "To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment.", "It is better to be hated for what you are than to be loved for what you are not."};
    QuotesGenerator() {
        this.quotes = quotes;
    }

    public String getQuote() {
        int randomNum = (int) (Math.random()*quotes.length);
        return this.quotes[randomNum];
    }
}
