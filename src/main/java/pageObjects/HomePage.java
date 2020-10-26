package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class HomePage extends PageObject {

    @FindBy(css = ".col-lg-4:nth-child(1) .card-img-top")
    private WebElement galaxyS6Phone;

    @FindBy(css = "#tbodyid > div:nth-child(1) h5")
    private WebElement productPrice;

    @FindBy(css = "#tbodyid > div:nth-child(1) #article")
    private WebElement productDescription;

    @FindBy(css = "h4.card-title")
    private List<WebElement> productNames;

    private boolean stringContainsItemsFromList(String inputStr, List<String> items) {
            return items.stream().anyMatch(inputStr::contains);
    }

    private void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,500)");
    }

    public void clickOnGalaxyS6Phone() {
        galaxyS6Phone.click();
    }

    public String getProductPrice() {
        return productPrice.getText();
    }

    public String getProductDescription() {
        return productDescription.getText();
    }

    public void verifyThatOnlyLaptopsAreShown() {
        List<String> laptops = Arrays.asList("Sony", "MacBook", "Dell");
        boolean hasOnlyLaptops = true;

        for (WebElement productName : productNames) {
            if (!stringContainsItemsFromList(productName.getText(), laptops)) {
                hasOnlyLaptops = false;
                break;
            }
        }

        assertTrue("Page contains not only laptops", hasOnlyLaptops);
    }

    public void verifyThatOnlyMonitorsAreShown() {
        List<String> monitors = Arrays.asList("Apple monitor 24", "ASUS Full HD");
        boolean hasOnlyMonitors = true;

        for (WebElement productName : productNames) {
            if (!stringContainsItemsFromList(productName.getText(), monitors)) {
                hasOnlyMonitors = false;
                break;
            }
        }

        assertTrue("Page contains not only monitors", hasOnlyMonitors);
    }
}