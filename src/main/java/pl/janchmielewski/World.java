package pl.janchmielewski;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.service.UI;

public class World {

    AccountDAO accountDAO = new AccountDAO();
    UsersDAO usersDAO = new UsersDAO();
    UI userInterface;

    public World(UI userInterface) {
        this.userInterface = userInterface;
    }

    public AccountDAO getAccountDAO() {
        return accountDAO;
    }

    public UsersDAO getUsersDAO() {
        return usersDAO;
    }

    public UI getUserInterface() {
        return userInterface;
    }
}
