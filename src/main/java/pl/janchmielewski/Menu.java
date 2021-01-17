package pl.janchmielewski;

import java.util.List;
import java.util.Scanner;

public class Menu {

    void menu(List<User> users, List<Account> accounts) {

        Scanner in = new Scanner(System.in);
        String choice = "";

        while (choice != "Q") {

            System.out.println("1) Show the users list");
            System.out.println("2) Create new user account");
            System.out.println("3) Generate account");
            System.out.println("4) Show the accounts list");
            System.out.println("(Q)uit");
            System.out.print("Your choice: ");
            choice = in.nextLine();

            switch (choice) {
                case "1":

                    for (int i = 0; i < users.size(); i++) {
                        User user = users.get(i);
                        System.out.println(user);
                    }
                    break;
                case "2":

                    CreateUserAccount createUser = new CreateUserAccount();
                    users.add(createUser.userAccountCreator());
                    break;
                case "3":

                    AccountGenerator generator = new AccountGenerator();

                    generator.accountGenerator(users);
                    break;
                case "4":

                    for (int i = 0; i < accounts.size(); i++) {
                        Account account = accounts.get(i);
                        System.out.println(account);
                    }
                    break;
                case "Q":
                case "q":
                    return;

                default:
                    System.out.println("Invalid selection!");
            }
        }
    }
}
