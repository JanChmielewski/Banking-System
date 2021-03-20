package pl.janchmielewski.menu.options;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.service.ShowAccountList;

public class ShowAccountListOption implements pl.janchmielewski.menu.options.MenuOption {
    @Override
    public void execute(UsersDAO usersDAO, AccountDAO accountDAO) {
        ShowAccountList showAccountList = new ShowAccountList();
        showAccountList.showAccountList(accountDAO);
    }

    @Override
    public String description() {
        return "Show account list";
    }
}
