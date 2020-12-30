package pl.janchmielewski;

import java.util.Scanner;

public class CreateUserAccount {

    String fullName, emailAddress, phoneNumber, password;

    void userAccountCrator() {

        Scanner in = new Scanner(System.in);

        System.out.println("What's the full name of the owner of the account?");
        fullName = in.nextLine();
        System.out.println("What's the e-mail address?");
        emailAddress = in.nextLine();
        System.out.println("What's the phone number?");
        phoneNumber = in.nextLine();
        System.out.println("Enter password: ");
        password = in.nextLine();

    }
}
