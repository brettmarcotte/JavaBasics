package com.company.createanobject;

import java.util.Scanner;

public class FruitMain {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("What year was the fruit established?");
        short yearEstablished = scanner.nextShort();

        System.out.println("Does the fruit have seeds?");
        boolean hasSeeds = scanner.hasNextBoolean();

        scanner.close();

        Fruit Fruit = new Fruit(name, yearEstablished, hasSeeds);

    }

}
