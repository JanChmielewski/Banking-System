package pl.janchmielewski.menu;

import pl.janchmielewski.menu.options.MenuOption;

import java.util.List;
import java.util.Scanner;

public abstract class AbstractCommandPatternMenu {

    public void showMenu() {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println();

            for (int i = 0; i < getOptions().size(); i++) {
                MenuOption option = getOptions().get(i);
                System.out.printf("%d) %s%n", i + 1, option.description());
            }

            System.out.printf("Q) %s%n", getBackOption());
            System.out.print("Choice: ");
            String userInput = in.nextLine().toLowerCase().trim();
            if ("q".equals(userInput)) {
                break;
            }
            int selectedOption = Integer.parseInt(userInput);

            getOptions().get(selectedOption - 1).execute();
        }
    }

    protected abstract List<MenuOption> getOptions();

    protected abstract String getBackOption();
}