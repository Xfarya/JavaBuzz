package com.example;

public class JavaBuzz {

    public static String output;
    public static String returnString(int number) {
        if (number < 0) {
            return output = "Invalid Input";
        }
        if (isDivisibleBy(number, 15)) {
           output = "JavaBuzz";
        } else if (isDivisibleBy(number, 3)) {
           output = "Java";
        } else if (isDivisibleBy(number, 5))  {
           output = "Buzz";
        } else {
           output = number + "";
        }
        return output;
    }

    public static boolean isDivisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }
}
