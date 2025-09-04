package automation.runners.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenAeroPage implements Task {

    private final String url;

    public OpenAeroPage(String url) {
        this.url = url;
    }

    public static OpenAeroPage at(String url){
        return instrumented(OpenAeroPage.class,url);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(url)
        );
    }



}
