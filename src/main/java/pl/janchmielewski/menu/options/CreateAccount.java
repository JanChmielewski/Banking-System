package pl.janchmielewski.menu.options;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.model.User;
import pl.janchmielewski.service.AccountGenerator;

public class CreateAccount implements  MenuOption {

    @Override
    public void execute(UsersDAO usersDAO, AccountDAO accountDAO, User user, UsersDAO users) {
        AccountGenerator accountGenerator = new AccountGenerator();
        user.setAccountNumber(accountGenerator.accountGenerator(usersDAO, accountDAO));
    }


    @Override
    public String description() {
        return "Generate Account";
    }
}
