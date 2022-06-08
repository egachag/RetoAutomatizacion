package co.com.choucair.RetoAutomatizacion.stepdefinitions;

import co.com.choucair.RetoAutomatizacion.questions.Validar;
import co.com.choucair.RetoAutomatizacion.tasks.AbrirNavegador;
import co.com.choucair.RetoAutomatizacion.tasks.Cerrar;
import co.com.choucair.RetoAutomatizacion.tasks.Ingresar;
import co.com.choucair.RetoAutomatizacion.tasks.Seleccionar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class midefinicion {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("^que Elvia ingresa a la pagina de Opencart$")
    public void queElviaIngresaALaPaginaDeOpencart() {
    OnStage.theActorCalled("Elvia").wasAbleTo(AbrirNavegador.urlApp());
    }


    @Y("^digito los datos correctos de inicio$")
    public void digitoLosDatosCorrectosDeInicio() {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.credenciales());

    }

    @Cuando("^cierro la notificacion de alerta$")
    public void cierroLaNotificacionDeAlerta() {
        OnStage.theActorInTheSpotlight().attemptsTo(Cerrar.alerta());

    }

    @Entonces("^verifico pagina principal \"([^\"]*)\"$")
    public void verificoPaginaPrincipal(String respuesta) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validar.ventanaPrincipal(respuesta)));

    }

    @Y("^que estamos en la opcion ordenes de la categoria Ventas$")
    public void queEstamosEnLaOpcionOrdenesDeLaCategoriaVentas() {
        OnStage.theActorInTheSpotlight().attemptsTo(Seleccionar.ventas());
    }

    @Cuando("^agrego un producto a la nueva orden$")
    public void agregoUnProductoALaNuevaOrden() {

    }

    @Entonces("^verifico mensaje de exito \"([^\"]*)\"$")
    public void verificoMensajeDeExito(String arg1) {

    }

    @Dado("^que estamoe en la opcion cupones de la funcionalidad Maketing$")
    public void queEstamoeEnLaOpcionCuponesDeLaFuncionalidadMaketing() {

    }

    @Cuando("^selecciono y elimino el cupon que se desee eliminar$")
    public void seleccionoYEliminoElCuponQueSeDeseeEliminar() {

    }

    @Entonces("^\"([^\"]*)\"Are you sure\\?\"$")
    public void areYouSure(String arg1) {

    }

}