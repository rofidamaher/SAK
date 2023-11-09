package org.example.pages.First_Step;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P08_AUTH {


    public WebElement CONTRACT_ESTABLISHMENT()
    {
        return Hooks.driver.findElement(By.xpath("//a[@href='#/CONTRACT_ESTABLISHMENT/:36']"));
    }

    public WebElement AUTH_label()
    {
        return Hooks.driver.findElement(By.id("referrer"));
    }

}
