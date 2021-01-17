package pl.janchmielewski;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        UsersDAO usersDAO = new UsersDAO();
        AccountDAO accountDAO = new AccountDAO();
        menu.menu(usersDAO.usersArrayList(), accountDAO);
    }
}
