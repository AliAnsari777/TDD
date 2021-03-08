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
    public void checkInvalidISBN(){
        ValidateISBN isbn = new ValidateISBN();
        boolean result = isbn.checkISBN("1328974676");
        assertFalse(result);
    }
}
