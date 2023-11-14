package org.example.pages.First_Step;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P04_DOCUMENTATION_P {

   public WebElement POA() {
       return Hooks.driver.findElement(By.xpath("//img[@src='img/documentation.png']"));
   }

    public WebElement POA_label()
    {
        return Hooks.driver.findElement(By.id("lblPOA"));
    }

    public WebElement SALE() {
        return Hooks.driver.findElement(By.xpath("//img[@src='img/Sale.png']"));
    }

    public WebElement SALE_label()
    {
        return Hooks.driver.findElement(By.id("lblSale"));
    }
    public WebElement AUTH() {
        return Hooks.driver.findElement(By.xpath("//img[@src='img/POA_STAMPED.png']"));
    }

    public WebElement AUTH_label()
    {
        return Hooks.driver.findElement(By.id("lblAUTH"));
    }

    public WebElement MORTGAGE() { return Hooks.driver.findElement(By.xpath("//img[@src='img/mortgage.png']")); }

    public WebElement MORTGAGE_label()
    {
        return Hooks.driver.findElement(By.id("lblMortgage"));
    }
}
