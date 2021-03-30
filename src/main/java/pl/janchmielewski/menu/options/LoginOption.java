package pl.janchmielewski.menu.options;

import pl.janchmielewski.World;
import pl.janchmielewski.controller.EmailAndPasswordController;
import pl.janchmielewski.menu.LoggedInMenu;
import pl.janchmielewski.model.User;
import pl.janchmielewski.service.UserVerifier;

public class LoginOption implements MenuOption {

    @Override
    public void execute(World world) {

        UserVerifier userVerifier = new UserVerifier();
        EmailAndPasswordController emailAndPasswordController = new EmailAndPasswordController();

        User user = userVerifier.findUser(world.getUsersDAO(), emailAndPasswordController.getUserEmail(), emailAndPasswordController.getUserPassword());

        try {

            if (user == null) {
                world.getUserInterface().invalidUserCredentialsMessage();
            } else {
                world.getUsersDAO().setUserStatusLogged(user);
                new LoggedInMenu().showMenu(world);
            }
        } catch (RuntimeException e) {
            world.getUserInterface().showMessage(e.getMessage());
        }
    }

    @Override
    public String description() {
        return "Login";
    }
}
