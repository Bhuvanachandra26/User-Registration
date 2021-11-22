package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * User need to follow pre-defined Password Rules.
 * Rule-1 : Minimum 8 Characters.
 */

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password : ");
        String password = scanner.next();
        System.out.println(Pattern.matches("^[a-zA-Z0-9].{7,}$", password));
    }
}