package pl.janchmielewski.service;

import pl.janchmielewski.World;
import pl.janchmielewski.model.Account;

public class DepositFunds {

    public void depositFunds(World world) {
        Account depositingAccount = world.getAccountDAO().loggedUsersAccount(world);
        if (depositingAccount == null) {
            world.getUserInterface().showMessage("First you need to create to create an account!");
        } else {
            world.getUserInterface().showMessage("How much money you would like to deposit?");
            double deposit = Double.parseDouble(world.getUserInterface().getAmount());
            depositingAccount.setBalance(depositingAccount.getBalance() + deposit);
            world.getUserInterface().showMessage("Funds has been added.");
            world.getUserInterface().showMessage(depositingAccount.getBalance());
        }
    }
}
