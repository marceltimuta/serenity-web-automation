package pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class SignUpModal extends PageObject {

    @FindBy(css = "#sign-username")
    private WebElement usernameField;

    @FindBy(css = "#sign-password")
    private WebElement passwordField;

    @FindBy(css = "#signInModal button.btn.btn-primary")
    private WebElement signUpButton;

    public void fillUsernameField(String username) {
        usernameField.click();
        usernameField.sendKeys(username);
    }

    public void fillPasswordField(String password) {
        passwordField.click();
        passwordField.sendKeys(password);
    }

    public void clickOnSignUpButton() {
        signUpButton.click();
    }
}
