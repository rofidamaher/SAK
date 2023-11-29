package org.example.pages.SALE;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P06_05_SALE_SHARE_COMMERCIAL_REGISTRATION {

   public WebElement SALE_PERMIT_NO_COMPANY() {
        return Hooks.driver.findElement(By.id("3752"));
    }
    public WebElement SALE_PERMIT_VALUE_COMPANY() {
        return Hooks.driver.findElement(By.id("3761"));
    }
    public WebElement SALE_PERMIT_NO_APPROVAL_LETTER_COMPANY() {
        return Hooks.driver.findElement(By.id("3762"));
    }
    public WebElement btnAddDebagaToTable() {
        return Hooks.driver.findElement(By.id("btnAddDebagaToTable"));
    }


}
