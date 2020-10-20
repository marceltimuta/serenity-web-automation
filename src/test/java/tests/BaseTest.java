package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

@RunWith(SerenityRunner.class)
public class BaseTest {

    @Managed(driver = "Chrome")
    public WebDriver webDriver;

    @Before
    public void setUp() {
        getDriver().manage().window().maximize();
    }

}
