package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaBuzzTest {

    @Test
    public void returnStringJavaBuzz() {
       assertEquals("JavaBuzz", JavaBuzz.returnString(15));
    }

    @Test
    public void returnStringJava() {
        assertEquals("Java", JavaBuzz.returnString(3));
    }

    @Test
    public void returnStringBuzz() {
        assertEquals("Buzz", JavaBuzz.returnString(5));
    }

    @Test
    public void returnIntegerIfNotJavaBuzz() {
        assertEquals("1", JavaBuzz.returnString(1));
    }

    @Test
    public void returnIntegerIfNotJavaBuzzExample2() {
        assertEquals("14", JavaBuzz.returnString(14));
    }

    @Test
    public void returnIntegerIfNotJavaBuzzExample3() {
        assertEquals("94358792", JavaBuzz.returnString(94358792));
    }

    @Test
    public void invalidInput() {
        assertEquals("Invalid Input", JavaBuzz.returnString(-10));
    }

}