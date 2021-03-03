package pl.janchmielewski.menu.options;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.model.User;

public abstract class ShowUsersOptions implements MenuOption {

    @Override
    public void execute(UsersDAO usersDAO, AccountDAO accountDAO) {
        for (int i = 0; i < usersDAO.size(); i++) {
            User user = usersDAO.getUser(i);
            System.out.println(user);
        }
    }

    @Override
    public String description() {
        return "Show the users list";
    }
}
