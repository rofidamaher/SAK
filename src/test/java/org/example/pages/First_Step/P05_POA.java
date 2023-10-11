package org.example.pages.First_Step;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P05_POA {

   public WebElement Tawkel_rasmy()
{
    return Hooks.driver.findElement(By.xpath("//img[@ng-src='img/POA_SPECIAL.png']"));
}

    public WebElement Tawkel_rasmy_label()
    {
        return Hooks.driver.findElement(By.id("referrer"));
    }

}
