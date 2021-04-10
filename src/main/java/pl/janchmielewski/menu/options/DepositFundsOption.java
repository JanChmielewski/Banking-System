package pl.janchmielewski.menu.options;

import pl.janchmielewski.World;
import pl.janchmielewski.service.DepositFunds;

public class DepositFundsOption implements MenuOption {
    @Override
    public void execute(World world) {
        DepositFunds depositFunds = new DepositFunds();
        try {
            depositFunds.depositFunds(world);
        } catch (NumberFormatException e) {
            world.getUserInterface().showMessage("Enter a valid value.");
        }
    }

    @Override
    public String description() {
        return "Deposit Money";
    }
}
