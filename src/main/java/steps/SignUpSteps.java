package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pageObjects.SignUpModal;

public class SignUpSteps extends ScenarioSteps {

    private SignUpModal signUpModal;

    @Step("Fill username field: {0}")
    public void fillUsernameField(String username) {
        signUpModal.fillUsernameField(username);
    }

    @Step("Fill password field: {0}")
    public void fillPasswordField(String password) {
        signUpModal.fillPasswordField(password);
    }

    @Step("Click on sign up button")
    public void clickOnSignUpButton() {
        signUpModal.clickOnSignUpButton();
    }

}
