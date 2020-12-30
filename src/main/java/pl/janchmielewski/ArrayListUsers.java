package pl.janchmielewski;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUsers {
    public void usersArrayList() {
        List<User> users = new ArrayList<>();
        users.add(new User("Jan Chmielewski", "janjerzychmielewski@gmail.com", "535855675", "dupa123"));
        users.add(new User("Stefan Czarniecki", "miłystefan@outlook.com", "642333212", "stefanstefan"));
        users.add(new User("Rozsądny Użytkownik", "r.użytkownik@gmail.com", "321465299", "592mUSK=zg\"z"));

        users.forEach( user -> {
            System.out.println("[ Name: " + user.getFullName() + " E-mail Address: " + user.getEmailAddress() + " Phone number: " + user.getPhoneNumber() + " Password: " + user.getPassword());
        });
    }
}
