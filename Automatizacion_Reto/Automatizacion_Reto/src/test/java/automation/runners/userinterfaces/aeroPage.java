package automation.runners.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class aeroPage {
    public static final Target TRANSPARENCIA_MENU = Target.the("opción transparencia")
            .located(By.xpath("//a[contains(text(),'Transparencia')]"));

    public static final Target PRESUPUESTO_OPTION = Target.the("opción presupuesto")
            .located(By.xpath("//a[contains(text(),'Presupuesto')]"));

    public static final Target PLAN_ACCION_MENU = Target.the("menú plan de acción")
            .located(By.xpath("//a[contains(text(),'Plan de acción')]"));

    public static final Target PLAN_ACCION_SUBMENU = Target.the("submenú plan de acción")
            .located(By.xpath("//a[contains(text(),'´Plan de Acción')]"));

    public static final Target PDF_CIUDADANIA = Target.the("documento presentación a la ciudadanía")
            .located(By.xpath("//a[contains(text(),'PRESENTACIÓN A LA CIUDADANIA')]"));

    public static final Target MODO_LECTURA_BTN = Target.the("botón modo lectura")
            .located(By.xpath("//button[contains(text(),'Modo lectura')]"));

}
