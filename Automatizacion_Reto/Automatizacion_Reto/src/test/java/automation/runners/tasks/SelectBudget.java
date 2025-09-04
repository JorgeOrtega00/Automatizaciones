package automation.runners.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import automation.runners.userinterfaces.aeroPage;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectBudget implements Task {

    public static SelectBudget option(){
        return instrumented(SelectBudget.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(aeroPage.PRESUPUESTO_OPTION)
        );

    }
}
