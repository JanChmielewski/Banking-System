package pl.janchmielewski.service;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.model.Account;
import pl.janchmielewski.model.User;

import java.util.Scanner;

public class RemoveUser {

    public void userRemover(UsersDAO users) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter user's e-mail address: ");
        String emailVerification = in.nextLine();
        System.out.print("Enter user's password: ");
        String passwordVerification = in.nextLine();

        UserVerifier userVerifier = new UserVerifier();
        User user = userVerifier.findUser(users, emailVerification, passwordVerification);
        if (user == null) {
            System.out.println("Invalid login credentials.");
        } else {
            users.removeUser(user);
            System.out.println("User has been removed.");
        }
    }
}
