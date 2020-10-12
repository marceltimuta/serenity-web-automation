package tests;

import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import steps.AlertSteps;
import steps.HomepageSteps;
import steps.NavigationSteps;
import steps.SignUpSteps;

import static common.Constants.*;

public class RegisterTests extends BaseTest {

    @Steps
    private HomepageSteps homepageSteps;

    @Steps
    private NavigationSteps navigationSteps;

    @Steps
    private SignUpSteps signUpSteps;

    @Steps
    private AlertSteps alertSteps;

    @Test
    @Title("Successful register")
    public void test1() {
        homepageSteps.open();
        navigationSteps.clickOnSignUpLink();
        signUpSteps.fillUsernameField(VALID_EMAIL);
        signUpSteps.fillPasswordField(VALID_PASSWORD);
        signUpSteps.clickOnSignUpButton();
        alertSteps.verifyAlertMessage(REGISTER_SUCCESS_ALERT_MESSAGE);
    }

    @Test
    @Title("Fail register")
    public void test2() {
        homepageSteps.open();
        navigationSteps.clickOnSignUpLink();
        signUpSteps.clickOnSignUpButton();
        alertSteps.verifyAlertMessage(REGISTER_FAIL_EMPTY_FIELD);
    }
}
