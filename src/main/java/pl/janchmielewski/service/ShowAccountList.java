package pl.janchmielewski.service;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.model.Account;

public class ShowAccountList {
    public void showAccountList(AccountDAO accountDAO) {

        if (accountDAO.size() == 0) {
           throw new RuntimeException("Sorry, there's no account assigned to this user");
        } else {
            for (int i = 0; i < accountDAO.size(); i++) {
                Account account = accountDAO.getAccount(i);
                System.out.println(account);
            }
        }
    }
}
