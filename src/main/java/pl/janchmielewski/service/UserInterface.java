package pl.janchmielewski.service;

import java.util.Scanner;

public class UserInterface {

    Scanner in = new Scanner(System.in);


    public String showQuestionGetConfirmation(){
        showMessage("Are you sure you want to do this? (Y)es/(N)o : ");
        return getConfirmation();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public String getConfirmation() {
        return in.nextLine();
    }

    public void invalidUserCredentialsMessage(){
        throw new RuntimeException("Invalid Users Credentials");
    }
}
