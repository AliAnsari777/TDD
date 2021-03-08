package com.practiceTDD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestValidateISBN {

    @Test
    public void checkISBNIsNumber(){
        ValidateISBN isbn = new ValidateISBN();
        assertThrows(NumberFormatException.class, () ->{
            isbn.checkISBN("helloworld");
        });
    }

    @Test
    public void checkISBNIs10Digit(){
        ValidateISBN isbn = new ValidateISBN();
        assertThrows(NumberFormatException.class, () ->{
            isbn.checkISBN("123456789");
        });
    }

    @Test
    public void checkInvalid10DigitISBN(){
        ValidateISBN isbn = new ValidateISBN();
        boolean result = isbn.checkISBN("1328974676");
        assertFalse(result);
    }


    @Test
    public void check10DigitValidISBN(){
        ValidateISBN isbn = new ValidateISBN();
        boolean result = isbn.checkISBN("1328974626");
        assertTrue(result, "First value");
        result = isbn.checkISBN("1250178606");
        assertTrue(result, "Second value");
    }

    @Test
    public void check10DigitValidISBNEndsWithX(){
        ValidateISBN isbn = new ValidateISBN();
        boolean result = isbn.checkISBN("012000030X");
        assertTrue(result, "ISBN number ending with X is valid");
        result = isbn.checkISBN("039480001X");
        assertTrue(result, "ISBN number ending with X is valid");
    }

    @Test
    public void check13DigitValidISBN(){
        ValidateISBN isbn = new ValidateISBN();
        boolean result = isbn.checkISBN("9780394800011");
        assertTrue(result, "First value");
        result = isbn.checkISBN("9780394800387");
        assertTrue(result, "Second value");
    }
}
