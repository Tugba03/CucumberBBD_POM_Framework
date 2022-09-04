package POM;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DialogContentElement extends BasePOM {
    public DialogContentElement() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "(//ms-text-field[contains(@placeholder,'GENERAL.FIELD')]//input)[2]")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "(//ms-text-field[contains(@placeholder,'GENERAL.FIELD')]//input)[1]")
    private WebElement nameSearchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-edit-button//button")
    private WebElement editButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "(//mat-dialog-actions//div//span)[4]")
    private WebElement deleteButton2;


    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.SHORTNAME']//input")
    private WebElement shortnameInput;

    private String countryName = "TgbsonCountry";
    private String countryCode = "Htdr14585";


    public void userEnterCountryCredential() {
        waitUntilVisibleAndClickableTenClick(addButton);
        wait.until(ExpectedConditions.visibilityOf(nameInput)).sendKeys(countryName);
        wait.until(ExpectedConditions.visibilityOf(codeInput)).sendKeys(countryCode);
        waitUntilVisibleAndClickableTenClick(saveButton);

    }

    public void validateSuccessMessage() {

        wait.until(ExpectedConditions.visibilityOf(successMessage));
        Assert.assertTrue(successMessage.isDisplayed());
        Assert.assertTrue(successMessage.getText().toLowerCase().contains("successfully"));
    }

    public void userEditCountryName() {
        nameSearchInput.sendKeys("TgbsonCountry");
        waitUntilVisibleAndClickableTenClick(searchButton);
        waitUntilVisibleAndClickableTenClick(editButton);
        nameInput.clear();
        nameInput.sendKeys("TugbaNewCountry");
        waitUntilVisibleAndClickableTenClick(saveButton);


    }

    public void userDeleteCountryName() {
        nameSearchInput.sendKeys("TugbaNewCountry");
        waitUntilVisibleAndClickableTenClick(searchButton);
        waitUntilVisibleAndClickableTenClick(deleteButton);
        waitUntilVisibleAndClickableTenClick(deleteButton2);

    }

    public void createCitizenship(String name, String shortName){
       waitUntilVisibleAndClickableTenClick(addButton);
       nameInput.sendKeys(name);
       shortnameInput.sendKeys(shortName);
       waitUntilVisibleAndClickableTenClick(saveButton);
    }

    public void editCitizenhip(String existingName, String newName){
        nameSearchInput.sendKeys(existingName);
        waitUntilVisibleAndClickableTenClick(searchButton);
        waitUntilVisibleAndClickableTenClick(editButton);
        nameInput.clear();
        nameInput.sendKeys(newName);
        waitUntilVisibleAndClickableTenClick(saveButton);
    }

    public void deleteCitizenship(String updatedName){

    nameSearchInput.sendKeys(updatedName);
    waitUntilVisibleAndClickableTenClick(searchButton);
    waitUntilVisibleAndClickableTenClick(deleteButton);
    waitUntilVisibleAndClickableTenClick(deleteButton2);


    }
}
