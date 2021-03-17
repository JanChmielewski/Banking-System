package pl.janchmielewski.menu.options;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.model.User;

public interface MenuOption {

    User execute(UsersDAO usersDAO, AccountDAO accountDAO);

    String description();
}
