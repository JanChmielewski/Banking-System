import pl.janchmielewski.UserInterface;
import pl.janchmielewski.service.UI;

public class MockUI extends UI implements UserInterface {

    @Override
    public String showQuestionGetConfirmation() {
        return "Y";
    }

    @Override
    public String getAnswer() {
        return null;
    }

    public String getUsersEmail() {
        return "ChangedEmail@test.test";
    }

    public String getUsersPassword() {
        return "ChangedPassword";
    }
}
