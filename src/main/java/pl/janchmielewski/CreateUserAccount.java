package pl.janchmielewski;

import java.util.Scanner;

public class CreateUserAccount {

    String fullName, emailAddress, phoneNumber, password;

    public User userAccountCreator() {

        Scanner in = new Scanner(System.in);

        fullName = in.nextLine();
        emailAddress = in.nextLine();
        phoneNumber = in.nextLine();
        password = in.nextLine();
        User user = new User(fullName, emailAddress, phoneNumber, password);

        return user;
    }
}
