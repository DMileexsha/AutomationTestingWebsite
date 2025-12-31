package configs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    public static WebDriver driver;
    public static WebDriver initBrowser (String browser){
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver= new ChromeDriver();
        }
        else {
            throw  new RuntimeException("we don't support this browser");
        }
        return driver;
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void quiteDriver(){
        if (driver!= null){
            driver.quit();
            driver= null;
        }
    }
}
