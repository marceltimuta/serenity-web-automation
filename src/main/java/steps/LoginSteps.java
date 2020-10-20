package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.LoginPage;

public class LoginSteps extends ScenarioSteps {

    private LoginPage loginPage;

    @Step("Fill username field")
    public void fillUsernameField(String username) {
        loginPage.fillUsernameField(username);
    }

    @Step("Fill password field")
    public void fillPasswordField(String password) {
        loginPage.fillPasswordField(password);
    }

    @Step("Click on sign up button")
    public void clickOnLoginButton() {
        loginPage.clickOnLoginButton();
    }

}
