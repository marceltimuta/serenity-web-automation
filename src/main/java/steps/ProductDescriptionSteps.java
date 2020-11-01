package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pageObjects.ProductDescriptionPage;

public class ProductDescriptionSteps extends ScenarioSteps {

    private ProductDescriptionPage productDescriptionPage;

    @Step("Verify product name to be: {0}")
    public void checkProductName(String name) {
        productDescriptionPage.checkProductName(name);
    }

    @Step("Verify PLP and PDP prices to be: {0}")
    public void verifyPlpandPdpPrice(String plpPrice) {
        productDescriptionPage.verifyPlpandPdpPrice(plpPrice);
    }

    @Step("Verify PLP and PDP description to be: {0}")
    public void verifyPlpandPdpDescription(String plpDesc) {
        productDescriptionPage.verifyPlpandPdpDescription(plpDesc);
    }

    @Step("Click on Add to cart button")
    public void clickOnAddToCart() {
        productDescriptionPage.clickOnAddToCart();
    }

}
