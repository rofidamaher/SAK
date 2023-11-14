package org.example.pages.MORTGAGE;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P09_02_MORTGAGE_RE {

    public WebElement ddlNationalityFirstParty_chosen() {
        return Hooks.driver.findElement(By.id("ddlNationalityFirstParty_chosen"));
    }

    public WebElement textname() {
        return Hooks.driver.findElement(By.id("txtNameFirstParty"));
    }
    public WebElement childType_chosen() {
        return Hooks.driver.findElement(By.id("childType_chosen"));
    }
    public WebElement MORTGAGE_NAME_RE() {
        return Hooks.driver.findElement(By.id("3785"));
    }
    public WebElement MORTGAGE_RE_FROM() {
        return Hooks.driver.findElement(By.id("3786"));
    }

    public WebElement MORTGAGE_RE_TO() {
        return Hooks.driver.findElement(By.id("3787"));
    }

    public WebElement MORTGAGE_VALUE_RE() {
        return Hooks.driver.findElement(By.id("3788"));
    }
    public WebElement MORTGAGE_NO_APPROVAL_LETTER_RE() {
        return Hooks.driver.findElement(By.id("3789"));
    }
    public WebElement btnAddDebagaToTable() {
        return Hooks.driver.findElement(By.id("btnAddDebagaToTable"));
    }



}