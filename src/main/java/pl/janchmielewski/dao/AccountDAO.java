package pl.janchmielewski.dao;

import pl.janchmielewski.World;
import pl.janchmielewski.model.Account;
import java.util.ArrayList;
import java.util.List;

public class AccountDAO {

    List<Account> accounts = new ArrayList<>();
    private Account account;

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public int size() {
        return accounts.size();
    }

    public Account getAccount(int i) {
        return accounts.get(i);
    }

    public Account loggedUsersAccount(World world) {
        return getAccountByNumber(world.getUsersDAO().getLoggedUser().getAccountNumber());
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public Account getLoggedUserAccount() {
        return account;
    }

    public Account getAccountByNumber(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}
