package tests;

import common.Constants;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import steps.AlertSteps;
import steps.HomepageSteps;
import steps.LoginSteps;
import steps.NavigationSteps;

public class LoginTests extends BaseTest {

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private HomepageSteps homepageSteps;

    @Steps
    private NavigationSteps navigationSteps;

    @Steps
    private AlertSteps alertSteps;

    @Test
    @Title("Login success")
    public void loginTestSuccess() {
        homepageSteps.open();
        navigationSteps.clickOnLoginLink();
        loginSteps.fillUsernameField(Constants.REGISTERED_USER);
        loginSteps.fillPasswordField(Constants.REGISTERED_USER_PASSWORD);
        loginSteps.clickOnLoginButton();
        navigationSteps.verifyThatUserIsLoggedSuccessfully();
    }

    @Test
    @Title("Login success")
    public void loginTestFail() {
        homepageSteps.open();
        navigationSteps.clickOnLoginLink();
        loginSteps.fillUsernameField(Constants.REGISTERED_USER);
        loginSteps.fillPasswordField("admin2020");
        loginSteps.clickOnLoginButton();
        alertSteps.verifyAlertMessage("Wrong password.");
    }
}
