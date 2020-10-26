package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pageObjects.OrderConfirmationModal;

public class OrderConfirmationSteps extends ScenarioSteps {

    private OrderConfirmationModal orderConfirmationModal;

    @Step("Verify that order was successfullt placed message")
    public void verifySuccessMessageText() {orderConfirmationModal.verifySuccessMessageText();}
}
