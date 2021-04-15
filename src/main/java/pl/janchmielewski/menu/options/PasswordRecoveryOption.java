package pl.janchmielewski.menu.options;

import pl.janchmielewski.World;
import pl.janchmielewski.service.PasswordRecovery;

public class PasswordRecoveryOption implements MenuOption {
    @Override
    public void execute(World world) {
        PasswordRecovery passwordRecovery = new PasswordRecovery();
        passwordRecovery.passwordRecovery(world);
    }

    @Override
    public String description() {
        return "Forgot Password?";
    }
}
