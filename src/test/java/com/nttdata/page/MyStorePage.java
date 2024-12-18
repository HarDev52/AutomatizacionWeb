package com.nttdata.page;

import org.openqa.selenium.By;

public class MyStorePage {
    //Localizadores de elementos
    public static By IniciarSesion = By.xpath("//div[@class=\"user-info\"]/a");
    public static By user= By.xpath("//*[@id=\"field-email\"]");
    public static By pass = By.xpath("//*[@id=\"field-password\"]");
    public static By login = By.xpath("//*[@id=\"submit-login\"]");
    public static By clothes = By.xpath("//*[@id=\"category-3\"]/a");
    public static By men = By.xpath("//*[@id=\"subcategories\"]/ul/li[1]/div[1]/a/picture/img");
    public static By polo = By.xpath("//*[@id=\"js-product-list\"]/div[1]/div/article/div/div[1]/a/picture/img");
    public static By cantidad = By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[1]/div/span[3]/button[1]/i");
    public static By addCarrito = By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button");
    public static By total = By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/p[4]/span[2]");
    public static By confirProd = By.xpath("//*[@id=\"myModalLabel\"]");
    public static By finalizarCompra = By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a");
    public static By nombreCarrito = By.xpath("//*[@id=\"main\"]/div/div[1]/div/div[1]/h1");
    public static By total2 = By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/div[1]/div[2]/div[2]/span[2]");
}
