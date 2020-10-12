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
}
