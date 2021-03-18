package pl.janchmielewski.menu;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.menu.options.MenuOption;
import pl.janchmielewski.model.User;
import pl.janchmielewski.service.RemoveAccount;

public class RemoveAccountOption implements MenuOption {
    @Override
    public void execute(UsersDAO usersDAO, AccountDAO accountDAO) {
        RemoveAccount removeAccount = new RemoveAccount();
        removeAccount.accountRemover(accountDAO, usersDAO.getLoggedUser());
    }

    @Override
    public String description() {
        return "Remove account";
    }
}
