package tests;

import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import steps.HomepageSteps;
import steps.NavigationSteps;

public class HomePageTests extends BaseTest{

    @Steps
    private NavigationSteps navigationSteps;

    @Steps
    private HomepageSteps homepageSteps;

    @Test
    @Title("Verify that clicking on “laptops” on the homepage will display laptops")
    public void verifyLaptopsPage() {
        homepageSteps.open();
        navigationSteps.clickOnLaptopsCategory();
        homepageSteps.verifyThatOnlyLaptopsAreShown();
    }

    @Test
    @Title("Verify that clicking on “monitors” on the homepage will display monitors")
    public void verifyMonitorsPage() {
        homepageSteps.open();
        navigationSteps.clickOnMonitorsCategory();
        homepageSteps.verifyThatOnlyMonitorsAreShown();
    }
}
