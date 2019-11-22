package co.com.choucair.certification.automationtesting.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.certification.automationtesting.userinterfaces.DemoAutomationPage.TEXTO_SALIDA;

public class TextoSalida implements Question<Boolean> {
    private String frase;

    public TextoSalida(String frase) {
        this.frase  = frase;
    }

    public static TextoSalida es(String frase) {return new TextoSalida(frase);    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String salida = Text.of(TEXTO_SALIDA).viewedBy(actor).asString();
        return frase.equals(salida);
    }
}
