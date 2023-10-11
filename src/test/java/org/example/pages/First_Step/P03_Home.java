package org.example.pages.First_Step;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P03_Home {

   public WebElement doc()
{
    return Hooks.driver.findElement(By.xpath("//img[@ng-src='img/DOCUMENTATION_P.png']"));
}

    public WebElement doc_label()
    {
        return Hooks.driver.findElement(By.id("liDocumentation"));
    }

}
