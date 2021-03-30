package pl.janchmielewski;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.service.UserInterface;

public class World {

    AccountDAO accountDAO = new AccountDAO();
    UsersDAO usersDAO = new UsersDAO();
    UserInterface userInterface = new UserInterface();

    public World(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    public World(UserInterface userInterface) {
        this.userInterface = userInterface;
    }

    public World(UsersDAO usersDAO) {
        this.usersDAO = usersDAO;
    }

    public World() {

    }

    public AccountDAO getAccountDAO() {
        return accountDAO;
    }

    public UsersDAO getUsersDAO() {
        return usersDAO;
    }

    public UserInterface getUserInterface() {
        return userInterface;
    }
}
