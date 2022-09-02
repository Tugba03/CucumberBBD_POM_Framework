package POM;

import Utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePOM {  // we have usable methods for us page classes

    WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver,10);

}
