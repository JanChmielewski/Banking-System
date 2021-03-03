package pl.janchmielewski.service;

import pl.janchmielewski.controller.EmailAndPasswordController;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.model.User;

public class ChangeLoginData {

    public void passwordChanger(UsersDAO users) {
        UserVerifier userVerifier = new UserVerifier();
        EmailAndPasswordController emailAndPasswordController = new EmailAndPasswordController();
        EmailAndPasswordController.UserCredentials userCredentials = emailAndPasswordController.getUserCredentials();
        User user = userVerifier.findUser(users, userCredentials.getEmail(), userCredentials.getPassword());

        if (user == null) {
            throw new RuntimeException("Invalid login credentials.");
        }
        String newPassword = emailAndPasswordController.getUserPasswordWithConfirmation();
        user.setPassword(newPassword);
    }

    public void emailChanger(UsersDAO users) {
        UserVerifier userVerifier = new UserVerifier();
        EmailAndPasswordController emailAndPasswordController = new EmailAndPasswordController();
        EmailAndPasswordController.UserCredentials userCredentials = emailAndPasswordController.getUserCredentials();
        User user = userVerifier.findUser(users, userCredentials.getEmail(), userCredentials.getPassword());

        if (user == null) {
            throw new RuntimeException("Invalid login credentials");
        }
        String newEmail = emailAndPasswordController.getUserEmailWithConfirmation();
        user.setEmailAddress(newEmail);
    }
}
