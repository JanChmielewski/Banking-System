package pl.janchmielewski.service;

import pl.janchmielewski.dao.UsersDAO;

public class RemoveUser {

    public void userRemover(UsersDAO usersDAO) {
        usersDAO.removeUser(usersDAO.getLoggedUser());
        System.out.println("User has been removed.");

    }

}
