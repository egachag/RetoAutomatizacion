package co.com.choucair.RetoAutomatizacion.tasks;

import co.com.choucair.RetoAutomatizacion.userinterface.AbrirPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Seleccionar implements Task {
    public static Seleccionar ventas() {
        return Tasks.instrumented(Seleccionar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AbrirPagina.INICIAR));

    }
}
