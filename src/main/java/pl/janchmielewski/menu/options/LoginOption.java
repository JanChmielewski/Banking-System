package pl.janchmielewski.menu.options;

import pl.janchmielewski.World;
import pl.janchmielewski.menu.LoggedInMenu;
import pl.janchmielewski.model.User;
import pl.janchmielewski.service.ChangeLoginData;
import pl.janchmielewski.service.UserVerifier;


public class LoginOption implements MenuOption {

    @Override
    public void execute(World world) {

        UserVerifier userVerifier = new UserVerifier();

        User user = userVerifier.findUser(world.getUsersDAO(), world.getUserInterface().LoggingByEmail(), world.getUserInterface().LoggingByPassword());

        try {
            if (user == null) {
                world.getUserInterface().showMessage("You need to have an account to do this.");
            }  if (world.getUsersDAO().getUsers().contains(user.getEmailAddress())){
                world.getUserInterface().invalidUserCredentialsMessage();
                String answer = world.getUserInterface().forgotPassword().toLowerCase().trim();
                if (answer.equals("y")) {
                    ChangeLoginData changeLoginData = new ChangeLoginData();
                    changeLoginData.passwordChanger(world);
                }
                if (answer.equals("n")) {
                    world.getUserInterface().showMessage("");
                }
                if (!answer.equals("y")) {
                    world.getUserInterface().showMessage("Please select correct option.");
                } else {
                    world.getUsersDAO().setUserStatusLogged(user);
                    new LoggedInMenu().showMenu(world);
                }
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
