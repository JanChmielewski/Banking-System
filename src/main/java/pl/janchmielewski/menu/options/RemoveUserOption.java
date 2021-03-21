package pl.janchmielewski.menu.options;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.menu.MainMenu;
import pl.janchmielewski.service.RemoveUser;

public class RemoveUserOption implements MenuOption{
    @Override
    public void execute(UsersDAO usersDAO, AccountDAO accountDAO) {

        try {
            RemoveUser removeUser = new RemoveUser();
            removeUser.userRemover(usersDAO);

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        new MainMenu().showMenu(usersDAO, accountDAO);
    }

    @Override
    public String description() {
        return "Remove user";
    }
}
