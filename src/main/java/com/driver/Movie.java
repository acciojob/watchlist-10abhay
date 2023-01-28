package com.driver;

public class Movie {
    private String name;
    private int rating;
    private int duration;

    public Movie(String name, int rating, int duration) {
        this.name = name;
        this.rating = rating;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
