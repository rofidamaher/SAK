package org.example.pages.First_Step;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
<<<<<<< HEAD
=======

>>>>>>> adf37fe (test)
public class P04_DOCUMENTATION_P {

   public WebElement POA() {
       return Hooks.driver.findElement(By.xpath("//img[@src='img/documentation.png']"));
   }

    public WebElement POA_label()
    {
        return Hooks.driver.findElement(By.id("lblPOA"));
    }

    public WebElement SALE() {
        return Hooks.driver.findElement(By.xpath("//img[@src=\"img/Sale.png\"]"));
    }

    public WebElement SALE_label()
    {
        return Hooks.driver.findElement(By.id("lblSale"));
    }



}
