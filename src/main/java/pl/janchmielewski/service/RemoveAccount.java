package pl.janchmielewski.service;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.model.Account;

public class RemoveAccount {

    public void accountRemover(AccountDAO accountDAO, UsersDAO usersDAO) {


        if (usersDAO.getLoggedUser() != null && usersDAO.getLoggedUser().getAccountNumber() == null) {
            throw new RuntimeException("This user have none assigned accounts");
        } else if (usersDAO.getLoggedUser() != null) {
            Account account = accountDAO.getAccountByNumber(usersDAO.getLoggedUser().getAccountNumber());
            UserInterface ui = new UserInterface();
            String choice = ui.showQuestionGetConfirmation();
            if (choice.equalsIgnoreCase("y")) {
                accountDAO.removeAccount(account);
                usersDAO.getLoggedUser().setAccountNumber(null);
            }
        }
    }
}