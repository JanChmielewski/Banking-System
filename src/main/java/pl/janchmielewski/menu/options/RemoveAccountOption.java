package pl.janchmielewski.menu.options;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.service.RemoveAccount;

public class RemoveAccountOption implements MenuOption {

    @Override
    public void execute(UsersDAO usersDAO, AccountDAO accountDAO) {
        RemoveAccount removeAccount = new RemoveAccount();

        try {
            removeAccount.accountRemover(accountDAO, usersDAO);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String description() {
        return "Remove account";
    }
}
