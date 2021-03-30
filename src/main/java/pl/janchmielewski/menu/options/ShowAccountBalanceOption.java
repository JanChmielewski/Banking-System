package pl.janchmielewski.menu.options;

import pl.janchmielewski.World;
import pl.janchmielewski.service.ShowAccountBalance;

public class ShowAccountBalanceOption implements MenuOption {
    @Override
    public void execute(World world) {
        ShowAccountBalance showAccountBalance = new ShowAccountBalance();

        try {
            showAccountBalance.showAccountBalance(world.getUsersDAO(), world.getAccountDAO());
        } catch (RuntimeException e) {
            world.getUserInterface().showMessage(e.getMessage());
        }
    }

    @Override
    public String description() {
        return "Show account balance";
    }
}
