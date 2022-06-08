package co.com.choucair.RetoAutomatizacion.questions;

import co.com.choucair.RetoAutomatizacion.userinterface.AbrirPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Validar implements Question<Boolean> {
    public Validar(String respuesta) {
        this.respuesta = respuesta;
    }

    private String respuesta;
    public static Validar ventanaPrincipal(String respuesta) {
        return new Validar(respuesta);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String mensaje = Text.of(AbrirPagina.VENTANA_PRINCIPAL).viewedBy(actor).asString();
        if (respuesta.equals(mensaje)){
            result = true;
        } else{
            result = false;
        }
         return result;
    }
}
