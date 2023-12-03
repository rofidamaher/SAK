package org.example.pages.SALE;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P06_04_SALE_COMMERCIAL_REGISTRATION {

    public WebElement txtPercentFristParty() {
        return Hooks.driver.findElement(By.id("txtPercentFristParty"));
    }
    public WebElement txtPercentSecondParty() {
        return Hooks.driver.findElement(By.id("txtPercentSecondParty"));
    }
    public WebElement SALE_PERMIT_NO_COMPANY() {
        return Hooks.driver.findElement(By.id("3741"));
    }
    public WebElement SALE_PERMIT_VALUE_COMPANY() {
        return Hooks.driver.findElement(By.id("3750"));
    }
    public WebElement SALE_PERMIT_NO_APPROVAL_LETTER_COMPANY() {
        return Hooks.driver.findElement(By.id("3751"));
    }
    public WebElement btnAddDebagaToTable() {
        return Hooks.driver.findElement(By.id("btnAddDebagaToTable"));
    }


}
