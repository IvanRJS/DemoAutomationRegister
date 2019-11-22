package co.com.choucair.certification.automationtesting.tasks;

import co.com.choucair.certification.automationtesting.userinterfaces.DemoAutomationPageRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {
    private DemoAutomationPageRegister demoAutomationPageRegister;

    public static Abrir laPaginaDeAutomationTestingRegister() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(demoAutomationPageRegister));
    }
}
