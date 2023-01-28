package com.driver;

public class Director {
    private String name;
    private int rating;
    private int nmovie;

    public Director(String name, int rating, int nmovie) {
        this.name = name;
        this.rating = rating;
        this.nmovie = nmovie;
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

    public int getNmovie() {
        return nmovie;
    }

    public void setNmovie(int nmovie) {
        this.nmovie = nmovie;
    }
}
