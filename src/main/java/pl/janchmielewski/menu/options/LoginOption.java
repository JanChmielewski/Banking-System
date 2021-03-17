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
    public User execute(UsersDAO usersDAO, AccountDAO accountDAO) {

        UserVerifier userVerifier = new UserVerifier();
        EmailAndPasswordController emailAndPasswordController = new EmailAndPasswordController();
        User user = userVerifier.findUser(usersDAO, emailAndPasswordController.getUserEmail(), emailAndPasswordController.getUserPassword());
        if (user == null) {
            System.out.println("Invalid login credentials.");
        } else {
            new LoggedInMenu().showMenu(usersDAO, accountDAO);
            System.out.println(usersDAO.loggedUser(usersDAO, accountDAO));
        }
        return user;
    }

    @Override
    public String description() {
        return "Login";
    }
}
