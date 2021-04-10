package pl.janchmielewski;

import pl.janchmielewski.menu.AbstractCommandPatternMenu;
import pl.janchmielewski.menu.MainMenu;
import pl.janchmielewski.service.UI;

public class Main {

    public static void main(String[] args) {
        UI userInterface = new UI();
        World world = new World(userInterface);

        AbstractCommandPatternMenu menu1 = new MainMenu();
        menu1.showMenu(world);
    }
}
