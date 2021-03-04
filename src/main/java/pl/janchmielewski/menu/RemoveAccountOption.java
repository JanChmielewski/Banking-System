package pl.janchmielewski.menu;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.menu.options.MenuOption;
import pl.janchmielewski.model.User;
import pl.janchmielewski.service.RemoveAccount;

public class RemoveAccountOption implements MenuOption {
    @Override
    public void execute(UsersDAO usersDAO, AccountDAO accountDAO, User user, UsersDAO users) {
        RemoveAccount removeAccount = new RemoveAccount();
        removeAccount.accountRemover(users, accountDAO, user);
    }

    @Override
    public String description() {
        return "Remove account";
    }
}
