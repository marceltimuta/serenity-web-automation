package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.Navigation;

public class NavigationSteps extends ScenarioSteps {

    private Navigation navigation;

    @Step("Click on Sign Up link")
    public void clickOnSignUpLink() {
        navigation.clickOnSignUpLink();
    }

    @Step("Click on login link")
    public void clickOnLoginLink() {navigation.clickOnLoginLink();}

    @Step("Verify that user is logged successfully")
    public void verifyThatUserIsLoggedSuccessfully() {
        navigation.verifyThatUserIsLoggedSuccessfully();
    }

    @Step("Click on laptops category")
    public void clickOnLaptopsCategory() {
        navigation.clickOnLaptopsCategory();
    }
}
