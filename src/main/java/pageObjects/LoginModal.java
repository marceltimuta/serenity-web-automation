package pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class LoginModal extends PageObject {

    @FindBy(css = "#loginusername")
    private WebElement emailField;

    @FindBy(css = "#loginpassword")
    private WebElement passwordField;

    @FindBy(css = "button[onclick='logIn()']")
    private WebElement loginButton;


    public void fillUsernameField(String username) {
        emailField.sendKeys(username);
    }

    public void fillPasswordField(String password) {
        passwordField.sendKeys(password);
    }

    public void clickOnLoginButton() {
        loginButton.click();
    }
}
