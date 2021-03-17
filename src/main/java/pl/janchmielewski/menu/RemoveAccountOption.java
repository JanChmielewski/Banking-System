package pl.janchmielewski.menu;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.menu.options.MenuOption;
import pl.janchmielewski.model.User;
import pl.janchmielewski.service.RemoveAccount;

public class RemoveAccountOption implements MenuOption {
    @Override
    public User execute(UsersDAO usersDAO, AccountDAO accountDAO) {
        RemoveAccount removeAccount = new RemoveAccount();
        User user = usersDAO.loggedUser(usersDAO, accountDAO);
        removeAccount.accountRemover(accountDAO, user);
        return user;
    }

    @Override
    public String description() {
        return "Remove account";
    }
}
