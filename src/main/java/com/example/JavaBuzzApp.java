package com.example;

import java.util.Scanner;

public class JavaBuzzApp {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        JavaBuzz javaBuzz = new JavaBuzz();
        int javaBuzzNumber;
        int javaBuzzNumberTwo;

        while (true) {
            System.out.println("\nPlease input a positive integer for an individual answer");
            System.out.println("'-1', if you would like to see all numbers up til input number");
            System.out.println("'-2' to quit");
            javaBuzzNumber = consoleInput.nextInt();

            if (javaBuzzNumber == -2) {
                break;
            }

            if (javaBuzzNumber == -1) {
                System.out.println("\nPlease input a positive integer for a list of numbers");
                javaBuzzNumberTwo = consoleInput.nextInt();
                for (int i = 1; i <= javaBuzzNumberTwo; i++) {
                    System.out.println(JavaBuzz.returnString(i));
                }
            }

            if (javaBuzzNumber < 1) {
               System.out.println("\nPlease input a positive integer");
            } else {
                System.out.print(JavaBuzz.returnString(javaBuzzNumber));
            }
        }



        System.out.println("Thank you for using the JavaBuzzApp!");

    }
}
