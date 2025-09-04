package pages.login;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.SetUpReport;

public class Login {
    private static WebDriver _driver;
    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement campoUsuario;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement campoContrasena;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement btnLogin;

    public Login(WebDriver driver){
        _driver = driver;
        PageFactory.initElements(_driver, this);
    }
    public void LoginSteps(String Url,String User,String Pass) throws Exception{
        ExtentSparkReporter spark = new ExtentSparkReporter("Practica Selenium/src/Reports/Spark.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(spark);
        ExtentTest test = extent.createTest("Login");
        try{
            System.out.println(Url);
            System.out.println(User);
            System.out.println(Pass);
            _driver.get(Url);
            try {
                //campoUsuario.clear();
                campoUsuario.sendKeys(User);
                String base64Screenshot = ((TakesScreenshot) _driver).getScreenshotAs(OutputType.BASE64);
                if(campoUsuario != null){
                test.pass("Se introdujo el usuario correctamente", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
                extent.flush();}
                else {
                    test.fail("Se produjo un error al introducir el usuario",MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
                    extent.flush();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try {
                //campoContrasena.clear();
                campoContrasena.sendKeys(Pass);
                String base64Screenshot = ((TakesScreenshot) _driver).getScreenshotAs(OutputType.BASE64);
                if (campoContrasena != null) {
                    test.pass("Se introdujo el usuario correctamente", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
                    extent.flush();
                }else {
                    test.fail("Se produjo un error al introducir el usuario",MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
                    extent.flush();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try {
                btnLogin.click();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        } catch (Exception e) {
            System.out.println("Validacion de inicio de sesion con error "+e);
            throw new RuntimeException(e);
        }
    }

}
