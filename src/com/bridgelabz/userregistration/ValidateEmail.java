package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

/**
 * Regular expression for Email validation.
 */
public class ValidateEmail {
    public boolean validateEmail(String email) {
        return Pattern.matches("^[\\w+_-]+(?:\\.[\\w+_-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}$", email);
    }
}