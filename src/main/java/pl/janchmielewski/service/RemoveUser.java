package pl.janchmielewski.service;

import pl.janchmielewski.dao.UsersDAO;

public class RemoveUser {

    public void userRemover(UsersDAO usersDAO) {
        UserInterface ui = new UserInterface();
        usersDAO.removeUser(usersDAO.getLoggedUser());
        ui.showMessage("User has been removed");
    }

}
