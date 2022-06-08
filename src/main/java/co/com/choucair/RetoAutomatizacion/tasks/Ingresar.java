package co.com.choucair.RetoAutomatizacion.tasks;

import co.com.choucair.RetoAutomatizacion.userinterface.AbrirPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Ingresar implements Task {
    public static Ingresar credenciales() {
        return Tasks.instrumented(Ingresar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Enter.theValue("demo").into(AbrirPagina.USUARIO),
                    Enter.theValue("demo").into(AbrirPagina.CONTRASENA),
                    Click.on(AbrirPagina.INICIAR));
    }
}
