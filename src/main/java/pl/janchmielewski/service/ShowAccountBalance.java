package pl.janchmielewski.service;

import pl.janchmielewski.controller.EmailAndPasswordController;
import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.model.Account;
import pl.janchmielewski.model.User;

import java.util.Scanner;

public class ShowAccountBalance {

    public void showAccountBalance(UsersDAO usersDAO, AccountDAO accountDAO) {

        if (usersDAO.getLoggedUser().getAccountNumber() == null) {
            throw new RuntimeException("There is no account assigned to this user.");
        }

        Account account = accountDAO.getAccountByNumber(usersDAO.getLoggedUser().getAccountNumber());
        UserInterface ui = new UserInterface();
        ui.showMessage("Your account balance: " + account.getBalance());
    }
}
