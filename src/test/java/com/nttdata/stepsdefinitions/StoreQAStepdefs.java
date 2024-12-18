package com.nttdata.stepsdefinitions;

import com.nttdata.steps.StoreQASteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;

public class StoreQAStepdefs {

    private WebDriver driver;
    StoreQASteps storeQA;

    @Dado("estoy en la página de la tienda")
    public void estoyEnLaPaginaDeLaTienda() {
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store/pe/");
        storeQA = new StoreQASteps(driver);
        screenShot();
        //Selecciono Iniciar Sesion
        storeQA.Iniciarsesion();
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Y("me logueo con mi usuario {string} y clave {string}")
    public void meLogueoConMiUsuarioYClave(String user, String password) {
        storeQA = new StoreQASteps(driver);
        storeQA.typeUser(user);
        storeQA.typePassword(password);
        storeQA.login();
        screenShot();

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Cuando("navego a la categoria {string} y subcategoria {string}")
    public void navegoALaCategoriaYSubcategoria(String cat, String subcat) {
        storeQA = new StoreQASteps(driver);
        storeQA.Iniciocat(cat);
        storeQA.InicioSub(subcat);
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Y("agrego {int} unidades del primer producto al carrito")
    public void agregoUnidadesDelPrimerProductoAlCarrito(int cant) {
        storeQA = new StoreQASteps(driver);
        storeQA.AddCarrito(cant);
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /*@Entonces("valido en el popup la confirmación del producto agregado")
    public void validoEnElPopupLaConfirmacionDelProductoAgregado() {
        storeQA.valProdAdd();
    }*/

    @Entonces("valido en el popup la confirmación del {string}")
    public void validoEnElPopupLaConfirmacionDel(String prodAdd) {
        storeQA.valProdAdd(prodAdd);

    }

    @Y("valido en el popup que el monto total sea calculado correctamente")
    public void validoEnElPopupQueElMontoTotalSeaCalculadoCorrectamente() {
        storeQA.valMontAdd();

    }

    @Cuando("finalizo la compra")
    public void finalizoLaCompra() {
        storeQA.Finalizarcompra();
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Entonces("valido el titulo de la pagina del {string}")
    public void validoElTituloDeLaPaginaDel(String nombre) {
        storeQA.valTitulo(nombre);

    }


    @Y("vuelvo a validar el calculo de {string} en el carrito")
    public void vuelvoAValidarElCalculoDeEnElCarrito(String precio) {
        storeQA.valMontAdd2(precio);

    }


}
