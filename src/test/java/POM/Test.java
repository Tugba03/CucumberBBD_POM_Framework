package POM;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Test extends BasePOM{



    public Test(){
        PageFactory.initElements(driver, this);
    }

        @FindBy(css = "input[formcontrolname='username']")
        private WebElement usernameInput;

        @FindBy(css = "input[formcontrolname='password']")
        private WebElement passwordInput;

        @FindBy(css = "button[aria-label='LOGIN']")
        private WebElement loginButton;

        @FindBy(xpath = "//button[text()='Accept all cookies']")
        private WebElement acceptAllCookiesButton;

        @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
        private WebElement dashboardText;

        private String username = "richfield.edu";
        private String password = "Richfield2020!";

        public void validateUserLoginPage() {
            Assert.assertTrue(usernameInput.isDisplayed());
            Assert.assertTrue(passwordInput.isDisplayed());
            Assert.assertTrue(loginButton.isDisplayed());
        }

        public void userEnterAdminCredentials() {
            acceptAllCookiesButton.click();
            usernameInput.sendKeys(username);
            passwordInput.sendKeys(password);
            loginButton.click();
        }

        public void validateUserSuccessfullyLoggedIn() {
            wait.until(ExpectedConditions.visibilityOf(dashboardText));
            Assert.assertTrue(dashboardText.isDisplayed());

        }



    }