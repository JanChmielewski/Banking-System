package pl.janchmielewski.service;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.model.Account;
import pl.janchmielewski.model.User;

import java.util.Scanner;

public class ShowAccountBalance {

    public void showAccountBalance(UsersDAO usersDAO, AccountDAO accountDAO) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter user's e-mail address: ");
        String emailVerification = in.nextLine();
        System.out.print("Enter user's password: ");
        String passwordVerification = in.nextLine();

        UserVerifier userVerifier = new UserVerifier();
        User user = userVerifier.findUser(usersDAO, emailVerification, passwordVerification);
        if (user == null) {
            System.out.println("Invalid login credentials.");
        } else {
            if (user.getAccountNumber() == null) {
                System.out.println("There is no account assigned to this user!");
            } else {
                Account account = accountDAO.getAccountByNumber(user.getAccountNumber());
                System.out.println("Your account balance: " + account.getBalance());

            }
        }
    }
}
