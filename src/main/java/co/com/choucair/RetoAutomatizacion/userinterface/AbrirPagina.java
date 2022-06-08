package co.com.choucair.RetoAutomatizacion.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demo.opencart.com/admin/index.php?route=common/login")
public class AbrirPagina extends PageObject {
    public static final Target USUARIO = Target.the("Campo del Usuario")
            .located(By.id("input-username"));
    public static final Target CONTRASENA = Target.the("Campo de la contraseña")
            .located(By.id("input-password"));
    public static final Target INICIAR = Target.the("Boton de ingreso")
            .located(By.xpath("//*[@id=\"form-login\"]/div[3]/button"));
    public static final Target CERRAR_ALERTA = Target.the("Boton de cerrar")
            .located(By.xpath("//*[@id=\"modal-security\"]/div/div/div[1]/button"));
    public static final Target VENTANA_PRINCIPAL = Target.the("Validar Dashboard")
            .located(By.xpath("//*[@id=\"content\"]/div[1]/div/h1"));

    public static final Target VENTAS = Target.the("Ingresar Ventas")
            .located(By.xpath("//*[@id=\"menu-sale\"]/a"));
    public static final Target ORDENES = Target.the("Ingresar Orden")
            .located(By.xpath("//*[@id=\"collapse-4\"]/li[1]/a"));
    public static final Target NUEVA_ORDEN = Target.the("Agregar ORDEN")
            .located(By.xpath("//*[@id=\"content\"]/div[1]/div/div/a/i"));
    public static final Target NUEVO_PRODUCTO = Target.the("Agregar Producto")
            .located(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div[2]/table[1]/tfoot/tr/td[2]/button/i"));
    public static final Target PRODUCTO = Target.the("Campo del Producto")
            .located(By.id("input-product"));
    public static final Target CANTIDAD = Target.the("Campo cantidad de productos")
            .located(By.id("input-quantity"));
    public static final Target SELECCION_COLOR = Target.the("Campo seleccion del color")
            .located(By.id("input-option-226"));
    public static final Target COLOR = Target.the("Campo color del producto")
            .located(By.xpath("//*[@id=\"input-option-226\"]/option[2]"));
    public static final Target BOTON_GUARDAR = Target.the("BOTON GUARDAR")
            .located(By.id("button-product-add"));

}
