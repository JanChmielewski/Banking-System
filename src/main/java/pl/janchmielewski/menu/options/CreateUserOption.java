package pl.janchmielewski.menu.options;

public class CreateUserOption implements MenuOption{
    @Override
    public void execute() {
        System.out.println("CreateUserOption");
    }

    @Override
    public String description() {
        return "Create new user account";
    }
}
