package org.example.pages.SALE;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P06_02_SALE_LAND {



    public WebElement txtBayanatElwkalaFirstParty(){
        return Hooks.driver.findElement(By.id("txtBayanatElwkalaFirstParty"));
    }
    public WebElement drop_listChildType() {
        return Hooks.driver.findElement(By.id("childType_chosen"));
    }

    public WebElement qidNumber(){
        return Hooks.driver.findElement(By.id("qidNumber"));
    }
    public WebElement btnAddChildParty(){
        return Hooks.driver.findElement(By.xpath("//form[@name=\"ctrl.dependentForm\"]//input[@id=\"btnAddChildParty\"]"));
    }

    public WebElement save(){
        return Hooks.driver.findElement(By.xpath("//div[@class=\"row\"]//input[@id=\"save\"]"));
    }
    public WebElement txtValueRaqmSecondParty(){
        return Hooks.driver.findElement(By.id("txtValueRaqmSecondParty"));
    }
    public WebElement txtValueYearSecondParty(){
        return Hooks.driver.findElement(By.id("txtValueYearSecondParty"));
    }
    public WebElement ShowChildsecondParty(){
        return Hooks.driver.findElement(By.xpath("//form[@class=\"secondParty ng-pristine ng-valid ng-scope\"]//div[@id=\"PersonList\"]"));
    }
    public WebElement SALE_REGION_LAND(){
        return Hooks.driver.findElement(By.id("386"));
    }
    public WebElement SALE_AREA_LAND(){
        return Hooks.driver.findElement(By.id("387"));
    }

    public WebElement SALE_FIGURE_AREAL_LAND(){
        return Hooks.driver.findElement(By.id("388"));
    }
    public WebElement SALE_NO_APPROVAL_LETTER_LAND(){
        return Hooks.driver.findElement(By.id("389"));
    }
    public WebElement SALE_VALUE_LAND(){
        return Hooks.driver.findElement(By.id("321"));
    }
    public WebElement btnAddDebagaToTable(){
        return Hooks.driver.findElement(By.id("btnAddDebagaToTable"));
    }






}
