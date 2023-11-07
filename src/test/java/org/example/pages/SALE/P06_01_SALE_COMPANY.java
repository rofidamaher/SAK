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
    public WebElement ShowChild(){
        return Hooks.driver.findElement(By.id("PersonList"));
    }
    public WebElement btnAddChildParty(){
        return Hooks.driver.findElement(By.xpath("//input[@class=\"radius button editImg10 ng-scope\"]"));
    }
    public WebElement AddChildParty(){
        return Hooks.driver.findElement(By.xpath("//img[@src=\"../../img/plus_Image.png\"]"));
    }
    public WebElement ddlAdjectiveDependentParty_chosen() {
        return Hooks.driver.findElement(By.id("ddlAdjectiveDependentParty_chosen"));
    }

    public WebElement ddlAdj() {
        return Hooks.driver.findElement(By.id("childType"));
    }
    public WebElement ddlID() {
        return Hooks.driver.findElement(By.id("qidNumber"));
    }
    public WebElement saveBtn() {
        return Hooks.driver.findElement(By.xpath("//div[@id=\"add_button\"]//input[@class=\"radius button editImg10 ng-scope\"]"));
    }
    public WebElement savechildBtn() {
        return Hooks.driver.findElement(By.id("save"));
    }


    public WebElement txtPercentSecondParty() {
        return Hooks.driver.findElement(By.id("txtPercentSecondParty"));
    }
    public WebElement txtElsqlEltogarySecondParty() {
        return Hooks.driver.findElement(By.id("txtElsqlEltogarySecondParty"));
    }

    public WebElement txtConfirmSecondParty() {
        return Hooks.driver.findElement(By.id("txtConfirmSecondParty"));
    }
    public WebElement civilId_Num() {
        return Hooks.driver.findElement(By.id("3769"));
    }
    public WebElement SALE_VALUE_COMPANY() {
        return Hooks.driver.findElement(By.id("3774"));
    }
    public WebElement btnAddDebagaToTable() {
        return Hooks.driver.findElement(By.id("btnAddDebagaToTable"));
    }
    public WebElement debagaEditors() {
        return Hooks.driver.findElement(By.id("debagaEditors"));
    }
    public WebElement fr_element() {
        return Hooks.driver.findElement(By.xpath("//div[@id=\"debagaEditors\"]//div[@class=\"fr-element fr-view\"]//p"));
    }
    public WebElement btnCollection() {
        return Hooks.driver.findElement(By.id("btnCollection"));
    }
    public WebElement yes_btn() {
        return Hooks.driver.findElement(By.xpath("yesButton"));
    }
}
