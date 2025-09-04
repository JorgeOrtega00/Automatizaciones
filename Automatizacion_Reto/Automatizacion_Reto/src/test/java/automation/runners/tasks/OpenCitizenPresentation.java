package automation.runners.tasks;

import automation.runners.userinterfaces.aeroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenCitizenPresentation implements Task{

    public static OpenCitizenPresentation pdf(){
        return instrumented(OpenCitizenPresentation.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(aeroPage.PDF_CIUDADANIA),
                Click.on(aeroPage.MODO_LECTURA_BTN)
        );
    }
}
