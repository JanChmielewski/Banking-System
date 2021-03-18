package pl.janchmielewski.menu.options;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;

public interface MenuOption {

    void execute(UsersDAO usersDAO, AccountDAO accountDAO);

    String description();
}
