package StepDefinition;

import POM.DialogContentElement;
import POM.NavigationBarElements;
import io.cucumber.java.en.*;

public class CountriesSteps {

    NavigationBarElements navigationBarElements;
    DialogContentElement dialogContentElement;

    @When("User create Country")
    public void user_create_country() {
    navigationBarElements = new NavigationBarElements();
    dialogContentElement = new DialogContentElement();

    navigationBarElements.userOnCountriesPage();
    dialogContentElement.userEnterCountryCredential();





    }
    @Then("Success message should be displayed")
    public void success_message_should_be_displayed() {

    dialogContentElement= new DialogContentElement();
    dialogContentElement.validateSuccessMessage();

    }
}
