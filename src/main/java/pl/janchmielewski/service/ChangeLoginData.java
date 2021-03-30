package pl.janchmielewski.service;

import pl.janchmielewski.World;
import pl.janchmielewski.controller.EmailAndPasswordController;
import pl.janchmielewski.dao.UsersDAO;

public class ChangeLoginData {

    public void passwordChanger(World world) {

        EmailAndPasswordController emailAndPasswordController = new EmailAndPasswordController();
        String newPassword = emailAndPasswordController.getNewUserPasswordWithConfirmation();
        world.getUsersDAO().getLoggedUser().setPassword(newPassword);
    }

    public void emailChanger(UsersDAO usersDAO) {
        EmailAndPasswordController emailAndPasswordController = new EmailAndPasswordController();
        String newEmail = emailAndPasswordController.getNewUserEmailWithConfirmation();
        usersDAO.getLoggedUser().setEmailAddress(newEmail);
    }
}
