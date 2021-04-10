package pl.janchmielewski.service;

import pl.janchmielewski.World;
import pl.janchmielewski.model.Account;

public class MoneyTransfer {

    public void makeMoneyTransfer(World world) {
        Account transferringAccount = world.getAccountDAO().loggedUsersAccount(world);
        world.getUserInterface().showMessage("Enter number of an account you would like to transfer money");
        Account receivingAccount = world.getAccountDAO().getAccountByNumber(world.getUserInterface().readAccountNumber());
        if (world.getAccountDAO().getAccounts().contains(receivingAccount)) {
            world.getUserInterface().showMessage("Enter the amount of money you would like to transfer");
            double transfer = Double.parseDouble(world.getUserInterface().getAmount());
            if (transferringAccount.getBalance() - transfer < 0) {
                world.getUserInterface().showMessage("You don't have enough funds to do that");
            } else {
                transferringAccount.setBalance(transferringAccount.getBalance() - transfer);
                receivingAccount.setBalance(receivingAccount.getBalance() + transfer);
            }
        } else {
            world.getUserInterface().showMessage("There is no account with that number");
        }


    }
}
