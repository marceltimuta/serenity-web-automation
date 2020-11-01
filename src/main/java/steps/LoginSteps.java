package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pageObjects.LoginModal;

public class LoginSteps extends ScenarioSteps {

    private LoginModal loginModal;

    @Step("Fill username field with value: {0}")
    public void fillUsernameField(String username) {
        loginModal.fillUsernameField(username);
    }

    @Step("Fill password field with value: {0}")
    public void fillPasswordField(String password) {
        loginModal.fillPasswordField(password);
    }

    @Step("Click on sign up button")
    public void clickOnLoginButton() {
        loginModal.clickOnLoginButton();
    }

}
