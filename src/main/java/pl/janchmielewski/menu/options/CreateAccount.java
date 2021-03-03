package pl.janchmielewski.menu.options;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.service.AccountGenerator;

public abstract class CreateAccount implements  MenuOption {

    @Override
    public void execute(UsersDAO usersDAO, AccountDAO accountDAO) {
        AccountGenerator accountGenerator = new AccountGenerator();
        accountGenerator.accountGenerator(usersDAO, accountDAO);
    }


    @Override
    public String description() {
        return "Generate Account";
    }
}
