package pl.janchmielewski.service;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.model.User;

public class RemoveUser {

    public void userRemover(UsersDAO usersDAO, AccountDAO accountDAO, User user, UsersDAO users) {

        if (user == null) {
            throw new RuntimeException("Invalid login credentials.");
        }
        users.removeUser(user);
        System.out.println("User has been removed.");

    }

}
