package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class Navigation extends PageObject {

    @FindBy(linkText = "Sign up")
    private WebElement signUp;

    public void clickOnSignUpLink() {
        signUp.click();
    }
}
