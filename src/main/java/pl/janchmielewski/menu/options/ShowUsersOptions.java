package pl.janchmielewski.menu.options;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.service.ShowUsersList;

public class ShowUsersOptions implements MenuOption {


    @Override
    public void execute(UsersDAO usersDAO, AccountDAO accountDAO) {
        ShowUsersList showUsersList = new ShowUsersList();
        showUsersList.showUsersList(usersDAO);
    }

    @Override
    public String description() {
        return "Show the users list";
    }
}
