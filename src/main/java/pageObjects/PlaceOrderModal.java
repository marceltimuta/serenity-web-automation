package pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class PlaceOrderModal extends PageObject {

    @FindBy(css = "#name")
    private WebElement nameField;

    @FindBy(css = "#country")
    private WebElement countryField;

    @FindBy(css = "#city")
    private WebElement cityField;

    @FindBy(css = "#card")
    private WebElement cardField;

    @FindBy(css = "#month")
    private WebElement monthField;

    @FindBy(css = "#year")
    private WebElement yearField;

    @FindBy(css = "button[onclick='purchaseOrder()']")
    private WebElement purchaseButton;

    private void typeName(String name) {nameField.sendKeys(name); }

    private void typeCountry(String country) {countryField.sendKeys(country);}

    private void typeCity(String city) {cityField.sendKeys(city);}

    private void typeCardNumber(String card) {cardField.sendKeys(card);}

    private void typeMonth(String month) {monthField.sendKeys(month);}

    private void typeYear(String year) {yearField.sendKeys(year);}

    public void clickOnPurchaseButton() {purchaseButton.click();}

    public void fillPlaceOrderFields() {
        typeName("Test user");
        typeCountry("Germany");
        typeCity("Berlin");
        typeCardNumber("4242 4242 4242 4242");
        typeMonth("11");
        typeYear("2025");
        clickOnPurchaseButton();
    }

    public void fillPlaceOrderFieldsExceptCardField() {
        typeName("Test user");
        typeCountry("Germany");
        typeCity("Berlin");
        typeMonth("11");
        typeYear("2025");
        clickOnPurchaseButton();
    }
}
