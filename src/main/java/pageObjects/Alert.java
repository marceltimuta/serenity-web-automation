package pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class Alert extends PageObject {

    private String getAlertMessage() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 2);
        wait.until(ExpectedConditions.alertIsPresent());

        return getDriver().switchTo().alert().getText();
    }

    public void verifyAlertMessage(String expected) {
        assertEquals("Wrong message",expected, getAlertMessage());
    }
}
