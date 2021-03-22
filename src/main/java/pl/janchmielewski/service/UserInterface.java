package pl.janchmielewski.service;

import java.util.Scanner;

public class UserInterface {

    public String showQuestionGetConfirmation(){
        Scanner in = new Scanner(System.in);
        showMessage("Are you sure you want to do this? (Y)es/(N)o : ");
        String confirmation = in.nextLine();
        return confirmation;
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
