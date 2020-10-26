package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pageObjects.Alert;

public class AlertSteps extends ScenarioSteps {

    private Alert alert;

    @Step("Verify alert message")
    public void verifyAlertMessage(String expected) {
         alert.verifyAlertMessage(expected);
    }
}
