package pl.janchmielewski.menu.options;

import pl.janchmielewski.menu.LoggedInMenu;

public class LoginOption implements MenuOption {
    @Override
    public void execute() {
        new LoggedInMenu().showMenu();
    }

    @Override
    public String description() {
        return "Login";
    }
}
