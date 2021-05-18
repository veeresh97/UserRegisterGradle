package com.UserRegistrater;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean validFirstName(String name) {
        String regex = "^[A-Z][a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter firstName : ");
        String firstName = scan.nextLine();
        System.out.println("First name :"+validFirstName(firstName));
        if(validFirstName(firstName))
            System.out.println("name is valid");
        else
            System.out.println("name is invalid");
    }
}