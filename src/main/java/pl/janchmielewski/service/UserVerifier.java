package pl.janchmielewski.service;

import pl.janchmielewski.World;
import pl.janchmielewski.dao.UsersDAO;
import pl.janchmielewski.model.User;

public class UserVerifier {

    public boolean isEmailAndPasswordCorrect(User user, String email, String password){
        return user.getEmailAddress().equals(email) && user.getPassword().equals(password);
    }

    public User findUserBySecurityQuestion(String securityQuestion, World world) {
        for (int i = 0; i < world.getUsersDAO().size(); i++) {
            User user = world.getUsersDAO().getUser(i);

            if (securityQuestion.equals(world.getUsersDAO().getUser(i).getSecurityQuestionAnswer())) {
                return user;
            }
        }
        return null;
    }

    public User findUser(UsersDAO usersDAO, String email, String password){
        for (int i = 0; i < usersDAO.size(); i++) {
            User user = usersDAO.getUser(i);

            if (isEmailAndPasswordCorrect(user, email, password)) {
                return user;
            }
        }
        return null;
    }
}
