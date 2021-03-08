package com.practiceTDD;

public class ValidateISBN {
    public boolean checkISBN(String ISBN) {
        int total = 0;

        if (ISBN.length() == 13) {

            return validate13DigitsISBN(ISBN, total);

        } else {

            return validate10DigitsISBN(ISBN, total);
        }
    }

    private boolean validate10DigitsISBN(String ISBN, int total) {
        if (ISBN.length() != 10) {
            throw new NumberFormatException("ISBN should be 10 digit longs");
        }


        for (int i = 0; i < 10; i++) {
            if (!Character.isDigit(ISBN.charAt(i))) {
                if (i == 9 && ISBN.charAt(i) == 'X') {
                    total += 10;
                } else {
                    throw new NumberFormatException();
                }
            } else {
                total += Character.getNumericValue(ISBN.charAt(i)) * (10 - i);
            }
        }

        if (total % 11 == 0)
            return true;
        else
            return false;
    }

    private boolean validate13DigitsISBN(String ISBN, int total) {
        for (int i = 0; i < 13; i++) {
            if (i % 2 == 0){
                total += Character.getNumericValue(ISBN.charAt(i)) * 1;
            }else{
                total += Character.getNumericValue(ISBN.charAt(i)) * 3;
            }
        }

        if (total % 10 == 0)
            return true;
        else
            return false;
    }
}
