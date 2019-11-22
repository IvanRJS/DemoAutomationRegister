package co.com.choucair.certification.automationtesting.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import java.util.ArrayList;
import java.util.List;

import static co.com.choucair.certification.automationtesting.userinterfaces.DemoAutomationPage.*;
import static java.util.Arrays.*;

public class SeleccionarHobbies implements Interaction {

    private String data;
    private String separador;

    public SeleccionarHobbies(String data, String separador){
        this.data = data;
        this.separador=separador;}

    public static SeleccionarHobbies desde(String data,  String separador){return Tasks.instrumented(SeleccionarHobbies.class,data,separador);}

    @Override
    public <T extends Actor> void performAs(T actor) {

        ArrayList<Target> elements= new ArrayList<>(asList(CHECKBOX_CRICKET,
                                                            CHECKBOX_MOVIES,
                                                            CHECKBOX_HOCKEY));

        List<String> hobbiesList = new ArrayList<>(asList(data.split(separador)));

        for (Target checkbox : elements) {
            if (hobbiesList.contains(checkbox.resolveFor(actor).getAttribute("value"))) {
                actor.attemptsTo(Click.on(checkbox));
            }
        }
    }
    }
