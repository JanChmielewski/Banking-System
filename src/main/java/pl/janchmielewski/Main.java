package pl.janchmielewski;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.menu.AbstractCommandPatternMenu;
import pl.janchmielewski.menu.MainMenu;
import pl.janchmielewski.model.User;

public class Main {
    private static User user;
    private static UsersDAO users;

    public static void main(String[] args) {
        World world = new World();

        AbstractCommandPatternMenu menu1 = new MainMenu();
        menu1.showMenu(world);
    }
}
