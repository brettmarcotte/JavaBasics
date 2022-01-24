package com.company.asktheuser;


import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String userInput1 = scanner.nextLine();
        System.out.println("Hello" + userInput1);

        System.out.println("What is your age?");
        byte userInput2 = scanner.nextByte();
        System.out.println("Wow " + userInput2 + " is pretty old!" );

        System.out.println("What is your ");
        int userInput3 = scanner.nextInt();
        System.out.println();

         



    }

}
