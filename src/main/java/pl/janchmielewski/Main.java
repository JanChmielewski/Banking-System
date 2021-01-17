package pl.janchmielewski;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        UsersDAO usersDAO = new UsersDAO();
        AccountGenerator accountGenerator = new AccountGenerator();

        menu.menu(usersDAO.usersArrayList(), accountGenerator.accounts);
    }
}
