package pl.janchmielewski.menu.options;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.menu.MainMenu;
import pl.janchmielewski.service.RemoveUser;
import pl.janchmielewski.service.UserInterface;

public class RemoveUserOption implements MenuOption {
    @Override
    public void execute(UsersDAO usersDAO, AccountDAO accountDAO) {

        UserInterface ui = new UserInterface();

        try {
            RemoveUser removeUser = new RemoveUser();
            removeUser.userRemover(usersDAO);

        } catch (RuntimeException e) {
            ui.showMessage(e.getMessage());
        }

        new MainMenu().showMenu(usersDAO, accountDAO);
    }

    @Override
    public String description() {
        return "Remove user";
    }
}
