package POM;

import Utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePOM {  // we have usable methods for us page classes

    WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver,10);


    public void waitUntilVisibleAndClickableTenClick(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

}
