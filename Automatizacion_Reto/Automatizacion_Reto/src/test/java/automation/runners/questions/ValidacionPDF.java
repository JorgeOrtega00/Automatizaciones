package automation.runners.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionPDF implements Question <Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String currentUrl = net.serenitybdd.core.Serenity.getDriver().getCurrentUrl();
        return currentUrl.contains("PRESENTACION_A_LA_CIUDADANIA");
    }

    public static ValidacionPDF isCorrect(){
        return new ValidacionPDF();
    }
}
