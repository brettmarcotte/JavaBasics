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

        System.out.println("What is your Salary?");
        int userInput3 = scanner.nextInt();
        System.out.println("You make " + userInput3 + "per year!");

        System.out.println("What is your hourly wage? ");
        float userInput4 = scanner.nextFloat();
        System.out.println("you make" + userInput4 + "an hour!");

        System.out.println("What is your phone number?");
        long userInput5 = scanner.nextLong();
        System.out.println("your phone number is " + userInput5);

        System.out.println("What is Etherum's value");
        double userInput6 = scanner.nextDouble();
        System.out.println("Etherum is at " + userInput6);

        System.out.println("What is the weather?");
        boolean userInput7 = scanner.nextBoolean();
        System.out.println("The weather is " + userInput7);

        System.out.println("What is your favorite quote?");
        String userInput8 = scanner.nextLine();
        System.out.println("your favorite quote is " + userInput8);


    }

}
