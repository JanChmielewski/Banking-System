package pl.janchmielewski.service;

import pl.janchmielewski.World;
import pl.janchmielewski.model.Account;

public class AccountGenerator {

    public String accountGenerator(World world) {

        AccountNumberGenerator accountNumberGenerator = new AccountNumberGenerator();
        String generatedAccountNumber = accountNumberGenerator.generateAccountNumber();
        Account account = new Account(generatedAccountNumber);
        world.getAccountDAO().addAccount(account);
        UI ui = new UI();
        ui.showMessage("You created account with this number: " + generatedAccountNumber);
        world.getUsersDAO().getLoggedUser().setAccountNumber(generatedAccountNumber);
        return generatedAccountNumber;
    }
}
