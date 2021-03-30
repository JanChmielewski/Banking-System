package pl.janchmielewski.menu.options;

import pl.janchmielewski.World;

import pl.janchmielewski.service.ChangeLoginData;

public class ChangePasswordOption implements MenuOption {
    @Override
    public void execute(World world) {
        ChangeLoginData changeLoginData = new ChangeLoginData();
        changeLoginData.passwordChanger(world);
    }

    @Override
    public String description() {
        return "Change password";
    }
}
