package pl.janchmielewski.menu.options;

import pl.janchmielewski.World;

import pl.janchmielewski.menu.MainMenu;
import pl.janchmielewski.service.RemoveUser;

public class RemoveUserOption implements MenuOption {
    @Override
    public void execute(World world) {


        try {
            RemoveUser removeUser = new RemoveUser();
            removeUser.userRemover(world);

        } catch (RuntimeException e) {
            world.getUserInterface().showMessage(e.getMessage());
        }

        new MainMenu().showMenu(world);
    }

    @Override
    public String description() {
        return "Remove user";
    }
}
