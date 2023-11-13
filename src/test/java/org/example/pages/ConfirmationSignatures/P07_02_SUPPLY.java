package org.example.pages.ConfirmationSignatures;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P07_02_SUPPLY {



    public WebElement CONTRACT_VALUE(){
        return Hooks.driver.findElement(By.id("738"));
    }

    public WebElement GOODS_DATA(){
        return Hooks.driver.findElement(By.id("13"));
    }

}
