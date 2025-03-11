package com.bridgelabz.userregistration;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class UserRegistrationRegexTest {

    // First Name
    @Test
    void testValidFirstName_Happy() {
        assertDoesNotThrow(() -> UserRegistrationRegex.validate("John", UserRegistrationRegex.validateFirstName,
                new InvalidFirstNameException("Invalid First Name")));
    }

    @Test
    void testValidFirstName_Sad() {
        assertThrows(InvalidFirstNameException.class, () ->
                UserRegistrationRegex.validate("jo", UserRegistrationRegex.validateFirstName,
                        new InvalidFirstNameException("Invalid First Name")));
    }

    // Last Name
    @Test
    void testValidLastName_Happy() {
        assertDoesNotThrow(() -> UserRegistrationRegex.validate("Smith", UserRegistrationRegex.validateLastName,
                new InvalidLastNameException("Invalid Last Name")));
    }

    @Test
    void testValidLastName_Sad() {
        assertThrows(InvalidLastNameException.class, () ->
                UserRegistrationRegex.validate("sm", UserRegistrationRegex.validateLastName,
                        new InvalidLastNameException("Invalid Last Name")));
    }

    // Mobile Number
    @Test
    void testValidMobileNumber_Happy() {
        assertDoesNotThrow(() -> UserRegistrationRegex.validate("91 9876543210", UserRegistrationRegex.validateMobileNumber,
                new InvalidMobileNumberException("Invalid Mobile Number")));
    }

    @Test
    void testValidMobileNumber_Sad() {
        assertThrows(InvalidMobileNumberException.class, () ->
                UserRegistrationRegex.validate("919876543210", UserRegistrationRegex.validateMobileNumber,
                        new InvalidMobileNumberException("Invalid Mobile Number")));
    }

    // Password
    @Test
    void testValidPassword_Happy() {
        assertDoesNotThrow(() -> UserRegistrationRegex.validate("Abcdef@123", UserRegistrationRegex.validatePassword,
                new InvalidPasswordException("Invalid Password")));
    }

    @Test
    void testValidPassword_Sad() {
        assertThrows(InvalidPasswordException.class, () ->
                UserRegistrationRegex.validate("abcdef123", UserRegistrationRegex.validatePassword,
                        new InvalidPasswordException("Invalid Password")));
    }

    // Parameterized Test for Multiple Email validations
    @ParameterizedTest
    @ValueSource(strings = {
            "abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.com",
            "abc-100@abc.net",
            "abc.100@abc.com.au",
            "abc@1.com",
            "abc@gmail.com.com",
            "abc+100@gmail.com"
    })
    void testValidEmail_Happy(String email) {
        assertDoesNotThrow(() -> UserRegistrationRegex.validate(email, UserRegistrationRegex.validateEmail,
                new InvalidEmailException("Invalid Email")));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "abc",
            "abc@.com.my",
            "abc123@gmail.a",
            "abc123@.com",
            "abc123@.com.com",
            ".abc@abc.com",
            "abc()*@gmail.com",
            "abc@%*.com",
            "abc..2002@gmail.com",
            "abc.@gmail.com",
            "abc@abc@gmail.com",
            "abc@gmail.com.1a",
            "abc@gmail.com.aa.au"
    })
    void testValidEmail_Sad(String email) {
        assertThrows(InvalidEmailException.class, () ->
                UserRegistrationRegex.validate(email, UserRegistrationRegex.validateEmail,
                        new InvalidEmailException("Invalid Email")));
    }
}
