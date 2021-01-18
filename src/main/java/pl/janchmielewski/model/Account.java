package pl.janchmielewski.model;

public class Account {

    double balance = 0.0;
    String accountNumber;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Account{");
        stringBuilder.append("balance=");
        stringBuilder.append(balance);
        stringBuilder.append(", accountNumber='");
        stringBuilder.append(accountNumber);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
