package pl.janchmielewski.service;

import pl.janchmielewski.controller.EmailAndPasswordController;
import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.model.Account;
import pl.janchmielewski.model.User;

import java.util.Scanner;

public class ShowAccountBalance {

    public void showAccountBalance(UsersDAO usersDAO, AccountDAO accountDAO) {

        EmailAndPasswordController emailAndPasswordController = new EmailAndPasswordController();
        UserVerifier userVerifier = new UserVerifier();
        User user = userVerifier.findUser(usersDAO, emailAndPasswordController.getUserEmail(), emailAndPasswordController.getUserPassword());

        if (user == null) {
            throw new RuntimeException("Invalid login credentials.");
        }

        if (user.getAccountNumber() == null) {
            throw new RuntimeException("There is no account assigned to this user.");
        }

        Account account = accountDAO.getAccountByNumber(user.getAccountNumber());
        System.out.println("Your account balance: " + account.getBalance());
    }
}
