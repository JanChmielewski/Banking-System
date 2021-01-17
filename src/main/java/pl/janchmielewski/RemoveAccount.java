package pl.janchmielewski;

import java.util.List;
import java.util.Scanner;

public class RemoveAccount {

    public void accountRemover(List<User> users, AccountDAO accountDAO) {

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

                        System.out.print("Are you sure you want to delete this account? (Y)es/(N)o : ");

                        String choice = in.nextLine();

                        while (choice.equals("Y")) {
                            accountDAO.removeAccount(account);
                            user.setAccountNumber(null);
                            break;
                        }
                    }


                } else if (!passwordVerification.equals(user.getPassword())) {
                    System.out.println("Wrong password!");
                }
            }
        }
    }
}
