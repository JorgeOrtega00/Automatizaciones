package automation.runners.stepdefinitions;

import automation.runners.questions.ValidacionPDF;
import automation.runners.tasks.*;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class AeroStepDefinitions {
    @Dado("que el usuario abre la pagina de Aerocivil")
    public void abriPagina(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Usuario");
    }

    @Cuando("navega al menú de Transparencia")
    public void navegarTransparencia() {
        OnStage.theActorInTheSpotlight().attemptsTo(NavigateToTransparency.menu());
    }

    @Cuando("selecciona la opción Presupuesto")
    public void seleccionarPresupuesto() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectBudget.option());
    }

    @Cuando("selecciona la opción Plan de acción")
    public void seleccionarPlanAccion() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectPlanDeAccion.option());
    }

    @Cuando("abre el documento PRESENTACIÓN A LA CIUDADANIA en modo lectura")
    public void abrirDocumento() {
        OnStage.theActorInTheSpotlight().attemptsTo(OpenCitizenPresentation.pdf());
    }

    @Entonces("el PDF generado debe ser el correcto")
    public void validarPdf() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(ValidacionPDF.isCorrect(), is(true))
        );
    }
}
