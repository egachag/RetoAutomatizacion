package co.com.choucair.RetoAutomatizacion.questions;

import co.com.choucair.RetoAutomatizacion.userinterface.AbrirPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Mensaje implements Question<Boolean> {
    public Mensaje(String resultado) {
        this.resultado = resultado;
    }

    private String resultado;
    public static Mensaje exitoso(String resultado) {
        return new Mensaje(resultado);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String mensaje = Text.of(AbrirPagina.MENSAJE_EXITOSO).viewedBy(actor).asString();
        if (resultado.equals(mensaje)){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
