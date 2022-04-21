package com.example;

public class JavaBuzz {

    public static String output;
    public static void main(String[] args) {
    }

    public static String returnString(int isConvertible) {
        if (isJavaBuzz(isConvertible)) {
           output = "JavaBuzz";
        } else if (isJava(isConvertible)) {
           output = "Java";
        }
        return output;
    }

    public static boolean isJavaBuzz(int number) {
        return isDivisibleBy(number, 15);
    }

    public static boolean isJava(int number) {
        return isDivisibleBy(number, 3);
    }

    public static boolean isBuzz(int number) {
        return isDivisibleBy(number, 5);
    }
    {}
    public static boolean isDivisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }
}
