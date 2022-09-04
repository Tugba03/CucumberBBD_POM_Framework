package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationBarElements extends BasePOM{

    public NavigationBarElements(){
        PageFactory.initElements(driver, this); }

    @FindBy(css = "[class='nav-link-title ng-tns-c249-7 ng-star-inserted']")
    private WebElement clickSetup;

    @FindBy(css = "[class='nav-link-title ng-tns-c249-8 ng-star-inserted'")
    private WebElement clickParameter;

    @FindBy(xpath = "(//span[contains(text(),'Countries')])[1]")
    private WebElement clickCountry;

    @FindBy(xpath = "//span[text()='Citizenships']/..")
    private WebElement citizenshipButton;


    public void userOnCountriesPage(){
        clickSetup.click();
        clickParameter.click();
        clickCountry.click();

    }

    public void userNavigateCitizenshipPage(){
        clickSetup.click();
        clickParameter.click();
        citizenshipButton.click();

    }

}
