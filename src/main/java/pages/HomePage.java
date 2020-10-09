package pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

@DefaultUrl("https://demoblaze.com/")
public class HomePage extends PageObject {

    @FindBy(css = ".col-lg-4:nth-child(1) .card-img-top")
    private WebElement galaxyS6Phone;

    @FindBy(css = "#tbodyid > div:nth-child(1) h5")
    private WebElement productPrice;

    @FindBy(css = "#tbodyid > div:nth-child(1) #article")
    private WebElement productDescription;

    public void clickOnGalaxyS6Phone() {
        galaxyS6Phone.click();
    }

    public String getProductPrice() {
        return productPrice.getText();
    }

    public String getProductDescription() {
        return productDescription.getText();
    }

}