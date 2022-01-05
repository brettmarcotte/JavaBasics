package com.company;

public class NameGenerator {

        public static void main(String[] args) {
            System.out.println(generateName("Brett", "Marcotte"));
        }
        static String generateName(String first, String last) {
            String s = first + " " + last;
            return s;
        }
    }

}
