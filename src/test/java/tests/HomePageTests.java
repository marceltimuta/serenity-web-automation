package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.HomepageSteps;
import steps.NavigationSteps;
import tests.base.BaseTest;

@RunWith(SerenityRunner.class)
public class HomePageTests extends BaseTest {

    @Steps
    private NavigationSteps navigationSteps;

    @Steps
    private HomepageSteps homepageSteps;

    @Before
    public void beforeMethod() {
        homepageSteps.open();
    }

    @Test
    @Title("Verify that clicking on “laptops” on the homepage will display laptops")
    public void testLaptopsPage() {
        navigationSteps.clickOnLaptopsCategory();
        homepageSteps.verifyThatOnlyLaptopsAreShown();
    }

    @Test
    @Title("Verify that clicking on “monitors” on the homepage will display monitors")
    public void testMonitorsPage() {
        navigationSteps.clickOnMonitorsCategory();
        homepageSteps.verifyThatOnlyMonitorsAreShown();
    }
}
