package com.exemple.personnage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FIZZBUZZTest {
    @Test
    public void testDivisiblePar3() {
        assertEquals("Fizz", FIZZBUZZ.de(3));
    }
    @Test
    public void testDivisiblePar5() {
        assertEquals("Buzz", FIZZBUZZ.de(5));
    }

    @Test
    public void testDivisiblePar3Et5() {
        assertEquals("FizzBuzz", FIZZBUZZ.de(15));
    }

    @Test
    public void testAutreNombre() {
        assertEquals("2", FIZZBUZZ.de(2));
    }

}