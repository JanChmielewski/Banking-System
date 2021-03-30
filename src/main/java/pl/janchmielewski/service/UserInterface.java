package pl.janchmielewski.service;

import pl.janchmielewski.model.User;

import java.util.Scanner;

public class UserInterface {

    Scanner in = new Scanner(System.in);


    public String showQuestionGetConfirmation(){
        showMessage("Are you sure you want to do this? (Y)es/(N)o : ");
        return getAnswer();
    }

    public void showMessage(Object message) {
        System.out.println(message);
    }

    public String getAnswer() {
        return in.nextLine();
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
