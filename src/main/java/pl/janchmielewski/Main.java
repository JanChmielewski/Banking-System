package pl.janchmielewski;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        UsersDAO usersDAO = new UsersDAO();
        AccountDAO accountDAO = new AccountDAO();
        menu.menu(usersDAO, accountDAO);
    }
}
