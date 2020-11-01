package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.AlertSteps;
import steps.HomepageSteps;
import steps.NavigationSteps;
import steps.SignUpSteps;
import tests.base.BaseTest;

import static common.Constants.*;

@RunWith(SerenityRunner.class)
public class RegisterTests extends BaseTest {

    @Steps
    private HomepageSteps homepageSteps;

    @Steps
    private NavigationSteps navigationSteps;

    @Steps
    private SignUpSteps signUpSteps;

    @Steps
    private AlertSteps alertSteps;

    @Before
    public void beforeMethod() {
        homepageSteps.open();
        navigationSteps.clickOnSignUpLink();
    }

    @Test
    @Title("Successful register")
    public void registerSuccess() {
        signUpSteps.fillUsernameField(RandomStringUtils.randomAlphanumeric(10));
        signUpSteps.fillPasswordField(VALID_PASSWORD);
        signUpSteps.clickOnSignUpButton();
        alertSteps.verifyAlertMessage(REGISTER_SUCCESS_ALERT_MESSAGE);
    }

    @Test
    @Title("Try to register a new user with empty fields")
    public void registerWithEmptyFields() {
        signUpSteps.clickOnSignUpButton();
        alertSteps.verifyAlertMessage(REGISTER_FAIL_EMPTY_FIELD);
    }

    @Test
    @Title("Try to register a new user with existing account")
    public void registerWithExistingAccount() {
        signUpSteps.fillUsernameField(REGISTERED_USER);
        signUpSteps.fillPasswordField(REGISTERED_USER_PASSWORD);
        signUpSteps.clickOnSignUpButton();
        alertSteps.verifyAlertMessage(REGISTER_FAIL_EXISTING_USER);
    }
}
