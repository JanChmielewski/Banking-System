package pl.janchmielewski.service;

import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.model.User;

public class ShowUsersList {

    public void showUsersList(UsersDAO usersDAO) {
        for (int i = 0; i < usersDAO.size(); i++) {
            User user = usersDAO.getUser(i);
            System.out.println(user);
        }
    }

}
