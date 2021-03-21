package pl.janchmielewski.menu.options;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.service.AccountGenerator;

public class GenerateAccount implements  MenuOption {

    @Override
    public void execute(UsersDAO usersDAO, AccountDAO accountDAO) {
        AccountGenerator accountGenerator = new AccountGenerator();
        usersDAO.getLoggedUser().setAccountNumber(accountGenerator.accountGenerator(accountDAO));
    }


    @Override
    public String description() {
        return "Generate Account";
    }
}
