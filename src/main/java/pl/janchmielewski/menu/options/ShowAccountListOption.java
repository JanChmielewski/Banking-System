package pl.janchmielewski.menu.options;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.service.ShowAccountList;
import pl.janchmielewski.service.UserInterface;

public class ShowAccountListOption implements pl.janchmielewski.menu.options.MenuOption {
    @Override
    public void execute(UsersDAO usersDAO, AccountDAO accountDAO) {
        ShowAccountList showAccountList = new ShowAccountList();
        UserInterface ui = new UserInterface();
        try {
            showAccountList.showAccountList(accountDAO);
        } catch (RuntimeException e) {
            ui.showMessage(e.getMessage());
        }
    }

    @Override
    public String description() {
        return "Show account list";
    }
}
