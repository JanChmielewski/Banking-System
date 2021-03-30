package pl.janchmielewski.menu.options;

import pl.janchmielewski.World;


public class CreateUserOption implements MenuOption {

    @Override
    public void execute(World world) {
        world.getUsersDAO().addUser(world.getUserInterface().createUser());
    }

    @Override
    public String description() {
        return "Create User";
    }
}
