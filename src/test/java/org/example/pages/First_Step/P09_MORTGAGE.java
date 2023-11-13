package org.example.pages.First_Step;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P09_MORTGAGE {
    public WebElement MORTGAGE() { return Hooks.driver.findElement(By.xpath("//img[@src='img/mortgage.png']")); }

    public WebElement MORTGAGE_label()
    {
        return Hooks.driver.findElement(By.id("lblMortgage"));
    }
}
