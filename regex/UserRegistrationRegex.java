package com.bridgelabz.userregistration;

import java.util.Scanner;

// Custom Exceptions for Each Validation Type
class InvalidFirstNameException extends Exception {
    public InvalidFirstNameException(String message) {
        super(message);
    }
}

class InvalidLastNameException extends Exception {
    public InvalidLastNameException(String message) {
        super(message);
    }
}

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

class InvalidMobileNumberException extends Exception {
    public InvalidMobileNumberException(String message) {
        super(message);
    }
}

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

// Main Class
public class UserRegistrationRegex {

    // Lambda Expressions for Validation
    public static final Validation validateFirstName = (name) -> name.matches("^[A-Z][a-z]{2,}$");
    public static final Validation validateLastName = (name) -> name.matches("^[A-Z][a-z]{2,}$");
    public static final Validation validateMobileNumber = (number) -> number.matches("^[0-9]{1,2}\\s\\d{10}$");
    public static final Validation validateEmail = (email) -> email.matches("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,3}){1,2}$");
    public static final Validation validatePassword = (password) -> password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[\\W_])(?!.*[\\W_]{2,}).{8,}$");

    // Functional Interface for Validation
    @FunctionalInterface
    interface Validation {
        boolean validate(String input);
    }

    // Validation Method
    public static void validate(String input, Validation validator, Exception exception) throws Exception {
        if (!validator.validate(input)) {
            throw exception;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter First Name: ");
            validate(input.nextLine(), validateFirstName, new InvalidFirstNameException("Invalid First Name"));

            System.out.print("Enter Last Name: ");
            validate(input.nextLine(), validateLastName, new InvalidLastNameException("Invalid Last Name"));

            System.out.print("Enter Mobile Number (format: countryCode space number): ");
            validate(input.nextLine(), validateMobileNumber, new InvalidMobileNumberException("Invalid Mobile Number "));

            System.out.print("Enter Email: ");
            validate(input.nextLine(), validateEmail, new InvalidEmailException("Invalid Email"));

            System.out.print("Enter Password: ");
            validate(input.nextLine(), validatePassword, new InvalidPasswordException("Invalid Password"));

            System.out.println("User details validated");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        input.close();
    }
}
