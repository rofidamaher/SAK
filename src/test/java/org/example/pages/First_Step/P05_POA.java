package org.example.pages.First_Step;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P05_POA {

   public WebElement POA_SPECIAL()
{
    return Hooks.driver.findElement(By.xpath("//img[@ng-src='img/POA_SPECIAL.png']"));
}

    public WebElement POA_label()
    {
        return Hooks.driver.findElement(By.id("referrer"));
    }
    public WebElement POA_PARTIAL_STEPPED()
    {
        return Hooks.driver.findElement(By.xpath("//img[@ng-src='img/POA_PARTIAL_STEPPED.png']"));
    }

    public WebElement POA_TERMINATION()
    {
        return Hooks.driver.findElement(By.xpath("//img[@ng-src='img/POA_TERMINATION.png']"));
    }
    public WebElement POA_PARTIAL_TERMINATION()
    {
        return Hooks.driver.findElement(By.xpath("//img[@ng-src=\"img/POA_PARTIAL_TERMINATION.png\"]"));
    }


}
