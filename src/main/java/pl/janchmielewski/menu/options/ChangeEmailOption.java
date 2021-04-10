package pl.janchmielewski.menu.options;

import pl.janchmielewski.World;
import pl.janchmielewski.service.ChangeLoginData;

public class ChangeEmailOption implements MenuOption {
    @Override
    public void execute(World world) {
        ChangeLoginData changeLoginData = new ChangeLoginData();
        changeLoginData.emailChanger(world);
    }

    @Override
    public String description() {
        return "Change e-mail address";
    }
}
