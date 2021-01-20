package pl.janchmielewski.service;

import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.model.User;

import java.util.Scanner;

public class ChangeLoginData {

    public void passwordChanger(UsersDAO users){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter user's e-mail address: ");
        String emailVerification = in.nextLine();
        System.out.print("Enter user's password: ");
        String passwordVerification = in.nextLine();

        UserVerifier userVerifier = new UserVerifier();
        User user = userVerifier.findUser(users, emailVerification, passwordVerification);
        if (user == null) {
            System.out.println("Invalid login credentials.");
        } else {
            System.out.print("Enter new password: ");
            String newPassword = in.nextLine();

            System.out.print("Confirm new password: ");

            if (newPassword.equals(in.nextLine())) {
                user.setPassword(newPassword);
                System.out.println("Password has been changed.");
            } else {
                System.out.println("Passwords are not equal.");
            }
        }
    }

    public void emailChanger(UsersDAO users) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter user's e-mail address: ");
        String emailVerification = in.nextLine();
        System.out.print("Enter user's password: ");
        String passwordVerification = in.nextLine();

        UserVerifier userVerifier = new UserVerifier();
        User user = userVerifier.findUser(users, emailVerification, passwordVerification);
        if (user == null) {
            System.out.println("Invalid login credentials.");
        } else {
            System.out.print("Enter new mail address: ");
            String newEmail = in.nextLine();

            System.out.print("Confirm new email address: ");

            if (newEmail.equals(in.nextLine())) {
                user.setEmailAddress(newEmail);
                System.out.println("Email address has been changed.");
            } else {
                System.out.println("Emails addresses are not equal.");
            }
        }
    }
}
