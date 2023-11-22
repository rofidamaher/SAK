package org.example.pages.MORTGAGE;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P09_01_MORTGAGE_LAND {

    public WebElement region_number() {
        return Hooks.driver.findElement(By.id("341"));
    }

    public WebElement space_number() {
        return Hooks.driver.findElement(By.id("342"));
    }

    public WebElement cadastral_number() {
        return Hooks.driver.findElement(By.id("343"));
    }

    public WebElement MORTGAGE_PERIOD_FROM() {
        return Hooks.driver.findElement(By.id("308"));
    }

    public WebElement MORTGAGE_PERIOD_TO() {
        return Hooks.driver.findElement(By.id("309"));
    }



    public WebElement MortgageValue() {
        return Hooks.driver.findElement(By.id("307"));
    }

    public WebElement ApprovalLetterNumber() {
        return Hooks.driver.findElement(By.id("344"));
    }

    public WebElement AddDebagaToTable() {
        return Hooks.driver.findElement(By.id("btnAddDebagaToTable"));
    }

    public WebElement cboxLoadedContent_ok() {
        return Hooks.driver.findElement(By.xpath("//div[@id='cboxLoadedContent']//button"));
    }

    public WebElement AddDebagaRequest() {
        return Hooks.driver.findElement(By.id("btnAddDebagaRequest"));
    }
}
