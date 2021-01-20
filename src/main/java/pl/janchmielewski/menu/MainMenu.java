package pl.janchmielewski.menu;

import pl.janchmielewski.menu.options.CreateUserOption;
import pl.janchmielewski.menu.options.LoginOption;
import pl.janchmielewski.menu.options.MenuOption;
import pl.janchmielewski.menu.options.ShowUsersOption;

import java.util.ArrayList;
import java.util.List;

public class MainMenu extends AbstractCommandPatternMenu {

    private List<MenuOption> options;

    public MainMenu() {
        this.options = new ArrayList<>();
        options.add(new ShowUsersOption());
        options.add(new CreateUserOption());
        options.add(new LoginOption());
    }

    @Override
    protected List<MenuOption> getOptions() {
        return options;
    }

    @Override
    protected String getBackOption() {
        return "Quit";
    }
}
