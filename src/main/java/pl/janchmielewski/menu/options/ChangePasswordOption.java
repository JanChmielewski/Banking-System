package pl.janchmielewski.menu.options;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.service.ChangeLoginData;

public class ChangePasswordOption implements MenuOption {
    @Override
    public void execute(UsersDAO usersDAO, AccountDAO accountDAO) {
        ChangeLoginData changeLoginData = new ChangeLoginData();
        changeLoginData.passwordChanger(usersDAO);
    }

    @Override
    public String description() {
        return "Change password";
    }
}
