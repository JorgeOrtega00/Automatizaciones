package automation.runners.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import automation.runners.userinterfaces.aeroPage;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavigateToTransparency implements Task{

    public static NavigateToTransparency menu() {
        return instrumented(NavigateToTransparency.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(aeroPage.TRANSPARENCIA_MENU)
        );
    }
}
