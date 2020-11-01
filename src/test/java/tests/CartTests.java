package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.*;
import tests.base.BaseTest;

@RunWith(SerenityRunner.class)
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
    public void beforeMethod() {
        homepageSteps.open();
    }

    private void addProductsToCart() {
        cartSteps.setCookie();
        restAPI.addProductToCart("969375fd-b02d-3860-afd9-f7953213e590",8);
        restAPI.addProductToCart("03510156-4d33-28b9-f6a2-54d69dd9b010",4);
    }

    @Test
    @Title("Check that total price is correct")
    public void testTotalPrice() {
        addProductsToCart();
        navigationSteps.clickOnCartLink();
        cartSteps.checkThatTotalPriceIsCorrect();
    }

    @Test
    @Title("Remove one product")
    public void testRemoveOneProduct() {
        addProductsToCart();
        navigationSteps.clickOnCartLink();
        cartSteps.checkTheNumberOfProductsInCart(2);
        cartSteps.removeFirstProduct();
        cartSteps.checkTheNumberOfProductsInCart(1);
    }

    @Test
    @Title("Place Order success")
    public void testPlaceOrder() {
        addProductsToCart();
        navigationSteps.clickOnCartLink();
        cartSteps.clickOnPlaceOrder();
        placeOrderSteps.fillPlaceOrderFields();
        orderConfirmationSteps.verifySuccessMessageText();
    }

    @Test
    @Title("Place Order with empty card field")
    public void testPlaceOrderWithEmptyCardField() {
        addProductsToCart();
        navigationSteps.clickOnCartLink();
        cartSteps.clickOnPlaceOrder();
        placeOrderSteps.fillPlaceOrderFieldsExceptCardField();
        alertSteps.verifyAlertMessage("Please fill out Name and Creditcard.");
    }

    @Test
    @Title("Remove all products from cart")
    public void testRemoveAllProducts() {
        addProductsToCart();
        navigationSteps.clickOnCartLink();
        cartSteps.checkTheNumberOfProductsInCart(2);
        cartSteps.removeAllProductsFromCart();
        cartSteps.checkTheNumberOfProductsInCart(0);
    }

    @Test
    @Title("Place an order with no products in cart")
    public void testPlaceEmptyOrder() {
        navigationSteps.clickOnCartLink();
        cartSteps.checkTheNumberOfProductsInCart(0);
        cartSteps.clickOnPlaceOrder();
    }
}
