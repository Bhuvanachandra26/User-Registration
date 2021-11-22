package com.bridgelabz.userregistration;

/**
 * Functional interface for UserRegistration
 */

@FunctionalInterface
public interface UserRegistrationInterface {
    public abstract boolean userEntries(String value) throws InvalidUserInputException;
}