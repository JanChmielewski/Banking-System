import org.junit.Assert;
import org.junit.Test;
import pl.janchmielewski.World;
import pl.janchmielewski.model.Account;
import pl.janchmielewski.model.User;
import pl.janchmielewski.service.*;


public class UsersOptionsTest {

    User firstTestUser = new User("First User", "FirstTestEmail@test.com", "123456789", "firstTest");
    User secondTestUser = new User("Second User", "SecondTestEmail@test.com", "123456789", "secondTest");
    User thirdTestUser = new User("Third User", "ThirdTestEmail@test.com", "123456789", "thirdTest");


    @Test
    public void changeUsersEmailTest() {
        World world = new World(new MockUI());
        world.getUsersDAO().addUser(firstTestUser);
        world.getUsersDAO().addUser(secondTestUser);
        world.getUsersDAO().addUser(thirdTestUser);
        world.getUsersDAO().setUserStatusLogged(firstTestUser);
        ChangeLoginData changeLoginData = new ChangeLoginData();
        changeLoginData.emailChanger(world);
        if (world.getUsersDAO().getUser(1).getEmailAddress().equals("SecondTestEmail@test.com") && world.getUsersDAO().getUser(2).getEmailAddress().equals("ThirdTestEmail@test.com")) {
            Assert.assertSame("ChangedEmail@test.test", world.getUsersDAO().getLoggedUser().getEmailAddress());
        }
    }

    @Test
    public void changeUsersPasswordTest() {
        World world = new World(new MockUI());
        world.getUsersDAO().addUser(firstTestUser);
        world.getUsersDAO().addUser(secondTestUser);
        world.getUsersDAO().addUser(thirdTestUser);
        world.getUsersDAO().setUserStatusLogged(firstTestUser);
        ChangeLoginData changeLoginData = new ChangeLoginData();
        changeLoginData.passwordChanger(world);
        if (world.getUsersDAO().getUser(1).getPassword().equals("secondTest") && world.getUsersDAO().getUser(2).getPassword().equals("thirdTest")) {
            Assert.assertSame("ChangedPassword", world.getUsersDAO().getLoggedUser().getPassword());
        }
    }

    @Test
    public void generateNewAccount() {
        World world = new World(new MockUI());
        world.getUsersDAO().addUser(firstTestUser);
        world.getUsersDAO().addUser(secondTestUser);
        world.getUsersDAO().addUser(thirdTestUser);
        world.getUsersDAO().setUserStatusLogged(firstTestUser);
        AccountGenerator accountGenerator = new AccountGenerator();
        String generatedTestAccount = accountGenerator.accountGenerator(world);
        Assert.assertSame(generatedTestAccount, world.getUsersDAO().getLoggedUser().getAccountNumber());
    }

    @Test
    public void removeUserTest() {
        World world = new World(new MockUI());
        world.getUsersDAO().addUser(firstTestUser);
        world.getUsersDAO().addUser(secondTestUser);
        world.getUsersDAO().addUser(thirdTestUser);
        world.getUsersDAO().setUserStatusLogged(firstTestUser);
        RemoveUser removeUser = new RemoveUser();
        removeUser.userRemover(world);
        if (world.getUsersDAO().getUser(0).getEmailAddress().equals("SecondTestEmail@test.com") && world.getUsersDAO().getUser(1).getEmailAddress().equals("ThirdTestEmail@test.com")) {
            Assert.assertEquals(2, world.getUsersDAO().size());
        }
    }

    @Test
    public void removeAccountTest() {
        World world = new World(new MockUI());
        world.getUsersDAO().addUser(firstTestUser);
        world.getAccountDAO().addAccount(new Account("1"));
        firstTestUser.setAccountNumber("1");
        world.getUsersDAO().addUser(secondTestUser);
        world.getAccountDAO().addAccount(new Account("2"));
        secondTestUser.setAccountNumber("2");
        world.getUsersDAO().addUser(thirdTestUser);
        world.getAccountDAO().addAccount(new Account("3"));
        thirdTestUser.setAccountNumber("3");
        world.getUsersDAO().setUserStatusLogged(firstTestUser);
        RemoveAccount removeAccount = new RemoveAccount();
        removeAccount.accountRemover(world);
        if (world.getAccountDAO().getAccount(0).getAccountNumber().equals("2") && world.getAccountDAO().getAccount(1).equals("3")) {
            Assert.assertEquals(2, world.getAccountDAO().size());
        }
    }

}
