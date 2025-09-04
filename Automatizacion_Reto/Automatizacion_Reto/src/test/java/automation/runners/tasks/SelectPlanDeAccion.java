package automation.runners.tasks;

import automation.runners.userinterfaces.aeroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectPlanDeAccion implements Task{

    public static SelectPlanDeAccion option() {
        return instrumented(SelectPlanDeAccion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(aeroPage.PLAN_ACCION_MENU),
                Click.on(aeroPage.PLAN_ACCION_SUBMENU)
        );
    }
}
