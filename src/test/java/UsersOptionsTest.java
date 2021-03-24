import org.junit.Assert;
import org.junit.Test;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.model.User;
import pl.janchmielewski.service.ChangeLoginData;


public class UsersOptionsTest {

    User testUser = new User("Test User", "testEmail@test.com", "123456789", "testTest");
    UsersDAO usersDAO = new UsersDAO();


    @Test
    void changeUsersEmailTest() {
        usersDAO.addUser(testUser);
        ChangeLoginData changeLoginData = new ChangeLoginData();
        String changedEmail = "changedEmail@changed.com";
        changeLoginData.emailChanger(usersDAO);
        Assert.assertSame(changedEmail, usersDAO.getLoggedUser().getEmailAddress());
    }
}
