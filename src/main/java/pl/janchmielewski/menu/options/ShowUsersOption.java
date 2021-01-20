package pl.janchmielewski.menu.options;

public class ShowUsersOption implements MenuOption {

    @Override
    public void execute() {
        System.out.println("ShowUsersOption");
    }

    @Override
    public String description() {
        return "Show the users list";
    }
}
