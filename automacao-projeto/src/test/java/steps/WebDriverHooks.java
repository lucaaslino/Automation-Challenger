package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class WebDriverHooks {
    private static WebDriver driver;

    @SuppressWarnings("deprecation")
	@Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

   
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    } 
    

    public static WebDriver getDriver() {
        return driver;
    }
}
