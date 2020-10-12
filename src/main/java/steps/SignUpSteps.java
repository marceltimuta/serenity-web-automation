package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.SignUpPage;

public class SignUpSteps extends ScenarioSteps {

    private SignUpPage signUpPage;

    @Step("Fill username field")
    public void fillUsernameField(String username) {
        signUpPage.fillUsernameField(username);
    }

    @Step("Fill password field")
    public void fillPasswordField(String password) {
        signUpPage.fillPasswordField(password);
    }

    @Step("Click on sign up button")
    public void clickOnSignUpButton() {
        signUpPage.clickOnSignUpButton();
    }

}
