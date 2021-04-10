package pl.janchmielewski.menu.options;

import pl.janchmielewski.World;
import pl.janchmielewski.service.AccountGenerator;

public class GenerateAccount implements  MenuOption {

    @Override
    public void execute(World world) {
        AccountGenerator accountGenerator = new AccountGenerator();
        accountGenerator.accountGenerator(world);
    }


    @Override
    public String description() {
        return "Generate Account";
    }
}
