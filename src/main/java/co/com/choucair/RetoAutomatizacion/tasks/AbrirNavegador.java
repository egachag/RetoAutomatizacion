package co.com.choucair.RetoAutomatizacion.tasks;

import co.com.choucair.RetoAutomatizacion.userinterface.AbrirPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirNavegador implements Task {
    private AbrirPagina abrirPagina;

    public static AbrirNavegador urlApp() {
        return Tasks.instrumented(AbrirNavegador.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(abrirPagina));

    }
}
