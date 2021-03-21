package pl.janchmielewski.service;

import pl.janchmielewski.dao.AccountDAO;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.model.Account;
import pl.janchmielewski.model.User;

public class AccountGenerator {

    public String accountGenerator(AccountDAO accountDAO) {

        AccountNumberGenerator accountNumberGenerator = new AccountNumberGenerator();
        String generatedAccountNumber = accountNumberGenerator.generateAccountNumber();
        Account account = new Account(generatedAccountNumber);
        accountDAO.addAccount(account);
        System.out.println(generatedAccountNumber);


        return generatedAccountNumber;
    }
}
