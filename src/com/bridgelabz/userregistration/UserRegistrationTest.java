package com.bridgelabz.userregistration;
import org.junit.Assert;
import org.junit.Test;

/**
 * Performing test cases for first name, last name, Email-id, phoneNumber & Password.
 */

public class UserRegistrationTest {
    @Test
    public void givenFirstName_whenProper_ShouldReturnTrue() {
        UserRegistrationRegex userRegistrationRegEx = new UserRegistrationRegex();
        try {
            boolean result = userRegistrationRegEx.firstNameValidate.userEntries("Bhuvana");
            Assert.assertTrue(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }

    @Test
    public void givenFirstName_whenNotProper_ShouldReturnFalse() {
    	UserRegistrationRegex userRegistrationRegEx = new UserRegistrationRegex();
        try {
            boolean result = userRegistrationRegEx.firstNameValidate.userEntries("Bhuvan");
            Assert.assertFalse(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }

    @Test
    public void givenLastName_whenProper_ShouldReturnTrue() {
    	UserRegistrationRegex userRegistrationRegEx = new UserRegistrationRegex();
        try {
            boolean result = userRegistrationRegEx.lastNameValidate.userEntries("Chandra");
            Assert.assertTrue(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }

    @Test
    public void givenLastName_whenNotProper_ShouldReturnFalse() {
    	UserRegistrationRegex userRegistrationRegEx = new UserRegistrationRegex();
        try {
            boolean result = userRegistrationRegEx.lastNameValidate.userEntries("chandra");
            Assert.assertFalse(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }


    @Test
    public void givenEmail_whenProper_ShouldReturnTrue() {
    	UserRegistrationRegex userRegistrationRegEx = new UserRegistrationRegex();
        try {
            boolean result = userRegistrationRegEx.emailValidate.userEntries("abc.xyz@bl.co.in");
            Assert.assertTrue(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail_whenNotProper_ShouldReturnFalse() {
    	UserRegistrationRegex userRegistrationRegEx = new UserRegistrationRegex();
        try {
            boolean result = userRegistrationRegEx.emailValidate.userEntries("abc.xyz@bl.in");
            Assert.assertFalse(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }

    @Test
    public void givenPhone_whenProper_ShouldReturnTrue() {
    	UserRegistrationRegex userRegistrationRegEx = new UserRegistrationRegex();
        try {
            boolean result = userRegistrationRegEx.phoneNumberValidate.userEntries("91 9876543210");
            Assert.assertTrue(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }

    @Test
    public void givenPhone_whenNotProper_ShouldReturnFalse() {
    	UserRegistrationRegex userRegistrationRegEx = new UserRegistrationRegex();
        try {
            boolean result = userRegistrationRegEx.phoneNumberValidate.userEntries("91 9876543210");
            Assert.assertFalse(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }

    @Test
    public void givenPassword_whenProper_ShouldReturnTrue() {
    	UserRegistrationRegex userRegistrationRegEx = new UserRegistrationRegex();
        try {
            boolean result = userRegistrationRegEx.passwordValidate.userEntries("Abc12345#");
            Assert.assertTrue(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }

    @Test
    public void givenPassword_whenNotProper_ShouldReturnFalse() {
    	UserRegistrationRegex userRegistrationRegEx = new UserRegistrationRegex();
        try {
            boolean result = userRegistrationRegEx.passwordValidate.userEntries("Jhjsh23#%");
            Assert.assertFalse(result);
        }catch (InvalidUserInputException e){
            System.out.println(e);
        }
    }
}