package com.nttdata.steps;

import com.nttdata.page.MyStorePage;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class StoreQASteps {

    private WebDriver driver;

    //constructor
    public StoreQASteps(WebDriver driver){
        this.driver = driver;
    }

    public void Iniciarsesion() {
        this.driver.findElement(MyStorePage.IniciarSesion).click();
    }
    /**
     * Escribir el usuario
     * @param user el usuario
     */
    public void typeUser(String user){
        WebElement userInputElement = driver.findElement(MyStorePage.user);
        userInputElement.sendKeys(user);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(MyStorePage.login));
    }

    /**
     * Escribir el password
     * @param password el password del usuario
     */
    public void typePassword(String password){

        this.driver.findElement(MyStorePage.pass).sendKeys(password);
    }

    /**
     * Hacer click en el botón login
     */
    public void login(){

        this.driver.findElement(MyStorePage.login).click();
    }


    public void Iniciocat(String cat) {
        this.driver.findElement(MyStorePage.clothes).click();
    }

    public void InicioSub(String subcat) {
        this.driver.findElement(MyStorePage.men).click();
    }

    public void AddCarrito(int cant) {
        this.driver.findElement(MyStorePage.polo).click();
        this.driver.findElement(MyStorePage.cantidad).click();
        this.driver.findElement(MyStorePage.addCarrito).click();
    }

    public void valProdAdd(String detalle) {
        this.driver.findElement(MyStorePage.confirProd);

        //Assertions.assertEquals("Producto añadido correctamente a su carrito de compra",nombre);

    }

    public void valMontAdd() {
       this.driver.findElement(MyStorePage.total);

    }

    public void Finalizarcompra() {
        this.driver.findElement(MyStorePage.finalizarCompra).click();
    }

    public void valTitulo(String nombre) {
       String titulo = this.driver.findElement(MyStorePage.nombreCarrito).getText();
        Assertions.assertEquals(nombre, titulo);
    }

    public void valMontAdd2(String preciofinal) {
        String precio=this.driver.findElement(MyStorePage.total2).getText();

        Assertions.assertEquals("S/ 38.24", precio);
    }
}
