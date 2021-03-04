package pl.janchmielewski.menu.options;

import pl.janchmielewski.controller.EmailAndPasswordController;
import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.menu.LoggedInMenu;
import pl.janchmielewski.model.User;
import pl.janchmielewski.service.UserVerifier;

// dodać logikę logowania
// usunąć logikę logowania z pozostałych klas

public class LoginOption implements MenuOption {

    @Override
    public void execute(UsersDAO usersDAO, AccountDAO accountDAO, User user, UsersDAO users) {

        UserVerifier userVerifier = new UserVerifier();
        EmailAndPasswordController emailAndPasswordController = new EmailAndPasswordController();
        user = userVerifier.findUser(usersDAO, emailAndPasswordController.getUserEmail(), emailAndPasswordController.getUserPassword());
        if (user == null) {
            System.out.println("Invalid login credentials.");
        } else {
            new LoggedInMenu().showMenu(usersDAO, accountDAO, user, users);
        }
    }

    @Override
    public String description() {
        return "Login";
    }
}
