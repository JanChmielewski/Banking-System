package pl.janchmielewski.menu;

import pl.janchmielewski.menu.options.CreateAccount;
import pl.janchmielewski.menu.options.CreateUserOption;
import pl.janchmielewski.menu.options.MenuOption;
import pl.janchmielewski.menu.options.ShowUsersOption;

import java.util.ArrayList;
import java.util.List;

public class LoggedInMenu extends AbstractCommandPatternMenu {

    private List<MenuOption> options;

    public LoggedInMenu() {
        this.options = new ArrayList<>();
        options.add(new CreateAccount());
    }

    @Override
    protected List<MenuOption> getOptions() {
        return options;
    }

    @Override
    protected String getBackOption() {
        return "Logout";
    }
}