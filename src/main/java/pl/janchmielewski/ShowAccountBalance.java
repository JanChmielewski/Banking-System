package pl.janchmielewski;

import java.util.List;
import java.util.Scanner;

public class ShowAccountBalance {

    public void showAccountBalance(List<User> users, AccountDAO accountDAO) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter user's e-mail address: ");
        String emailVerification = in.nextLine();
        System.out.print("Enter user's password: ");
        String passwordVerification = in.nextLine();

        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);

            if (emailVerification.equals(user.getEmailAddress())) {
                if (passwordVerification.equals(user.getPassword())) {

                    for (int j = 0; j < accountDAO.size(); j++) {

                        Account account = accountDAO.getAccount(j);

                        if (user.getAccountNumber() == null) {
                            System.out.println("There is no account assigned to this user!");
                        }

                        System.out.println("Your account balance: " + account.getBalance());
                    }


                } else if (!passwordVerification.equals(user.getPassword())) {
                    System.out.println("Wrong password!");
                }
            }
        }
    }
}
