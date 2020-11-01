package pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

public class ProductDescriptionPage extends PageObject {

    @FindBy(css = ".name")
    private WebElement pdpName;

    @FindBy(css = "#tbodyid > h3")
    private WebElement pdpPrice;

    @FindBy(css = "#more-information > p")
    private WebElement pdpDescription;

    @FindBy(css = "#tbodyid div.row a")
    private WebElement addToCartButton;

    public void clickOnAddToCart() {
        addToCartButton.click();
    }

    public void checkProductName(String name) {
        assertEquals("PDP name is not correct", name, pdpName.getText());
    }

    public void verifyPlpandPdpPrice(String plpPrice) {
        assertEquals("PDP price is not correct", plpPrice, getPrice(pdpPrice.getText()));
    }

    public void verifyPlpandPdpDescription(String plpDesc) {
        assertEquals("PDP description is not correct",plpDesc,pdpDescription.getText());
    }

    private static String getPrice(String input)
    {
        String output = "";

        Pattern pattern = Pattern.compile("\\$\\d+");
        Matcher matcher = pattern.matcher(input);
        if (matcher.find())
        {
            output = matcher.group(0);
        }

        return output;
    }
}
