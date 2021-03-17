package pl.janchmielewski.menu.options;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.model.User;
import pl.janchmielewski.service.ShowUsersList;

public class ShowUsersOptions implements MenuOption {


    @Override
    public User execute(UsersDAO usersDAO, AccountDAO accountDAO) {
        ShowUsersList showUsersList = new ShowUsersList();
        showUsersList.showUsersList(usersDAO);
        return null;
    }

    @Override
    public String description() {
        return "Show the users list";
    }
}
