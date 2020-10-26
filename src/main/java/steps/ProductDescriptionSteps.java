package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pageObjects.ProductDescriptionPage;

public class ProductDescriptionSteps extends ScenarioSteps {

    private ProductDescriptionPage productDescriptionPage;

    @Step("Verify product name")
    public void checkProductName(String name) {
        productDescriptionPage.checkProductName(name);
    }

    @Step("Verify PLP and PDP prices")
    public void verifyPlpandPdpPrice(String plpPrice) {
        productDescriptionPage.verifyPlpandPdpPrice(plpPrice);
    }

    @Step("Verify PLP and PDP description")
    public void verifyPlpandPdpDescription(String plpDesc) {
        productDescriptionPage.verifyPlpandPdpDescription(plpDesc);
    }

    @Step("Click on Add to cart button")
    public void clickOnAddToCart() {
        productDescriptionPage.clickOnAddToCart();
    }

    @Step
    public void verifyAlertMessage(String expectedMessage) {
        productDescriptionPage.verifyAlertMessage(expectedMessage);
    }
}
