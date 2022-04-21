package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaBuzzTest {

   @Test
   public void javaBuzz() {
        assertTrue(JavaBuzz.isJavaBuzz(15));
    }

    @Test
    public void java() {
        assertTrue(JavaBuzz.isJava(5));
    }
}