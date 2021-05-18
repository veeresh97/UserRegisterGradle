package com.UserRegistrater;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    //name validation
    public static boolean validName(String name) {
        String regex = "^[A-Z][a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
    //email validation
    public static boolean emailValid(String email) {
        String regx = "[a-zA-Z-\\+]+(\\.[a-zA-Z0-9-]+)*@[A-Za-z-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter firstName : ");
        String firstName = scan.nextLine();
        System.out.println("First name :"+validName(firstName));
        if(validName(firstName))
            System.out.println("Firstname is valid");
        System.out.println("Enter last  Name: ");
        String lastName = scan.nextLine();
        System.out.println("Last name :"+validName(lastName));
        if(validName(lastName))
            System.out.println("Lastname is valid");
        System.out.println("Enter your email :");
        String email = scan.nextLine();
        if(emailValid(email))
            System.out.println("email is correct");
        else
            System.out.println("invalid");
    }
}
