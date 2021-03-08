package com.practiceTDD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestValidateISBN {

    @Test
    public void checkValidISBN(){
        ValidateISBN isbn = new ValidateISBN();
        boolean result = isbn.checkISBN("1328974626");
        assertTrue(result, "First value");
        result = isbn.checkISBN("1250178606");
        assertTrue(result, "Second value");
    }

    @Test
    public void check13DigitValidISBN(){
        ValidateISBN isbn = new ValidateISBN();
        boolean result = isbn.checkISBN("9780394800011");
        assertTrue(result, "First value");
        result = isbn.checkISBN("9780394800387");
        assertTrue(result, "Second value");
    }

    @Test
    public void checkValidISBNendsWithX(){
        ValidateISBN isbn = new ValidateISBN();
        boolean result = isbn.checkISBN("012000030X");
        assertTrue(result, "ISBN number ending with X is valid");
        result = isbn.checkISBN("039480001X");
        assertTrue(result, "ISBN number ending with X is valid");
    }

    @Test
    public void checkInvalidISBN(){
        ValidateISBN isbn = new ValidateISBN();
        boolean result = isbn.checkISBN("1328974676");
        assertFalse(result);
    }

    @Test
    public void isISBNtenDigigt(){
        ValidateISBN isbn = new ValidateISBN();
        assertThrows(NumberFormatException.class, () ->{
            isbn.checkISBN("123456789");
        });
    }

    @Test
    public void checkISBNIsNumber(){
        ValidateISBN isbn = new ValidateISBN();
        assertThrows(NumberFormatException.class, () ->{
            isbn.checkISBN("helloworld");
        });
    }
}
