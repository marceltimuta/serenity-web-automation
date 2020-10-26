package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pageObjects.Navigation;

public class NavigationSteps extends ScenarioSteps {

    private Navigation navigation;

    @Step("Click on Sign Up link")
    public void clickOnSignUpLink() {
        navigation.clickOnSignUpLink();
    }

    @Step("Click on login link")
    public void clickOnLoginLink() {navigation.clickOnLoginLink();}

    @Step("Click on cart link")
    public void clickOnCartLink() {navigation.clickOnCartLink();}

    @Step("Verify that user is logged successfully")
    public void verifyThatUserIsLoggedSuccessfully() {
        navigation.verifyThatUserIsLoggedSuccessfully();
    }

    @Step("Click on laptops category")
    public void clickOnLaptopsCategory() {
        navigation.clickOnLaptopsCategory();
    }

    @Step("Click on Monitors category")
    public void clickOnMonitorsCategory() {
        navigation.clickOnMonitorsCategory();
    }
}
