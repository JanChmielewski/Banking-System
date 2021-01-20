package pl.janchmielewski.menu.options;

public class CreateAccount implements MenuOption{
    @Override
    public void execute() {
        System.out.println("CreateAccount");
    }

    @Override
    public String description() {
        return "Generate account";
    }
}
