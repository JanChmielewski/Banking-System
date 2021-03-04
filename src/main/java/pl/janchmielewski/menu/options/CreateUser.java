package pl.janchmielewski.menu.options;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.model.User;
import pl.janchmielewski.service.CreateUserAccount;

public class CreateUser implements MenuOption {

    @Override
    public void execute(UsersDAO usersDAO, AccountDAO accountDAO, User user, UsersDAO users) {
        CreateUserAccount createUserAccount = new CreateUserAccount();
        usersDAO.addUser(createUserAccount.userAccountCreator());
    }

    @Override
    public String description() {
        return "Create User";
    }
}
