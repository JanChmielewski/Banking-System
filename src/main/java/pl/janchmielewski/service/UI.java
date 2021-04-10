package pl.janchmielewski.service;

import pl.janchmielewski.UserInterface;
import pl.janchmielewski.World;
import pl.janchmielewski.model.User;
import java.util.Scanner;

public class UI implements UserInterface {

    Scanner in = new Scanner(System.in);

    @Override
    public String showQuestionGetConfirmation(){
        showMessage("Are you sure you want to do this? (Y)es/(N)o : ");
        return getAnswer();
    }

    public void showMessage(Object message) {
        System.out.println(message);
    }

    @Override
    public String getAnswer() {
        return in.nextLine();
    }

    public String readAccountNumber() {
        return getAnswer();
    }

    public String getAmount() {
        return getAnswer();
    }

    public String getUsersEmail() {
        return getAnswer();
    }

    public String getUsersPassword() {
        return getAnswer();
    }

    public String LoggingByEmail() {
        showMessage("Enter user's e-mail address: ");
        return getAnswer();
    }

    public String LoggingByPassword() {
        showMessage("Enter user's password: ");
        return getAnswer();
    }
    public String getNewUserPasswordWithConfirmation() {
        showMessage("Enter new user's password: ");
        String passwordVerification = getUsersPassword();

        showMessage("Confirm new password: ");
        String passwordConfirmation = getUsersPassword();
        if(passwordConfirmation.equals(passwordVerification)) {
            showMessage("Password has been changed.");
            return passwordVerification;
        }
        throw new RuntimeException("Password are not equal.");
    }

    public String getNewUserEmailWithConfirmation()  {
        showMessage("Enter new user's email address: ");
        String emailVerification = getUsersEmail();

        showMessage("Confirm new email address: ");
        String emailConfirmation = getUsersEmail();
        if(emailConfirmation.equals(emailVerification)) {
            showMessage("Email has been changed.");
            return emailVerification;
        }
        throw new RuntimeException("Email addresses are not equal.");
    }

    public void invalidUserCredentialsMessage(){
        showMessage("Invalid Users Credentials");
    }

    public User createUser() {

        String fullName, emailAddress, phoneNumber, password;

        showMessage("What's the full name of the owner of the account?");
        fullName = getAnswer();
        showMessage("What's the e-mail address?");
        emailAddress = getAnswer();
        showMessage("What's the phone number?");
        phoneNumber = getAnswer();
        showMessage("What's the password");
        password = getAnswer();

        User user = new User(fullName, emailAddress, phoneNumber, password);

        showMessage("You created user: [Name: " + fullName + "," + " Email Address: " + emailAddress + "," + " Phone number: " + phoneNumber +  "," + " Password: " + password + "]");

        return user;
    }
}
