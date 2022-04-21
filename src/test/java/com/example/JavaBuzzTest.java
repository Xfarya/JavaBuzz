package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaBuzzTest {

   @Test
   public void javaBuzz() {
        assertTrue(JavaBuzz.isJavaBuzz(15));
    }

    @Test
    public void notJavaBuzz() {
        assertFalse(JavaBuzz.isJavaBuzz(16));
    }

    @Test
    public void java() {
        assertTrue(JavaBuzz.isJava(3));
    }

    @Test
    public void notJava() {
        assertTrue(JavaBuzz.isJava(4));
    }

    @Test
    public void buzz() {
        assertTrue(JavaBuzz.isBuzz(5));
    }

    @Test
    public void notBuzz() {
        assertTrue(JavaBuzz.isBuzz(6));
    }

    @Test
    public void returnString() {
       assertEquals("JavaBuzz", JavaBuzz.returnString(15));
    }


}