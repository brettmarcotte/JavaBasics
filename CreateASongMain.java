package com.company.createanobject;

import javax.lang.model.element.NestingKind;
import java.util.Scanner;

public class CreateASongMain {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String CreateASong = scanner.nextLine();

        System.out.println("What is the name of the song?");
        String songName = scanner.nextLine();

        System.out.println("What is the artist's name?");
        String artist = scanner.toString();

        System.out.println("What is the genre?");
        String genre = scanner.nextLine();

        System.out.println("How many Seconds are in the song?");
        int seconds = scanner.nextInt();

        scanner.close();

        CreateASong createASong = new CreateASong(songName, artist, genre, seconds);

        System.out.println(createASong);
    }


}
