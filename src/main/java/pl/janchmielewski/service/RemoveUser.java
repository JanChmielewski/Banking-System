package pl.janchmielewski.service;

import pl.janchmielewski.World;

public class RemoveUser {

    public void userRemover(World world) {
        world.getUsersDAO().removeUser(world.getUsersDAO().getLoggedUser());
        world.getUserInterface().showMessage("User has been removed");
    }

}
