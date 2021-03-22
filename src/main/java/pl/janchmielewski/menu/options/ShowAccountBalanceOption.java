package pl.janchmielewski.menu.options;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.service.ShowAccountBalance;
import pl.janchmielewski.service.UserInterface;

public class ShowAccountBalanceOption implements MenuOption {
    @Override
    public void execute(UsersDAO usersDAO, AccountDAO accountDAO) {
        ShowAccountBalance showAccountBalance = new ShowAccountBalance();
        UserInterface ui = new UserInterface();

        try {
            showAccountBalance.showAccountBalance(usersDAO, accountDAO);
        } catch (RuntimeException e) {
            ui.showMessage(e.getMessage());
        }
    }

    @Override
    public String description() {
        return "Show account balance";
    }
}
