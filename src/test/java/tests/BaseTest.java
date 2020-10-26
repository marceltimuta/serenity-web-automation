package tests;

import common.RestAPI;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

@RunWith(SerenityRunner.class)
public class BaseTest {

    protected RestAPI restAPI = new RestAPI();

    @Managed(driver = "Chrome")
    public WebDriver webDriver;

    @Before
    public void before() {
        getDriver().manage().window().maximize();
    }

}
