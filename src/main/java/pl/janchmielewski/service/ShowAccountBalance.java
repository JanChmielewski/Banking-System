package pl.janchmielewski.service;

import pl.janchmielewski.World;

import pl.janchmielewski.model.Account;

public class ShowAccountBalance {

    public void showAccountBalance(World world) {

        if (world.getUsersDAO().getLoggedUser().getAccountNumber() == null) {
            throw new RuntimeException("There is no account assigned to this user.");
        }

        Account account = world.getAccountDAO().getAccountByNumber(world.getUsersDAO().getLoggedUser().getAccountNumber());
        world.getUserInterface().showMessage("Your account balance: " + account.getBalance());
    }
}
