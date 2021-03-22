package pl.janchmielewski.service;

import pl.janchmielewski.controller.EmailAndPasswordController;
import pl.janchmielewski.dao.UsersDAO;

public class ChangeLoginData {

    public void passwordChanger(UsersDAO usersDAO) {

        EmailAndPasswordController emailAndPasswordController = new EmailAndPasswordController();
        String newPassword = emailAndPasswordController.getNewUserPasswordWithConfirmation();
        usersDAO.getLoggedUser().setPassword(newPassword);
    }

    public void emailChanger(UsersDAO usersDAO) {
        EmailAndPasswordController emailAndPasswordController = new EmailAndPasswordController();
        String newEmail = emailAndPasswordController.getNewUserEmailWithConfirmation();
        usersDAO.getLoggedUser().setEmailAddress(newEmail);
    }
}
