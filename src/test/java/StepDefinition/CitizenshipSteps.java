package StepDefinition;

import POM.DialogContentElement;
import POM.NavigationBarElements;
import io.cucumber.java.en.When;


public class CitizenshipSteps {

    NavigationBarElements navigationBarElements;
    DialogContentElement dialogContentElement;

    @When("User create citizenship with {string} name and {string} shortname")
    public void user_create_citizenship_with_name_and_shortname(String name, String shortName) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElement = new DialogContentElement();

        navigationBarElements.userNavigateCitizenshipPage();
        dialogContentElement.createCitizenship(name, shortName);


    }

    @When("User edit {string} citizenship to {string}")
    public void user_edit_citizenship_to(String existingCitizenshipName, String newCitizenshipName) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElement = new DialogContentElement();

        navigationBarElements.userNavigateCitizenshipPage();
        dialogContentElement.editCitizenhip(existingCitizenshipName, newCitizenshipName);



    }

    @When("User delete {string} citizenship")
    public void user_delete_citizenship(String updatedName) {
        navigationBarElements = new NavigationBarElements();
        dialogContentElement = new DialogContentElement();

        navigationBarElements.userNavigateCitizenshipPage();
        dialogContentElement.deleteCitizenship(updatedName);

    }
}