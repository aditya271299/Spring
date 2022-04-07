package com.bean;

public class Movie {
    private int mId;
    private String mName;

    public Movie(int mId,String mName){
        this.mId=mId;
        this.mName=mName;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "mId=" + mId +
                ", mName='" + mName + '\'' +
                '}';
    }
}
