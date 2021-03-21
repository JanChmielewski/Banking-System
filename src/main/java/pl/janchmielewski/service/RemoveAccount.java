package pl.janchmielewski.service;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.model.Account;
import pl.janchmielewski.model.User;

import java.util.Scanner;

public class RemoveAccount {

    public void accountRemover(AccountDAO accountDAO, UsersDAO usersDAO) {

        Scanner in = new Scanner(System.in);

        if (usersDAO.getLoggedUser() != null && usersDAO.getLoggedUser().getAccountNumber() == null) {
            throw new RuntimeException("This user have none assigned accounts");
        } else if (usersDAO.getLoggedUser() != null) {
            Account account = accountDAO.getAccountByNumber(usersDAO.getLoggedUser().getAccountNumber());

            System.out.print("Are you sure you want to delete this account? (Y)es/(N)o : ");
            String choice = in.nextLine();

            if (choice.equalsIgnoreCase("y")) {
                accountDAO.removeAccount(account);
                usersDAO.getLoggedUser().setAccountNumber(null);
            }
        }
    }
}