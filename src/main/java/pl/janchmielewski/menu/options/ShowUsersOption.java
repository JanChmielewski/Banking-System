package pl.janchmielewski.menu.options;

import pl.janchmielewski.World;
import pl.janchmielewski.service.ShowUsersList;

public class ShowUsersOption implements MenuOption {


    @Override
    public void execute(World world) {
        ShowUsersList showUsersList = new ShowUsersList();
        showUsersList.showUsersList(world);
    }

    @Override
    public String description() {
        return "Show the users list";
    }
}
