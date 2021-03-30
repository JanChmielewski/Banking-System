package pl.janchmielewski.menu.options;

import pl.janchmielewski.World;
import pl.janchmielewski.service.ShowAccountList;

public class ShowAccountListOption implements pl.janchmielewski.menu.options.MenuOption {
    @Override
    public void execute(World world) {
        ShowAccountList showAccountList = new ShowAccountList();
        try {
            showAccountList.showAccountList(world.getAccountDAO());
        } catch (RuntimeException e) {
            world.getUserInterface().showMessage(e.getMessage());
        }
    }

    @Override
    public String description() {
        return "Show account list";
    }
}
