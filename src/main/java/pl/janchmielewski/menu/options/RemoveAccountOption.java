package pl.janchmielewski.menu.options;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.service.RemoveAccount;
import pl.janchmielewski.service.UserInterface;

public class RemoveAccountOption implements MenuOption {

    @Override
    public void execute(UsersDAO usersDAO, AccountDAO accountDAO) {
        RemoveAccount removeAccount = new RemoveAccount();
        UserInterface ui = new UserInterface();

        try {
            removeAccount.accountRemover(accountDAO, usersDAO);
        } catch (RuntimeException e) {
            ui.showMessage(e.getMessage());
        }
    }

    @Override
    public String description() {
        return "Remove account";
    }
}
