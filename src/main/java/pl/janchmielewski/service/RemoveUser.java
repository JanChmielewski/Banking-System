package pl.janchmielewski.service;

import pl.janchmielewski.dao.UsersDAO;

public class RemoveUser {

    public void userRemover(UsersDAO usersDAO) {

        if (usersDAO.getLoggedUser() == null) {
            throw new RuntimeException("Invalid login credentials.");
        }
        usersDAO.removeUser(usersDAO.getLoggedUser());
        System.out.println("User has been removed.");

    }

}
