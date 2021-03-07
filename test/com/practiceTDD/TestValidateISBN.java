package com.practiceTDD;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestValidateISBN {

    @Test
    public void checkValidISBN(){
        ValidateISBN isbn = new ValidateISBN();
        boolean result = isbn.checkISBN("1328974626");
        assertTrue("First value", result);
        result = isbn.checkISBN("1250178606");
        assertTrue("Second value", result);
    }

    @Test
    public void checkInvalidISBN(){
        ValidateISBN isbn = new ValidateISBN();
        boolean result = isbn.checkISBN("1328974676");
        assertFalse(result);
    }
}
