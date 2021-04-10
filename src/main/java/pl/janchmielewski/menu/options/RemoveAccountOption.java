package pl.janchmielewski.menu.options;

import pl.janchmielewski.World;
import pl.janchmielewski.service.RemoveAccount;

public class RemoveAccountOption implements MenuOption {

    @Override
    public void execute(World world) {
        RemoveAccount removeAccount = new RemoveAccount();

        try {
            removeAccount.accountRemover(world);
        } catch (RuntimeException e) {
            world.getUserInterface().showMessage(e.getMessage());
        }
    }

    @Override
    public String description() {
        return "Remove account";
    }
}
