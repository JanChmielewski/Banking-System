package pl.janchmielewski;

import java.util.ArrayList;
import java.util.List;

public class AccountDAO {

    List<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) { accounts.remove(account); }

    public int size() {
        return accounts.size();
    }

    public Account getAccount(int i) {
        return accounts.get(i);
    }
}
