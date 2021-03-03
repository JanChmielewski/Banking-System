package pl.janchmielewski.menu.options;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.menu.LoggedInMenu;

public abstract class LoginOption implements MenuOption {

    @Override
    public void execute() {
        new LoggedInMenu().showMenu();
    }

    @Override
    public String description() {
        return "Login";
    }
}
