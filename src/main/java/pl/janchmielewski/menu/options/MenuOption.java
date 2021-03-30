package pl.janchmielewski.menu.options;

import pl.janchmielewski.World;
import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;

public interface MenuOption {

    void execute(World world);

    String description();
}
