package com.company.createanobject;

import java.util.Scanner;

public class MovieMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();

        System.out.println("Who is the director?");
        String director = scanner.nextLine();

        System.out.println("What is the runtime on the movie?");
        float runtimeInMin = scanner.nextFloat();

        System.out.println("When was it released?");
        boolean hasBeenReleased = scanner.hasNextBoolean();

        scanner.close();

        Movie movie = new Movie(title, director,runtimeInMin,hasBeenReleased);

    }


}
