package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.ProductDescriptionPage;

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
}
