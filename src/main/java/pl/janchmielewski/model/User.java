package pl.janchmielewski.model;

public class User {
    private String fullName, emailAddress, phoneNumber, password, accountNumber, securityQuestionAnswer;

    public User(String fullName, String emailAddress, String phoneNumber, String password, String securityQuestionAnswer) {
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.securityQuestionAnswer = securityQuestionAnswer;
    }

    public void setSecurityQuestionAnswer(String securityQuestionAnswer) {
        this.securityQuestionAnswer = securityQuestionAnswer;
    }

    public String getSecurityQuestionAnswer() {
        System.out.println("Who was the patron of your high school?");
        return securityQuestionAnswer;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName() {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        stringBuilder.append("User{");
        stringBuilder.append("fullName='");
        stringBuilder.append(fullName);
        stringBuilder.append('\'');
        stringBuilder.append(", emailAddress='");
        stringBuilder.append(emailAddress);
        stringBuilder.append('\'');
        stringBuilder.append(", phoneNumber='");
        stringBuilder.append(phoneNumber);
        stringBuilder.append('\'');
        stringBuilder.append(", password='");
        stringBuilder.append(password);
        stringBuilder.append('\'');
        if (accountNumber != null) {
            stringBuilder.append(", accountNumber='");
            stringBuilder.append(accountNumber);
            stringBuilder.append('\'');
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

