package co.com.choucair.RetoAutomatizacion.tasks;

import co.com.choucair.RetoAutomatizacion.userinterface.AbrirPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Agregar implements Task {
    public static Agregar producto() {
        return Tasks.instrumented(Agregar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AbrirPagina.NUEVA_ORDEN),
                Click.on(AbrirPagina.NUEVO_PRODUCTO),
                //Click.on(AbrirPagina.PRODUCTO),
                //Click.on(AbrirPagina.LISTA),
                //Click.on(AbrirPagina.SELECCION_LISTA),
                Enter.theValue("iMac").into(AbrirPagina.PRODUCTO),
                //Enter.theValue("1").into(AbrirPagina.CANTIDAD),
                //Click.on(AbrirPagina.SELECCION_COLOR),
                //Click.on(AbrirPagina.COLOR),
                Click.on(AbrirPagina.BOTON_GUARDAR)
        );

    }
}
