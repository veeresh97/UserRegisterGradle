package com.UserRegistrater;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner sc = new Scanner(System.in);
    public static void validation(String firstName, String lastName, String email, String mobile, String password) {
        // First Name and Last Name comes with restriction such as first letter should be upper case and with minimum 3 characters
        System.out.println("First Name: " + Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", firstName));
        System.out.println("Last Name: " + Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", lastName));
        //Email validation of all sample emails
        System.out.println("E-Mail: " + Pattern.matches("^abc[a-zA-Z0-9.+-]*@[a-z]*[.][a-z]{2,5}[.,a-z]{0,5}", email));
        // 91 followed by space followed by 10 digit number
        System.out.println("Mobile Number: " + Pattern.matches("^[9][1][\s][6-9][0-9]{9}$", mobile));
        // minimum 8 characters required
        System.out.println("Password: " + Pattern.matches("^(?=.*[\\@\\#\\$\\%\\&\\_\\,\\.])(?=.*[A-Z])(?=.*[0-9]).{8,}$", password));
    }
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program");
        System.out.println("Enter a valid first name");
        String firstName = sc.nextLine();
        System.out.println("Enter a valid last name");
        String lastName = sc.nextLine();
        System.out.println("Enter a valid email");
        String email = sc.nextLine();
        System.out.println("Enter a valid mobile number starting with 91 followed by a space and 10 digit number");
        String mobile = sc.nextLine();
        System.out.println("Enter a valid password with minimum 8 characters");
        String password = sc.nextLine();
        validation(firstName, lastName, email, mobile, password);

    }
}