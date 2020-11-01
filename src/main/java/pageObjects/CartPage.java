package pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

import java.util.List;

@DefaultUrl("/cart.html")
public class CartPage extends PageObject {

    @FindBy(css = ".success")
    private List<WebElement> products;

    @FindBy(css = "td:nth-child(2)")
    private List<WebElement> productNames;

    @FindBy(css = "td:nth-child(3)")
    private List<WebElement> productPrices;

    @FindBy(linkText = "Delete")
    private List<WebElement> deleteProduct;

    @FindBy(css = "#totalp")
    private WebElement totalPrice;

    @FindBy(css = "button[data-target='#orderModal']")
    private WebElement placeOrderButton;

    public void setCookie() {
        getDriver().manage().addCookie(new Cookie("user", "b5d47874-5b15-c7d8-11af-a021c8b3328c"));
    }

    public void removeCookie() {
        getDriver().manage().deleteAllCookies();
    }

    public void checkThatTotalPriceIsCorrect() {
        assertEquals("Product total price is not the same as cart price",calculateTotalProductPrice(), totalPrice.getText());
    }

    public void clickOnPlaceOrder() { placeOrderButton.click();
    }

    private String calculateTotalProductPrice() {
        Integer sum = 0;
        for (int i = 0; i < productPrices.size(); i++) {
            sum += Integer.parseInt(productPrices.get(i).getText());
        }
        return sum.toString();
    }

    public void checkTheNumberOfProductsInCart(int shouldBe) {
        assertEquals(shouldBe, products.size());
    }

    public void removeFirstProduct() {
        if (deleteProduct.size() > 0) {
            deleteProduct.get(0).click();
        }
    }

    public void removeAllProductsFromCart() {
        int listSize = products.size();

        for (int i = 0; i < listSize; i++) {
            deleteProduct.get(0).click();
            waitABit(1000);
        }
    }
}
