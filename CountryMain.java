package com.company.createanobject;


import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class CountryMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String countryName = scanner.nextLine();

        System.out.println("How many people live here?");
        long population = scanner.nextLong();
        scanner.nextLine();

        System.out.println("What is the capital?");
        String countryCapital = scanner.nextLine();

        scanner.close();

        Country country = new Country(countryName, population, countryCapital);

        System.out.println(country);

    }



}
