package pl.janchmielewski.menu;

import pl.janchmielewski.menu.options.*;

import java.util.ArrayList;
import java.util.List;

public class LoggedInMenu extends AbstractCommandPatternMenu {

    private List<MenuOption> options;

    public LoggedInMenu() {
        this.options = new ArrayList<>();
        options.add(new GenerateAccount());
        options.add(new RemoveAccountOption());
        options.add(new RemoveUserOption());
        options.add(new ShowAccountBalanceOption());
        options.add(new ChangeEmailOption());
        options.add(new ChangePasswordOption());
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
