package pl.janchmielewski;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        UsersDAO usersDAO = new UsersDAO();

        menu.menu(usersDAO.usersArrayList());
    }
}
