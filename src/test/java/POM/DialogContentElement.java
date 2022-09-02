package POM;

import io.cucumber.messages.Messages;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DialogContentElement extends BasePOM{
    public DialogContentElement(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addCountry;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "(//ms-text-field[contains(@placeholder,'GENERAL.FIELD')]//input)[2]")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    private String countryName = "TgbsonCountry";
    private String countryCode = "Htdr14585";


    public void userEnterCountryCredential(){
    wait.until(ExpectedConditions.visibilityOf(addCountry)).click();
    wait.until(ExpectedConditions.visibilityOf(nameInput)).sendKeys(countryName);
    wait.until(ExpectedConditions.visibilityOf(codeInput)).sendKeys(countryCode);
    wait.until(ExpectedConditions.visibilityOf(saveButton)).click();

    }

    public void validateSuccessMessage(){

        wait.until(ExpectedConditions.visibilityOf(successMessage));
        Assert.assertTrue(successMessage.isDisplayed());
        Assert.assertTrue(successMessage.getText().contains("successfully"));
    }
}
