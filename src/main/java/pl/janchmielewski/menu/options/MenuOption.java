package pl.janchmielewski.menu.options;

import pl.janchmielewski.World;

public interface MenuOption {

    void execute(World world);

    String description();
}
