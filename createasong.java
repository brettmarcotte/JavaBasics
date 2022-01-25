package com.company.createanobject;

public class createasong {

    public String songName;
    public String artist;
    public String genre;
    public int seconds;

    public void Song (String songName, String artist, String genre, int seconds){

        this.songName = songName;
        this.artist = artist;
        this.genre = genre;
        this.seconds = seconds;

    }

    @Override
    public String toString() {
        return "createasong{" +
                "songName='" + songName + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                ", seconds=" + seconds +
                '}';
    }
}
