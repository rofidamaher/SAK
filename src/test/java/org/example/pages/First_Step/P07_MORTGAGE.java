package org.example.pages.First_Step;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P07_MORTGAGE {
   public WebElement AGREEMENT() {
       return Hooks.driver.findElement(By.xpath("//img[@ng-src='img/AGREEMENT.png']"));
   }

    public WebElement Treatment_label()
    {
        return Hooks.driver.findElement(By.id("referrer"));
    }

    public WebElement SUPPLY() {
        return Hooks.driver.findElement(By.xpath("//img[@ng-src='img/SUPPLY.png']"));
    }




}
