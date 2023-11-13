package org.example.pages.MORTGAGE_COMPANY;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P10_01_MORTGAGE_COMPANY {

    public WebElement MORTGAGE_COMPANY()
    {
        return Hooks.driver.findElement(By.xpath("//img[@ng-src='img/MORTGAGE_COMPANY.png']"));
    }

    public WebElement MORTGAGE_COMPANY_label()
    {
        return Hooks.driver.findElement(By.id("referrer"));
    }

}
