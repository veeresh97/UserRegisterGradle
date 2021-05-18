package com.UserRegistrater;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner sc = new Scanner(System.in);
    public static void validation(String firstName, String lastName, String email, String mobile, String password ) {
        // First Name and Last Name Validation
        System.out.println("First Name: " + Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", firstName));
        System.out.println("Last Name: " + Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", lastName));
        // Email validation
        System.out.println("E-Mail: " + Pattern.matches("[a-zA-Z-\\+]+(\\.[a-zA-Z0-9-]+)*@[A-Za-z-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", email));
        // PhoneNumber validation
        System.out.println("Mobile Number: " + Pattern.matches("^[9][1][\s][6-9]{1}[0-9]{9}$", mobile));
        // Password validation (Rule 3: one numeric number should be there)
        System.out.println("Password: " + Pattern.matches("^(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{7,}$", password));
    }
    public static void main(String[] args) {
        System.out.println("Enter a valid first name");
        String firstName = sc.nextLine();
        System.out.println("Enter a valid last name");
        String lastName = sc.nextLine();
        System.out.println("Enter a valid email");
        String email = sc.nextLine();
        System.out.println("Enter a valid mobile number starting with 91 followed by a space and 10 digit number");
        String mobile = sc.nextLine();
        System.out.println("Enter the password and it should be minimum of 8 characters");
        String password = sc.nextLine();
        validation(firstName, lastName, email, mobile, password);

    }
}
