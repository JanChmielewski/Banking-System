package pl.janchmielewski.menu.options;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.model.User;

public class ShowUsersOptions implements MenuOption {

    @Override
    public void execute(UsersDAO usersDAO, AccountDAO accountDAO, User user, UsersDAO users) {
        for (int i = 0; i < usersDAO.size(); i++) {
            user = usersDAO.getUser(i);
            System.out.println(user);
        }
    }

    @Override
    public String description() {
        return "Show the users list";
    }
}
