package pl.janchmielewski.menu.options;

import pl.janchmielewski.World;
import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.service.ChangeLoginData;

public class ChangeEmailOption implements MenuOption {
    @Override
    public void execute(World world) {
        ChangeLoginData changeLoginData = new ChangeLoginData();
        changeLoginData.emailChanger(world.getUsersDAO());
    }

    @Override
    public String description() {
        return "Change e-mail address";
    }
}
