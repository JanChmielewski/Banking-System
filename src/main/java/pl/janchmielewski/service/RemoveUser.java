package pl.janchmielewski.service;

import pl.janchmielewski.controller.EmailAndPasswordController;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.model.User;

public class RemoveUser {

    public void userRemover(UsersDAO users) {

        EmailAndPasswordController emailAndPasswordController = new EmailAndPasswordController();
        UserVerifier userVerifier = new UserVerifier();
        User user = userVerifier.findUser(users, emailAndPasswordController.getUserEmail(), emailAndPasswordController.getUserPassword());
        if (user == null) {
            throw new RuntimeException("Invalid login credentials.");
        }
        users.removeUser(user);
        System.out.println("User has been removed.");

    }
}
