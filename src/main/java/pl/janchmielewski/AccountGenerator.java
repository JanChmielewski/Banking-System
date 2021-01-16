package pl.janchmielewski;

import java.util.List;
import java.util.Scanner;

public class AccountGenerator {

    public List<User> accountGenerator(List<User> users) {

        AccountNumberGenerator generator = new AccountNumberGenerator();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter user's e-mail address: ");
        String emailVerification = in.nextLine();
        System.out.print("Enter user's password: ");
        String passwordVerification = in.nextLine();

        for (int i = 0; i < users.size(); i++) {
                User user = users.get(i);

              if(emailVerification.equals(user.getEmailAddress())) {
                  if(passwordVerification.equals(user.getPassword())) {

                      String generatedAccountNumber = generator.generateAccountNumber();
                      user.setAccountNumber(generatedAccountNumber);
                      System.out.println(generatedAccountNumber);

                  }
              }

              if(!emailVerification.equals(user.getEmailAddress())) { System.out.println("Wrong email address!"); }

              if(!passwordVerification.equals(user.getPassword())) { System.out.println("Wrong password!"); }
        }


        return users;
    }
}
