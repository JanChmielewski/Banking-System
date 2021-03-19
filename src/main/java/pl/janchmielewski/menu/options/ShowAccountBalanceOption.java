package pl.janchmielewski.menu.options;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.service.ShowAccountBalance;

public class ShowAccountBalanceOption implements MenuOption {
    @Override
    public void execute(UsersDAO usersDAO, AccountDAO accountDAO) {
        ShowAccountBalance showAccountBalance = new ShowAccountBalance();
        showAccountBalance.showAccountBalance(usersDAO, accountDAO);
    }

    @Override
    public String description() {
        return "Show account balance";
    }
}
