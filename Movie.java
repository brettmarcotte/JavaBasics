package com.company.createanobject;

public class Movie {
    public String title;
    public String director;
    public float runtimeInMin;
    public boolean hasBeenReleased;

    public void movie (String title, String director, float runtimeInMin, boolean hasBeenReleased){
        this.title = title;
        this.director = director;
        this.runtimeInMin = runtimeInMin;
        this.hasBeenReleased = hasBeenReleased;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", runtimeInMin=" + runtimeInMin +
                ", hasBeenReleased=" + hasBeenReleased +
                '}';
    }
}
