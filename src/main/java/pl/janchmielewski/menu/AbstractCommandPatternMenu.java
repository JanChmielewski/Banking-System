package pl.janchmielewski.menu;

import pl.janchmielewski.World;
import pl.janchmielewski.menu.options.MenuOption;

import java.util.List;

public abstract class AbstractCommandPatternMenu {

    public void showMenu(World world) {

        while (true) {
            System.out.println();

            for (int i = 0; i < getOptions().size(); i++) {
                MenuOption option = getOptions().get(i);
                System.out.printf("%d) %s%n", i + 1, option.description());
            }

            System.out.printf("Q) %s%n", getBackOption());
            System.out.print("Choice: ");
            String userInput = world.getUserInterface().getAnswer().toLowerCase().trim();
            
            if ("q".equals(userInput)) {
                break;
            }

            if (userInput.matches("[A-Z a-z]") || userInput.isEmpty()) {

                int selectedOption = Integer.parseInt(userInput);

                if (selectedOption > getOptions().size() || selectedOption == 0) {

                    System.out.println("Please select correct option");
                } else {
                    getOptions().get(selectedOption - 1).execute(world);
                }
            }
        }
    }

    protected abstract List<MenuOption> getOptions();

    protected abstract String getBackOption();
}
