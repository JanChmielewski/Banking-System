package pl.janchmielewski.service;

import pl.janchmielewski.World;

public class ChangeLoginData {

    public void passwordChanger(World world) {

        String newPassword = world.getUserInterface().getNewUserPasswordWithConfirmation();
        world.getUsersDAO().getLoggedUser().setPassword(newPassword);
    }

    public void emailChanger(World world) {
        String newEmail = world.getUserInterface().getNewUserEmailWithConfirmation();
        world.getUsersDAO().getLoggedUser().setEmailAddress(newEmail);
    }
}
