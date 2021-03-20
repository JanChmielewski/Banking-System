package pl.janchmielewski.menu.options;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.service.CreateUserAccount;

public class CreateUserOption implements MenuOption {

    @Override
    public void execute(UsersDAO usersDAO, AccountDAO accountDAO) {
        CreateUserAccount createUserAccount = new CreateUserAccount();
        usersDAO.addUser(createUserAccount.userAccountCreator());
    }

    @Override
    public String description() {
        return "Create User";
    }
}
