package com.bean;

import java.util.Set;

public class Director {
private int dId;
private String dName;
private Set<Movie> movies;

    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }
    public void display(){
        System.out.println("D id is "+dId);
        System.out.println("D name is "+dName);
        Set<Movie> m = getMovies();
        System.out.println("movies are");
        for (Movie n:m) {
            System.out.println(n);

        }
    }
}
