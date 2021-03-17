package pl.janchmielewski.dao;

import pl.janchmielewski.menu.options.LoginOption;
import pl.janchmielewski.model.User;
import pl.janchmielewski.service.UserVerifier;

import java.util.ArrayList;
import java.util.List;


public class UsersDAO {

    List<User> users;

    public UsersDAO() {
        users = createUsersArrayList();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) { users.remove(user); }

    public int size() {
        return users.size();
    }

    public User getUser(int i) {
        return users.get(i);
    }

    public User loggedUser(UsersDAO usersDAO, AccountDAO accountDAO) {
        LoginOption loginOption = new LoginOption();
        User loggedUser = loginOption.execute(usersDAO, accountDAO);
        return loggedUser;
    }

    public List<User> createUsersArrayList() {

        List<User> users = new ArrayList<>();
        users.add(new User("John Doe", "jd@a.a", "535855675", "a"));
        users.add(new User("Jan Chmielewski", "janjerzychmielewski@gmail.com", "535855675", "12345678"));
        users.add(new User("Stefan Czarniecki", "miłystefan@outlook.com", "642333212", "stefanstefan"));
        users.add(new User("Rozsądny Użytkownik", "r.użytkownik@gmail.com", "321465299", "592mUSK=zg\"z"));

        return users;
    }
}
