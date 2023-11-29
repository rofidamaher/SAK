package org.example.pages.SALE;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v112.network.model.WebTransportConnectionEstablished;

import java.util.List;

public class P06_03_SALE_SHARE {



    public List<WebElement> listTDTable(){
        List<WebElement> items = Hooks.driver.findElements(By.xpath("//div[@id='VURTUALModal']//td[@class='ng-binding']"));
        return items;
    }
    public List<WebElement> listCheckbox(){
        List<WebElement> items = Hooks.driver.findElements(By.xpath("//div[@id='VURTUALModal']//input[@type='checkbox']"));
        return items;
    }
    public WebElement saveBtn() {
        return Hooks.driver.findElement(By.xpath("//div[@id='VURTUALModal']//input[@value='حفظ']"));
    }
    public WebElement soldValue() {
        return Hooks.driver.findElement(By.id("soldValue"));
    }
    public WebElement SALE_NAME_COMPANY() {
        return Hooks.driver.findElement(By.id("4926"));
    }
    public WebElement SALE_COMMERICAL_NO_STOCKS() {
        return Hooks.driver.findElement(By.id("4925"));
    }
    public WebElement date() {
        return Hooks.driver.findElement(By.id("4927"));
    }
    public WebElement SALE_VALUE_STOCKS() {
        return Hooks.driver.findElement(By.id("4928"));
    }

    public WebElement btnAddDebagaToTable() {
        return Hooks.driver.findElement(By.id("btnAddDebagaToTable"));
    }




}
