package org.example.pages.First_Step;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P09_MORTGAGE {

    public WebElement MORTGAGE_LAND()
    {
        return Hooks.driver.findElement(By.xpath("//img[@ng-src='img/MORTGAGE_LAND.png']"));
    }

    public WebElement MORTGAGE_LAND_label()
    {
        return Hooks.driver.findElement(By.id("referrer"));
    }
}
