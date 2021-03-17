package pl.janchmielewski.menu.options;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.model.User;
import pl.janchmielewski.service.CreateUserAccount;

public class CreateUser implements MenuOption {

    @Override
    public User execute(UsersDAO usersDAO, AccountDAO accountDAO) {
        CreateUserAccount createUserAccount = new CreateUserAccount();
        usersDAO.addUser(createUserAccount.userAccountCreator());
        return null;
    }

    @Override
    public String description() {
        return "Create User";
    }
}
