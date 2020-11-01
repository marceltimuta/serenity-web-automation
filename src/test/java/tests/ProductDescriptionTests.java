package tests;

import common.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Before;
import org.junit.Test;

import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.runner.RunWith;
import steps.AlertSteps;
import steps.HomepageSteps;
import steps.ProductDescriptionSteps;
import tests.base.BaseTest;

import static common.Constants.PRODUCT_ADDED_TO_CART_MESSAGE;

@RunWith(SerenityRunner.class)
public class ProductDescriptionTests extends BaseTest {

    @Steps
    private HomepageSteps homepageSteps;

    @Steps
    private ProductDescriptionSteps productDescriptionSteps;

    @Steps
    private AlertSteps alertSteps;

    @Before
    public void beforeMethod() {
        homepageSteps.open();
    }

    @Test
    @Title("Verify that clicking on a product redirects the user to the corresponding product page")
    public void testProductPage() {
        homepageSteps.clickOnGalaxyS6Phone();
        productDescriptionSteps.checkProductName("Samsung galaxy s6");
    }

    @Test
    @Title("Verify that the price of a product is the same on the homepage as on the product page")
    public void testProductPrice() {
        homepageSteps.savePrice();
        homepageSteps.clickOnGalaxyS6Phone();
        productDescriptionSteps.verifyPlpandPdpPrice(homepageSteps.getPrice());
    }

    @Test
    @Title("Verify that the description of a product is the same on the homepage as on the product page")
    public void testProductDescription() {
        homepageSteps.saveDescription();
        homepageSteps.clickOnGalaxyS6Phone();
        productDescriptionSteps.verifyPlpandPdpDescription(homepageSteps.getDescription());
    }

    @Test
    @Title("Test the add to cart button on the product page.")
    public void testAddToCart() {
        homepageSteps.clickOnGalaxyS6Phone();
        productDescriptionSteps.clickOnAddToCart();
        alertSteps.verifyAlertMessage(PRODUCT_ADDED_TO_CART_MESSAGE);
    }
}
