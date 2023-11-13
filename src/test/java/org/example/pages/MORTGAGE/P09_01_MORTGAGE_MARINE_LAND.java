package org.example.pages.MORTGAGE;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P09_01_MORTGAGE_MARINE_LAND {

    public WebElement MORTGAGE_MARINE_LAND()
    {
        return Hooks.driver.findElement(By.xpath("//img[@ng-src='img/MORTGAGE_LAND.png']"));
    }

    public WebElement MORTGAGE_MARINE_LAND_label()
    {
        return Hooks.driver.findElement(By.id("referrer"));
    }
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

    public WebElement datepicker_daysFrom() {
        return Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][1]//div[@class='datepicker-days']//th[@class='date-switch']"));
    }

    public WebElement datepicker_monthsFrom() {
        return Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][1]//div[@class='datepicker-months']//th[@class='date-switch']"));
    }

    public WebElement datepicker_daysTo() {
        return Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][2]//div[@class='datepicker-days']//th[@class='date-switch']"));
    }

    public WebElement datepicker_monthsTo() {
        return Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][2]//div[@class='datepicker-months']//th[@class='date-switch']"));
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
