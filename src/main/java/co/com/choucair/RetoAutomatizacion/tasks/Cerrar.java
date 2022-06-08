package co.com.choucair.RetoAutomatizacion.tasks;

import co.com.choucair.RetoAutomatizacion.userinterface.AbrirPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class Cerrar implements Task{
    public static Cerrar alerta() {
        return Tasks.instrumented(Cerrar.class);


    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Click.on(AbrirPagina.CERRAR_ALERTA)
    );

    }
}
