package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.swing.plaf.PanelUI;
import java.time.Duration;

public class DriverSettings {
    public enum DriverType{
        CHOME,FIREFOX, CHROME, EDGE
    }
    public static WebDriver getBrowser(){
        WebDriver _driver = null;
        String _browserName = System.getProperty("browser", DriverType.CHROME.toString()).toUpperCase();
        DriverType _driverType = DriverType.valueOf(_browserName);

        switch (_driverType) {
            case CHROME:
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--disable-infobars");
                options.addArguments("--disable-notifications");
                options.addArguments("--disable-save-password-bubble");
                options.addArguments("--ignore-certificate-errors");
                options.addArguments("--disable-blink-features=AutomationControlled");

                _driver = new ChromeDriver(options);
                break;
            case FIREFOX:
                _driver = new FirefoxDriver();
                break;
            case EDGE:
                _driver = new EdgeDriver();
                break;
        }
        _driver.manage().window().maximize();
        _driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return _driver;
    }
}
