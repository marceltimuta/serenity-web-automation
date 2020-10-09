package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import steps.HomepageSteps;
import steps.ProductDescriptionSteps;

@RunWith(SerenityRunner.class)
public class ProductDescriptionTests extends BaseTest {

    @Steps
    private HomepageSteps homepageSteps;

    @Steps
    private ProductDescriptionSteps productDescriptionSteps;

    @Test
    @Title("Verify that clicking on a product redirects the user to the corresponding product page")
    public void test1() {
        homepageSteps.open();
        homepageSteps.clickOnGalaxyS6Phone();
        productDescriptionSteps.checkProductName("Samsung galaxy s6");
    }

    @Test
    @Title("Verify that the price of a product is the same on the homepage as on the product page")
    public void test2() {
        homepageSteps.open();
        String price = homepageSteps.getPrice();
        homepageSteps.clickOnGalaxyS6Phone();
        productDescriptionSteps.verifyPlpandPdpPrice(price);
    }

    @Test
    @Title("Verify that the description of a product is the same on the homepage as on the product page")
    public void test3() {
        homepageSteps.open();
        String description = homepageSteps.getDescription();
        homepageSteps.clickOnGalaxyS6Phone();
        productDescriptionSteps.verifyPlpandPdpDescription(description);
    }
}
