package test;
import com.aventstack.extentreports.model.Report;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import utils.DriverSettings;

public class TestLogin {
    private static WebDriver driver;
    private static Report report;

    @BeforeAll
    public static void setUp() throws Exception{
        driver = DriverSettings.getBrowser();
        report = new Report();
    }
    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            driver.quit();  // Cerrar el navegador al final de la prueba
        }
    }
    @Test
    public void TestLoginSucceds() throws Throwable{
        pages.login.Login login = new pages.login.Login(driver,report);

        String URL = "https://www.saucedemo.com/v1/";
        String User = "standard_user";
        String Pass = "secret_sauce";

        try {
            login.LoginSteps(URL,User,Pass);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



}
