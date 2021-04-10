package pl.janchmielewski.service;

import pl.janchmielewski.World;
import pl.janchmielewski.model.Account;

public class RemoveAccount {

    public void accountRemover(World world) {


        if (world.getUsersDAO().getLoggedUser() != null && world.getUsersDAO().getLoggedUser().getAccountNumber() == null) {
            throw new RuntimeException("This user have none assigned accounts");
        } else if (world.getUsersDAO().getLoggedUser() != null) {
            Account account = world.getAccountDAO().getAccountByNumber(world.getUsersDAO().getLoggedUser().getAccountNumber());
            String choice = world.getUserInterface().showQuestionGetConfirmation();
            if (choice.equalsIgnoreCase("y")) {
                world.getAccountDAO().removeAccount(account);
                world.getUsersDAO().getLoggedUser().setAccountNumber(null);
                world.getUserInterface().showMessage("Account has been removed");
            }
        }
    }
}