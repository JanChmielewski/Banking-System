package pl.janchmielewski;

import java.util.ArrayList;
import java.util.List;


public class UsersDAO {

    List<User> users = new ArrayList<>();

    public List<User> usersArrayList() {

        users.add(new User("Jan Chmielewski", "janjerzychmielewski@gmail.com", "535855675", "12345678"));
        users.add(new User("Stefan Czarniecki", "miłystefan@outlook.com", "642333212", "stefanstefan"));
        users.add(new User("Rozsądny Użytkownik", "r.użytkownik@gmail.com", "321465299", "592mUSK=zg\"z"));

        return users;

    }
}
