package pages.login;
import com.aventstack.extentreports.model.Report;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    private static WebDriver _driver;
    private Report report;

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement campoUsuario;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement campoContrasena;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement btnLogin;

    public Login(WebDriver driver,Report report){
        this.report = report;
        _driver = driver;
        PageFactory.initElements(_driver, this);
    }

    public void LoginSteps(String Url,String User,String Pass) throws Exception{
        try{
            System.out.println(Url);
            System.out.println(User);
            System.out.println(Pass);
            _driver.get(Url);
            try {
                //campoUsuario.clear();
                campoUsuario.sendKeys(User);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try {
                //campoContrasena.clear();
                campoContrasena.sendKeys(Pass);
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
