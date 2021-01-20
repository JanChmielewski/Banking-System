package pl.janchmielewski.controller;

import java.util.Scanner;

public class EmailAndPasswordController {
    Scanner in = new Scanner(System.in);

    public String getUserEmail() {
        System.out.print("Enter user's e-mail address: ");
        String emailVerification = in.nextLine();
        return emailVerification;
    }

    public String getUserPassword() {
        System.out.print("Enter user's password: ");
        String passwordVerification = in.nextLine();
        return passwordVerification;
    }

    public String getUserPasswordWithConfirmation() {
        System.out.print("Enter user's password: ");
        String passwordVerification = in.nextLine();

        System.out.println("Confirm new password");
        String passwordConfirmation = in.nextLine();
        if(passwordConfirmation.equals(passwordVerification)){
            return passwordVerification;
        }
        throw new RuntimeException("Passwords are not equal.");
    }

    public UserCredentials getUserCredentials() {
        return new UserCredentials(getUserEmail(), getUserPassword());
    }

    public static class UserCredentials {
        private final String email;
        private final String password;

        public UserCredentials(String email, String password) {
            this.email = email;
            this.password = password;
        }

        public String getEmail() {
            return email;
        }

        public String getPassword() {
            return password;
        }
    }
}
