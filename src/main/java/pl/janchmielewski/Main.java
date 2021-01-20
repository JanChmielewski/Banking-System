package pl.janchmielewski;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.menu.AbstractCommandPatternMenu;
import pl.janchmielewski.menu.MainMenu;
import pl.janchmielewski.menu.options.MenuOption;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        UsersDAO usersDAO = new UsersDAO();
        AccountDAO accountDAO = new AccountDAO();
//        menu.menu(usersDAO, accountDAO);
        AbstractCommandPatternMenu newMenu = new MainMenu();
        newMenu.showMenu();
    }
}
