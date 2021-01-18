package pl.janchmielewski;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.model.Account;
import pl.janchmielewski.model.User;
import pl.janchmielewski.service.AccountGenerator;
import pl.janchmielewski.service.CreateUserAccount;
import pl.janchmielewski.service.RemoveAccount;
import pl.janchmielewski.service.ShowAccountBalance;

import java.util.Scanner;

public class Menu {

    void menu(UsersDAO usersDAO, AccountDAO accountDAO) {

        Scanner in = new Scanner(System.in);
        String choice = "";

        while (!choice.equalsIgnoreCase("q")) {

            System.out.println("1) Show the users list");
            System.out.println("2) Create new user account");
            System.out.println("3) Generate account");
            System.out.println("4) Show the accounts list");
            System.out.println("5) Remove account");
            System.out.println("6) Show Account Balance");
            System.out.println("(Q)uit");
            System.out.print("Your choice: ");
            choice = in.nextLine();

            switch (choice) {
                case "1":

                    for (int i = 0; i < usersDAO.size(); i++) {
                        User user = usersDAO.getUser(i);
                        System.out.println(user);
                    }
                    break;
                case "2":

                    CreateUserAccount createUser = new CreateUserAccount();
                    usersDAO.addUser(createUser.userAccountCreator());
                    break;
                case "3":

                    AccountGenerator generator = new AccountGenerator();

                    generator.accountGenerator(usersDAO, accountDAO);
                    break;
                case "4":
                    for (int i = 0; i < accountDAO.size(); i++) {
                        Account account = accountDAO.getAccount(i);
                        System.out.println(account);
                    }
                    break;
                case "5":
                    RemoveAccount removeAccount = new RemoveAccount();
                    removeAccount.accountRemover(usersDAO, accountDAO);
                    break;
                case "6":
                    ShowAccountBalance showAccountBalance = new ShowAccountBalance();
                    showAccountBalance.showAccountBalance(usersDAO, accountDAO);
                    break;
                case "q":
                    return;

                default:
                    System.out.println("Invalid selection!");
            }
        }
    }
}
