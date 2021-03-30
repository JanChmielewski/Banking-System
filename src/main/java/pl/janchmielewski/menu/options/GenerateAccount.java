package pl.janchmielewski.menu.options;

import pl.janchmielewski.World;
import pl.janchmielewski.service.AccountGenerator;

public class GenerateAccount implements  MenuOption {

    @Override
    public void execute(World world) {
        AccountGenerator accountGenerator = new AccountGenerator();
        world.getUsersDAO().getLoggedUser().setAccountNumber(accountGenerator.accountGenerator(world.getAccountDAO()));
    }


    @Override
    public String description() {
        return "Generate Account";
    }
}
