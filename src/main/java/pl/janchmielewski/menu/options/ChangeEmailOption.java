package pl.janchmielewski.menu.options;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.service.ChangeLoginData;

public class ChangeEmailOption implements MenuOption {
    @Override
    public void execute(UsersDAO usersDAO, AccountDAO accountDAO) {
        ChangeLoginData changeLoginData = new ChangeLoginData();
        changeLoginData.emailChanger(usersDAO);
    }

    @Override
    public String description() {
        return "Change e-mail address";
    }
}
