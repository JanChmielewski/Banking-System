package pl.janchmielewski;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.menu.AbstractCommandPatternMenu;
import pl.janchmielewski.menu.MainMenu;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        UsersDAO usersDAO = new UsersDAO();
        AccountDAO accountDAO = new AccountDAO();
//        menu.menu(usersDAO, accountDAO);

        AbstractCommandPatternMenu menu1 = new MainMenu();
        menu1.showMenu();



    }
}
