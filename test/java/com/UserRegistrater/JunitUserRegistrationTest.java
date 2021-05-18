package com.UserRegistrater;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JunitUserRegistrationTest {
    private Assertions Assert;

    @Test
    public void nameValid() {
        UserRegistration checkName = new UserRegistration();
        Boolean mood = checkName.nameValid("Veeresh");
        Assert.assertEquals(true, mood);
    }

    @Test
    public void emailValid() {
        UserRegistration checkEmail = new UserRegistration();
        Boolean mood = checkEmail.emailValid("abcVeer@bl.co.in");
        Assert.assertEquals(true, mood);
    }

    @Test
    public void phoneValid() {
        UserRegistration checkPhone = new UserRegistration();
        Boolean mood = checkPhone.phoneValid("91 1234567890");
        Assert.assertEquals(true, mood);
    }

    @Test
    public void passwordValid() {
        UserRegistration checkPassword = new UserRegistration();
        Boolean mood = checkPassword.passwordValid("@1Veeresh");
        Assert.assertEquals(true, mood);
    }
    @Test
    public void givenMessage_whenNotSad_ShouldReturnHappy() {
        UserRegistration moodAnalyser = new UserRegistration();
        String mood = moodAnalyser.analyseMood("this is a Happy Message");
        Assert.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenMessage_whenSad_ShouldReturnSad() {
        UserRegistration moodAnalyser = new UserRegistration();
        String mood = moodAnalyser.analyseMood("this is a sad Message");
        Assert.assertEquals("SAD", mood);
    }
}

