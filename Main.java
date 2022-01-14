package com.company.sayhello;

import java.util.Scanner;

public class Main {
    public static void whatIsYourName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("your name is " + name);

    }

    public static void whatIsYourLastName(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your first name?");
        System.out.println("What is your last name?");

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        System.out.println("It is nice to formally meet you " + firstName + lastName);

    }
}
