package pl.janchmielewski.service;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.model.User;

public class RemoveUser {

    public void userRemover(UsersDAO usersDAO, AccountDAO accountDAO) {

        if (usersDAO.loggedUser(usersDAO, accountDAO) == null) {
            throw new RuntimeException("Invalid login credentials.");
        }
        usersDAO.removeUser(usersDAO.loggedUser(usersDAO, accountDAO));
        System.out.println("User has been removed.");

    }

}
