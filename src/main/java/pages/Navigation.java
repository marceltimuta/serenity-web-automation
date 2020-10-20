package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class Navigation extends PageObject {

    @FindBy(linkText = "Sign up")
    private WebElement signUp;

    @FindBy(css = "#login2")
    private WebElement login;

    @FindBy(css = "#nameofuser")
    private WebElement nameOfUser;

    @FindBy(css = ".list-group #itemc:nth-child(3)")
    private WebElement laptopsCategory;

    public void clickOnSignUpLink() {
        signUp.click();
    }

    public void clickOnLoginLink() { login.click(); }

    public void clickOnLaptopsCategory() {
        laptopsCategory.click();
    }

    public void verifyThatUserIsLoggedSuccessfully() {
        assertTrue("User is not logged",nameOfUser.isDisplayed());
        assertTrue("Name of the user is incorrect",nameOfUser.getText().contains("admin"));
    }
}
