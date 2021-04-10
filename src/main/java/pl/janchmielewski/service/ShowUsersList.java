package pl.janchmielewski.service;

import pl.janchmielewski.World;
import pl.janchmielewski.model.User;

public class ShowUsersList {

    public void showUsersList(World world) {

        if (world.getUsersDAO().ifEmpty()) {
            world.getUserInterface().showMessage("There are no users at the moment.");
        } else {
            for (int i = 0; i < world.getUsersDAO().size(); i++) {
                User user = world.getUsersDAO().getUser(i);
                world.getUserInterface().showMessage(user);
            }
        }
    }
}
