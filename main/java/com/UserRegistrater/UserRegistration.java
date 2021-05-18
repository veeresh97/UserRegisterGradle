package com.UserRegistrater;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean validName(String name) {
        String regex = "^[A-Z][a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter firstName : ");
        String firstName = scan.nextLine();
        System.out.println("First name :"+validName(firstName));
        System.out.println("Enter last  Name: ");
        String lastName = scan.nextLine();
        System.out.println("Last name :"+validName(lastName));
        if(validName(firstName))
            System.out.println("Firstname is valid");
        if(validName(lastName))
            System.out.println("Lastname is valid");
        else
            System.out.println("Invalid name");
    }
}