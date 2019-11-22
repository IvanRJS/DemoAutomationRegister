package co.com.choucair.certification.automationtesting.stepdefinitions;

import co.com.choucair.certification.automationtesting.models.DataModel;
import co.com.choucair.certification.automationtesting.questions.TextoSalida;
import co.com.choucair.certification.automationtesting.tasks.Abrir;
import co.com.choucair.certification.automationtesting.tasks.LlenarDatos;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AutomationTestingStepDefinitions {
    @Before
    public void configuracionInicial() {
        setTheStage(new OnlineCast());
    }
    @Dado("^que (.*) quiere acceder a la Web Automation Demo Site$")
    public void queIvanQuiereAccederALaWebAutomationDemoSite(String ivan)  {
        theActorCalled(ivan).wasAbleTo(Abrir.laPaginaDeAutomationTestingRegister());

    }

    @Cuando("^el realiza el registro en la página$")
    public void elRealizaElRegistroEnLaPágina(List<DataModel> dataSet)  {
        theActorInTheSpotlight().attemptsTo(LlenarDatos.delFormulario(dataSet));
    }

    @Entonces("^el verifica que se carga la pantalla con el (.*)$")
    public void elVerificaQueSeCargaLaPantallaConElTexto(String frase)  {
       theActorInTheSpotlight().should(seeThat(TextoSalida.es(frase)));

    }
}
