package pl.janchmielewski.service;

import pl.janchmielewski.World;

public class ChangeLoginData {

    public String passwordChanger(World world) {

        String newPassword = world.getUserInterface().getNewUserPasswordWithConfirmation();
        world.getUsersDAO().getLoggedUser().setPassword(newPassword);
        return newPassword;
    }

    public void emailChanger(World world) {
        String newEmail = world.getUserInterface().getNewUserEmailWithConfirmation();
        world.getUsersDAO().getLoggedUser().setEmailAddress(newEmail);
    }
}
