package pl.janchmielewski.menu.options;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.service.ShowAccountList;

public class ShowAccountListOption implements pl.janchmielewski.menu.options.MenuOption {
    @Override
    public void execute(UsersDAO usersDAO, AccountDAO accountDAO) {
        ShowAccountList showAccountList = new ShowAccountList();
        try {
            showAccountList.showAccountList(accountDAO);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String description() {
        return "Show account list";
    }
}
