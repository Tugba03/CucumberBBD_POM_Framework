package StepDefinition;

import Utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Hooks { // Hooks class including @before and @After annotations before each scenario it will navigate the website for us and after
    //each scenario quit the driver.
   WebDriver driver = Driver.getDriver();

    @Before
    public void setup(){
        driver.get("https://demo.mersys.io/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After
    public void tearDown(){
        Driver.quitDriver();
    }



}
