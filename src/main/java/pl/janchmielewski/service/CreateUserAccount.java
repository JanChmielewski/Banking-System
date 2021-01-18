package pl.janchmielewski.service;

import pl.janchmielewski.model.User;

import java.util.Scanner;

public class CreateUserAccount {

    String fullName, emailAddress, phoneNumber, password;

    public User userAccountCreator() {

        Scanner in = new Scanner(System.in);

        System.out.println("What's the full name of the owner of the account?");
        fullName = in.nextLine();
        System.out.println("What's the e-mail address?");
        emailAddress = in.nextLine();
        System.out.println("What's the phone number?");
        phoneNumber = in.nextLine();
        System.out.println("What's the password");
        password = in.nextLine();

        User user = new User(fullName, emailAddress, phoneNumber, password);

        System.out.println("You created user: [Name: " + fullName + "," + " Email Address: " + emailAddress + "," + " Phone number: " + phoneNumber +  "," + " Password: " + password + "]");

        return user;
    }
}
