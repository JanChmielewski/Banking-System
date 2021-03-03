package pl.janchmielewski.menu;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.menu.options.CreateAccount;
import pl.janchmielewski.menu.options.LoginOption;
import pl.janchmielewski.menu.options.MenuOption;
import pl.janchmielewski.menu.options.ShowUsersOptions;

import java.util.ArrayList;
import java.util.List;

public class MainMenu extends AbstractCommandPatternMenu {

    private List<MenuOption> options;

    public MainMenu() {
        this.options = new ArrayList<>();
        options.add(new ShowUsersOptions() {
            @Override
            public void execute() {

            }
        });
        options.add(new CreateAccount() {
            @Override
            public void execute() {

            }
        });
        options.add(new LoginOption() {
            @Override
            public void execute(UsersDAO usersDAO, AccountDAO accountDAO) {

            }
        });
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
