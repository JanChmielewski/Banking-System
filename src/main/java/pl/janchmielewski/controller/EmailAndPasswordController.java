package pl.janchmielewski.controller;

import java.util.Scanner;

public class EmailAndPasswordController {

    Scanner in = new Scanner(System.in);

    public String getUserEmail() {
        System.out.println("Enter user's e-mail address: ");
        String emailVerification = in.nextLine();
        return emailVerification;
    }

    public String getUserPassword() {
        System.out.print("Enter user's password: ");
        String passwordVerification = in.nextLine();
        return passwordVerification;
    }

    public String getNewUserPasswordWithConfirmation() {
        System.out.print("Enter new user's password: ");
        String passwordVerification = in.nextLine();

        System.out.print("Confirm new password: ");
        String passwordConfirmation = in.nextLine();
        if(passwordConfirmation.equals(passwordVerification)) {
            return passwordVerification;
        }
        throw new RuntimeException("Password are not equal.");
    }

    public String getNewUserEmailWithConfirmation()  {
        System.out.print("Enter new user's email address: ");
        String emailVerification = in.nextLine();

        System.out.print("Confirm new email address: ");
        String emailConfirmation = in.nextLine();
        if(emailConfirmation.equals(emailVerification)) {
            return emailVerification;
        }
        throw new RuntimeException("Email addresses are not equal.");
    }

}
