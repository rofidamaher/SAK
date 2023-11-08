package org.example.pages.ConfirmationSignatures;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P07_01_AGREEMENT {



    public WebElement txtConfirmChildParty(){
        return Hooks.driver.findElement(By.id("txtConfirmChildParty"));
    }
    public WebElement YesFirstParty(){
        return Hooks.driver.findElement(By.xpath("//div[@id='msgConfirmLawyerSecond']//input[@id='YesFirstParty']"));
    }
    public WebElement txtNameSeconedParty(){
        return Hooks.driver.findElement(By.id("txtNameSeconedParty"));
    }

    public WebElement nav_third_Side(){
        return Hooks.driver.findElement(By.id("thirdParty"));
    }
    public WebElement ddlNationalityThirdParty_chosen(){
        return Hooks.driver.findElement(By.id("ddlNationalityThirdParty_chosen"));
    }
    public WebElement drop_listThirdParty(){
        return Hooks.driver.findElement(By.id("ddlAdjectiveThirdParty_chosen"));
    }
    public WebElement drop_id_listThirdParty(){
        return Hooks.driver.findElement(By.id("ddlConfirmTypeThirdParty_chosen"));
    }
    public WebElement txtConfirmThirdParty(){
        return Hooks.driver.findElement(By.id("txtConfirmThirdParty"));
    }

    public WebElement btnAddThirdParty(){
        return Hooks.driver.findElement(By.id("btnAddThirdParty"));
    }
    public List<WebElement> thirdPartyTable()
    {
        List<WebElement> thirdPartyTableIds = Hooks.driver.findElements(By.xpath("//form[@class='ThirdParty ng-pristine ng-valid ng-scope']//tbody//tr//td[@data-title=' رقم الإثبات']"));
        return thirdPartyTableIds;
    }
    public WebElement CONTRACT_VALUE(){
        return Hooks.driver.findElement(By.id("10"));
    }
    public WebElement CONTRACT_PERIOD_FROM(){
        return Hooks.driver.findElement(By.id("7"));
    }
    public WebElement CONTRACT_PERIOD_TO(){
        return Hooks.driver.findElement(By.id("8"));
    }
    public WebElement datepicker_daysFrom() {
        return Hooks.driver.findElement(By.xpath("//div[@id='datepicker_4']//div[@class='datepicker-days']//th[@class='date-switch']"));
    }

    public WebElement datepicker_monthsFrom() {
        return Hooks.driver.findElement(By.xpath("//div[@id='datepicker_4']//div[@class='datepicker-months']//th[@class='date-switch']"));
    }
    public WebElement datepicker_daysTo() {
        return Hooks.driver.findElement(By.xpath("//div[@id='datepicker_5']//div[@class='datepicker-days']//th[@class='date-switch']"));
    }

    public WebElement datepicker_monthsTo() {
        return Hooks.driver.findElement(By.xpath("//div[@id='datepicker_5']//div[@class='datepicker-months']//th[@class='date-switch']"));
    }


}
