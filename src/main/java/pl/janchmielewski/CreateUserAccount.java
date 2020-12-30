package pl.janchmielewski;

import java.util.Scanner;

public class CreateUserAccount {

    void userAccount() {

        Scanner in = new Scanner(System.in);

        System.out.println("What's the full name of the owner of the account?");
        String fullName = in.nextLine();
        System.out.println("What's the e-mail address?");
        String emailAddress = in.nextLine();
        System.out.println("What's the phone number?");
        String phoneNumber = in.nextLine();
        System.out.println("Enter password: ");
        String password = in.nextLine();

        System.out.println("Full name: " + fullName);
        System.out.println("e-mail address: " + emailAddress);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Password: " + password);

    }
}
