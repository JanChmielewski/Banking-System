package pl.janchmielewski.menu.options;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.model.User;
import pl.janchmielewski.service.RemoveUser;

public class RemoveUserOption implements MenuOption{
    @Override
    public User execute(UsersDAO usersDAO, AccountDAO accountDAO) {
        try {
            RemoveUser removeUser = new RemoveUser();
            removeUser.userRemover(usersDAO, accountDAO);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public String description() {
        return "Remove user";
    }
}
