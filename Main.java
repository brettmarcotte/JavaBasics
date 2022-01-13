package com.company.sayhello;

import java.util.Scanner;

public class Main {
    public static void whatIsYourName(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.println("your first name is " + name);

    }

    public static void whatIsYourLastName(){
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        System.out.println("It is nice to formally meet you " + firstName + lastName);
    }
}
