package co.com.choucair.certification.automationtesting.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.choucair.certification.automationtesting.userinterfaces.DemoAutomationPage.RADIO_FEMALE;
import static co.com.choucair.certification.automationtesting.userinterfaces.DemoAutomationPage.RADIO_MALE;

public class SeleccionarGenero implements Interaction {
    private String gender;
    public SeleccionarGenero(String gender) {
        this.gender = gender;
    }

    public static SeleccionarGenero desde(String gender) {
        return Tasks.instrumented(SeleccionarGenero.class, gender);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Target opcion = gender.equals(RADIO_FEMALE.resolveFor(actor).getText().trim())
                ?RADIO_FEMALE
                :RADIO_MALE;
        actor.attemptsTo(Click.on((opcion)));
    }
}
