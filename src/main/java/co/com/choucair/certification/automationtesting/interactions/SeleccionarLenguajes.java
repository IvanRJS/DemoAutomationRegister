package co.com.choucair.certification.automationtesting.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class SeleccionarLenguajes implements Interaction {
    private Target lista;
    private String datos;
    private String separador;

    public SeleccionarLenguajes(Target lista, String datos, String separador) {
        this.lista = lista;
        this.datos = datos;
        this.separador = separador;
    }

    public static SeleccionarLenguajes desde(Target listaLanguages, String languages, String separador) {
        return new SeleccionarLenguajes(listaLanguages,languages,separador);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String[] separadordatos = datos.split(separador);
        List<WebElementFacade> listObjeto = lista.resolveAllFor(actor);
        for (WebElementFacade webElementFacade : listObjeto) {
            for (String separadordato : separadordatos) {
                if (webElementFacade.getText().trim().equals(separadordato)) {
                    webElementFacade.click();
                    break;
                }
            }
        }
    }
}
