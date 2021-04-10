package pl.janchmielewski.service;

import pl.janchmielewski.World;
import pl.janchmielewski.model.Account;

public class ShowAccountList {
    public void showAccountList(World world) {

        if (world.getAccountDAO().size() == 0) {
           throw new RuntimeException("Sorry, there's no account assigned to this user");
        } else {
            for (int i = 0; i < world.getAccountDAO().size(); i++) {
                Account account = world.getAccountDAO().getAccount(i);
                System.out.println(account);
            }
        }
    }
}
