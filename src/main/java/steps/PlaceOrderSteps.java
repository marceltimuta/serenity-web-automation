package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pageObjects.PlaceOrderModal;

public class PlaceOrderSteps extends ScenarioSteps {

    private PlaceOrderModal placeOrderModal;

    @Step("Fill place order fields")
    public void fillPlaceOrderFields() {placeOrderModal.fillPlaceOrderFields();}

    @Step("Leave card number field empty")
    public void fillPlaceOrderFieldsExceptCardField() { placeOrderModal.fillPlaceOrderFieldsExceptCardField();
    }
}
