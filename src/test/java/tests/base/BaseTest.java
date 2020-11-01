package tests.base;

import common.RestAPI;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class BaseTest {

    protected RestAPI restAPI = new RestAPI();

    @Managed(driver = "Chrome")
    public WebDriver webDriver;

    @Before
    public void before() {
        getDriver().manage().window().maximize();
    }

}
