package tests;

import common.RestAPI;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Before;
import org.junit.Test;
import steps.*;

public class CartTests extends BaseTest {

    @Steps
    private CartSteps cartSteps;

    @Steps
    private HomepageSteps homepageSteps;

    @Steps
    private NavigationSteps navigationSteps;

    @Steps
    private PlaceOrderSteps placeOrderSteps;

    @Steps
    private OrderConfirmationSteps orderConfirmationSteps;

    @Steps
    private AlertSteps alertSteps;

    @Before
    public void setUp() {
        restAPI.addProductToCart("969375fd-b02d-3860-afd9-f7953213e590",8);
        restAPI.addProductToCart("03510156-4d33-28b9-f6a2-54d69dd9b010",4);

        homepageSteps.open();
        cartSteps.setCookie();
    }

    @Test
    @Title("Check that total price is correct")
    public void checkTotalPrice() {
        navigationSteps.clickOnCartLink();
        cartSteps.checkThatTotalPriceIsCorrect();
    }

    @Test
    @Title("Remove one product")
    public void removeOneProduct() {
        navigationSteps.clickOnCartLink();
        cartSteps.checkTheNumberOfProductsInCart(2);
        cartSteps.removeFirstProduct();
        cartSteps.checkTheNumberOfProductsInCart(1);
    }

    @Test
    @Title("Place Order success")
    public void placeOrder() {
        navigationSteps.clickOnCartLink();
        cartSteps.checkTheNumberOfProductsInCart(2);
        cartSteps.clickOnPlaceOrder();
        placeOrderSteps.fillPlaceOrderFields();
        orderConfirmationSteps.verifySuccessMessageText();
    }

    @Test
    @Title("Place Order with empty card field")
    public void placeOrderWithEmptyCardField() {
        navigationSteps.clickOnCartLink();
        cartSteps.checkTheNumberOfProductsInCart(2);
        cartSteps.clickOnPlaceOrder();
        placeOrderSteps.fillPlaceOrderFieldsExceptCardField();
        alertSteps.verifyAlertMessage("Please fill out Name and Creditcard.");
    }

    @Test
    @Title("Remove all products from cart")
    public void removeAllProducts() {
        navigationSteps.clickOnCartLink();
        cartSteps.checkTheNumberOfProductsInCart(2);
        cartSteps.removeAllProductsFromCart();
        cartSteps.checkTheNumberOfProductsInCart(0);
    }

}
