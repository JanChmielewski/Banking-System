package pl.janchmielewski.service;

import pl.janchmielewski.controller.EmailAndPasswordController;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.menu.options.MenuOption;
import pl.janchmielewski.model.User;

import java.util.Scanner;

public class ChangeLoginData {

    public void passwordChanger(UsersDAO users) {
        UserVerifier userVerifier = new UserVerifier();
        EmailAndPasswordController emailAndPasswordController = new EmailAndPasswordController();
        EmailAndPasswordController.UserCredentials userCredentials = emailAndPasswordController.getUserCredentials();
        User user = userVerifier.findUser(users, userCredentials.getEmail(), userCredentials.getPassword());
        if (user == null) {
            throw new RuntimeException("Invalid user credentials");
        }
        String newPassword = emailAndPasswordController.getUserPasswordWithConfirmation();
        user.setPassword(newPassword);
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
