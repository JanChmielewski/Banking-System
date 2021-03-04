package pl.janchmielewski.menu.options;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.model.User;

public interface MenuOption {

    void execute(UsersDAO usersDAO, AccountDAO accountDAO, User user, UsersDAO users);

    String description();
}
