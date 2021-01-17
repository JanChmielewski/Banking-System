package pl.janchmielewski;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountGenerator {

    List<Account> accounts = new ArrayList<>();

    Account account;

    public List<Account> accountGenerator(List<User> users) {

        AccountNumberGenerator accountNumberGenerator = new AccountNumberGenerator();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter user's e-mail address: ");
        String emailVerification = in.nextLine();
        System.out.print("Enter user's password: ");
        String passwordVerification = in.nextLine();

        for (int i = 0; i < users.size(); i++) {
                User user = users.get(i);

              if(emailVerification.equals(user.getEmailAddress())) {
                  if(passwordVerification.equals(user.getPassword())) {

                      String generatedAccountNumber = accountNumberGenerator.generateAccountNumber();
                      user.setAccountNumber(generatedAccountNumber);
                      account.setAccountNumber(generatedAccountNumber);
                      System.out.println(generatedAccountNumber);

                  } else if(!passwordVerification.equals(user.getPassword())) { System.out.println("Wrong password!"); }
              }
        }



        return accounts;
    }
}
