package co.com.choucair.certification.automationtesting.tasks;

import co.com.choucair.certification.automationtesting.interactions.SeleccionarGenero;
import co.com.choucair.certification.automationtesting.interactions.SeleccionarHobbies;
import co.com.choucair.certification.automationtesting.interactions.SeleccionarLenguajes;
import co.com.choucair.certification.automationtesting.models.DataModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.questions.Text;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.List;

import static co.com.choucair.certification.automationtesting.userinterfaces.DemoAutomationPage.*;
import static co.com.choucair.certification.automationtesting.utils.Constantes.CERO;
import static co.com.choucair.certification.automationtesting.utils.Constantes.COMA;
import static java.util.Arrays.*;

public class LlenarDatos implements Task {
    private List<DataModel> dataSet;

    public LlenarDatos(List<DataModel> dataSet) {
        this.dataSet = dataSet;
    }

    public static LlenarDatos delFormulario(List<DataModel> dataSet) {
        return Tasks.instrumented(LlenarDatos.class, dataSet);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TEXTO_FIRST_NAME),
                Enter.theValue(dataSet.get(CERO).getFirst_name()).into(TEXTO_FIRST_NAME),
                Click.on(TEXTO_LAST_NAME),
                Enter.theValue(dataSet.get(CERO).getLast_name()).into(TEXTO_LAST_NAME),
                Click.on(TEXTO_ADDRESS),
                Enter.theValue(dataSet.get(CERO).getAddress()).into(TEXTO_ADDRESS),
                Click.on(TEXTO_EMAIL),
                Enter.theValue(dataSet.get(CERO).getEmail()).into(TEXTO_EMAIL),
                Click.on(TEXTO_PHONE),
                Enter.theValue(dataSet.get(CERO).getPhone()).into(TEXTO_PHONE),
                SeleccionarGenero.desde(dataSet.get(CERO).getGender()),
                Scroll.to(CHECKBOX_CRICKET),
                SeleccionarHobbies.desde(dataSet.get(CERO).getHobbies(), COMA),
                Scroll.to(DIV_LENGUAJES),
                Click.on(DIV_LENGUAJES),
                SeleccionarLenguajes.desde(LISTA_LENGUAJES, dataSet.get(CERO).getLanguages(), COMA),
                SelectFromOptions.byVisibleText(dataSet.get(CERO).getSkills()).from(SELECT_SKILLS),
                SelectFromOptions.byVisibleText(dataSet.get(CERO).getCountry()).from(SELECT_COUNTRY),
                Scroll.to(SELECT_COUNTRY),
                Click.on(SPAN_COUNTRY),
                Enter.theValue(dataSet.get(CERO).getSelect_country()).into(TEXTO_COUNTRY).thenHit(Keys.ENTER),
                SelectFromOptions.byVisibleText(dataSet.get(CERO).getYear()).from(SELECT_YEAR),
                SelectFromOptions.byVisibleText(dataSet.get(CERO).getMonth()).from(SELECT_MONTH),
                SelectFromOptions.byVisibleText(dataSet.get(CERO).getDay()).from(SELECT_DAY),
                Scroll.to(BOTON_SUBMIT),
                Click.on(TEXTO_PASSWORD),
                Enter.theValue(dataSet.get(CERO).getPassword()).into(TEXTO_PASSWORD),
                Click.on(TEXTO_CONFIRMPASSWORD),
                Enter.theValue(dataSet.get(CERO).getConfirm_password()).into(TEXTO_CONFIRMPASSWORD),
                Click.on(BOTON_SUBMIT)
        );

    }
}
