package pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class OrderConfirmationModal extends PageObject {

    @FindBy(css = ".sweet-alert h2")
    private WebElement orderThankYouMessage;

    @FindBy(css = ".confirm.btn.btn-lg.btn-primary")
    private WebElement orderConfirmOk;

    public void verifySuccessMessageText() {
        assertEquals("Text message is not correct",
                "Thank you for your purchase!",
                 orderThankYouMessage.getText());
        orderConfirmOk.click();
        assertEquals("User is not redirected to homepage","https://demoblaze.com/index.html",getDriver().getCurrentUrl());
    }
}
