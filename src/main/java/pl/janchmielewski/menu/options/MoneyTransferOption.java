package pl.janchmielewski.menu.options;

import pl.janchmielewski.World;
import pl.janchmielewski.service.MoneyTransfer;

public class MoneyTransferOption implements MenuOption {
    @Override
    public void execute(World world) {
        MoneyTransfer moneyTransfer = new MoneyTransfer();
        moneyTransfer.makeMoneyTransfer(world);
    }

    @Override
    public String description() {
        return "Transfer money";
    }
}
