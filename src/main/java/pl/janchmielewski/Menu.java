package pl.janchmielewski;

import java.util.List;
import java.util.Scanner;

public class Menu {

    public Menu() {
    }

    void menu(List<User> users) {

        Scanner in = new Scanner(System.in);
        String choice = "";

        while (choice != "Q") {

            System.out.println("1) Show the users list");
            System.out.println("2) Create new user account");
            System.out.println("(Q)uit");
            System.out.print("Your choice: ");
            choice = in.nextLine();

            switch (choice) {
                case "1":
                    users.forEach( user -> {
                        System.out.println("[Name: " + user.getFullName() + " E-mail Address: " + user.getEmailAddress() + " Phone number: " + user.getPhoneNumber() + " Password: " + user.getPassword() + "]");
                    });
                break;
                case "2":

                    CreateUserAccount createUser = new CreateUserAccount();

                    System.out.println("What's the full name of the owner of the account?");
                    System.out.println("What's the e-mail address?");
                    System.out.println("What's the phone number?");
                    System.out.println("Enter password: ");
                    createUser.userAccountCreator();
                    users.add(createUser.userAccountCreator());
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
