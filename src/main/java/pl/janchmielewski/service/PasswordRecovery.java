package pl.janchmielewski.service;

import pl.janchmielewski.World;
import pl.janchmielewski.model.User;

public class PasswordRecovery {

    public void passwordRecovery(World world) {
        UserVerifier userVerifier = new UserVerifier();
        world.getUserInterface().securityQuestionMessage();
        User user = userVerifier.findUserBySecurityQuestion(world.getUserInterface().getAnswer(), world);
        if (user == null) {
            world.getUserInterface().showMessage("User not found");
        } else {
            String newPassword = world.getUserInterface().getNewUserPasswordWithConfirmation();
            user.setPassword(newPassword);
        }
    }
}
