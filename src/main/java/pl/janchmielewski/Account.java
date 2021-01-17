package pl.janchmielewski;

public class Account {

    double balance;
    String fullName, emailAddress, phoneNumber, accountNumber;

    public Account(String fullName, String emailAddress, String phoneNumber, String accountNumber, double balance) {
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
        stringBuilder.append(", fullName='");
        stringBuilder.append(fullName);
        stringBuilder.append('\'');
        stringBuilder.append(", emailAddress='");
        stringBuilder.append(emailAddress);
        stringBuilder.append('\'');
        stringBuilder.append(", phoneNumber='");
        stringBuilder.append(phoneNumber);
        stringBuilder.append('\'');
        stringBuilder.append(", accountNumber='");
        stringBuilder.append(accountNumber);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
