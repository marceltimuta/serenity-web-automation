package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pageObjects.CartPage;

public class CartSteps extends ScenarioSteps {

    private CartPage cartPage;

    @Step("Open cart page")
    public void setCookie() { cartPage.setCookie(); }

    @Step("Verify that total price is correct")
    public void checkThatTotalPriceIsCorrect() {
        cartPage.checkThatTotalPriceIsCorrect();
    }

    @Step("Check the number of products in cart")
    public void checkTheNumberOfProductsInCart(int shouldBe) {
        cartPage.checkTheNumberOfProductsInCart(shouldBe);
    }

    @Step("Remove first product")
    public void removeFirstProduct() {
        cartPage.removeFirstProduct();
    }

    @Step("Click on place order button")
    public void clickOnPlaceOrder() { cartPage.clickOnPlaceOrder();
    }

    @Step("Remove all products from cart")
    public void removeAllProductsFromCart() { cartPage.removeAllProductsFromCart();
    }
}
