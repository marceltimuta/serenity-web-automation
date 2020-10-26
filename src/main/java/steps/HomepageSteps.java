package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pageObjects.HomePage;

public class HomepageSteps extends ScenarioSteps {

	private HomePage homePage;

	@Step("Open website")
	public void open(){
		homePage.open();
	}

	@Step("Click on galaxy s6 product")
	public void clickOnGalaxyS6Phone(){
		homePage.clickOnGalaxyS6Phone();
	}

	@Step("Get PLP product price")
	public String getPrice() {
		return homePage.getProductPrice();
	}

	@Step("Get PLP product description")
	public String getDescription() {
		return homePage.getProductDescription();
	}

	@Step("Verify that only laptops are displayed on the page")
    public void verifyThatOnlyLaptopsAreShown() {
		homePage.verifyThatOnlyLaptopsAreShown();
    }

    @Step("Verify that only monitors are displayed on the page")
	public void verifyThatOnlyMonitorsAreShown() { homePage.verifyThatOnlyMonitorsAreShown();
	}
}
