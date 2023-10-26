package org.example.pages.SALE;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P06_01_SALE_COMPANY {



    public WebElement civilId(){
        return Hooks.driver.findElement(By.id("txtConfirmFirstParty"));
    }

    public WebElement txtPercentFristParty(){
        return Hooks.driver.findElement(By.id("txtPercentFristParty"));
    }

}
