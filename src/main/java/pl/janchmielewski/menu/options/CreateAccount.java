package pl.janchmielewski.menu.options;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.model.User;
import pl.janchmielewski.service.AccountGenerator;

public class CreateAccount implements  MenuOption {

    @Override
    public User execute(UsersDAO usersDAO, AccountDAO accountDAO) {
        AccountGenerator accountGenerator = new AccountGenerator();
        usersDAO.loggedUser(usersDAO, accountDAO).setAccountNumber(accountGenerator.accountGenerator(usersDAO, accountDAO));
        return null;
    }


    @Override
    public String description() {
        return "Generate Account";
    }
}
