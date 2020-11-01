package tests;

import static common.Constants.*;

import common.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.AlertSteps;
import steps.HomepageSteps;
import steps.LoginSteps;
import steps.NavigationSteps;
import tests.base.BaseTest;

@RunWith(SerenityRunner.class)
public class LoginTests extends BaseTest {

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private HomepageSteps homepageSteps;

    @Steps
    private NavigationSteps navigationSteps;

    @Steps
    private AlertSteps alertSteps;

    @Before
    public void beforeMethod() {
        homepageSteps.open();
        navigationSteps.clickOnLoginLink();
    }

    @Test
    @Title("Login success")
    public void testLoginSuccess() {
        loginSteps.fillUsernameField(REGISTERED_USER);
        loginSteps.fillPasswordField(REGISTERED_USER_PASSWORD);
        loginSteps.clickOnLoginButton();
        navigationSteps.verifyThatUserIsLoggedSuccessfully();
    }

    @Test
    @Title("Login with Wrong password")
    public void testLoginWithWrongPassword() {
        loginSteps.fillUsernameField(REGISTERED_USER);
        loginSteps.fillPasswordField(REGISTERED_USER_WRONG_PASSWORD);
        loginSteps.clickOnLoginButton();
        alertSteps.verifyAlertMessage(LOGIN_WRONG_PASSWORD_MESSAGE);
    }

    @Test
    @Title("Login with empty password field")
    public void testLoginWithEmptyPassword() {
        loginSteps.fillUsernameField(REGISTERED_USER);
        loginSteps.clickOnLoginButton();
        alertSteps.verifyAlertMessage(LOGIN_MISSING_PASSWORD_MESSAGE);
    }
}
