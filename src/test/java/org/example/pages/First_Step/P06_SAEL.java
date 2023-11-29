package org.example.pages.First_Step;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P06_SAEL {

    public WebElement SALE_COMPANY()
    {
        return Hooks.driver.findElement(By.xpath("//a[@href=\"#/SALE_COMPANY/:28\"]"));
    }

    public WebElement SALE_label()
    {
        return Hooks.driver.findElement(By.id("referrer"));
    }

    public WebElement SALE_LAND()
    {
        return Hooks.driver.findElement(By.xpath("//a[@href=\"#/SALE_LAND/:25\"]"));
    }


    public WebElement SALE_SHARE()
    {
        return Hooks.driver.findElement(By.xpath("//a[@href='#/SALE_SHARE/:24']"));
    }

}
