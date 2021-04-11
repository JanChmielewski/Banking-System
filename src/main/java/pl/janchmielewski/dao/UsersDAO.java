package pl.janchmielewski.dao;

import pl.janchmielewski.model.User;

import java.util.ArrayList;
import java.util.List;


public class UsersDAO {

    List<User> users;
    private User user;

    public UsersDAO() {
        users = createUsersArrayList();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }

    public void removeUser(User user) { users.remove(user); }

    public int size() {
        return users.size();
    }

    public User getUser(int i) {
        return users.get(i);
    }

    public void setUserStatusLogged(User user) {
        this.user = user;
    }

    public User getLoggedUser(){
        return user;
    }

    public List<User> createUsersArrayList() {
        List<User> users = new ArrayList<>();
        return users;
    }

    public boolean ifEmpty() {
        return users.isEmpty();
    }
}
