package org.example.pages.POA;


import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P05_02_POA_PARTIAL_STEPPED {
    public WebElement txtBayanatElwkalaFirstParty() {
        return Hooks.driver.findElement(By.id("txtBayanatElwkalaFirstParty"));
    }
    public WebElement addCompanyStakeholder() {
        return Hooks.driver.findElement(By.id("noti_Container"));

    }
    public WebElement dropDownListIds() {
        return Hooks.driver.findElement(By.xpath("//div[@id=\"dialog-box-id-1697452620405\"]//a[@class=\"chosen-single\"]"));

    }

    public WebElement inputId() {
        return Hooks.driver.findElement(By.xpath("//div[@id=\"dialog-box-id-1697452620405\"]//input[@class=\"ng-pristine ng-untouched ng-valid ng-valid-maxlength\"]"));

    }

    public WebElement dropDownListNationality() {
        return Hooks.driver.findElement(By.xpath("//div[@id=\"dialog-box-id-1697452620405\"]//a[@class=\"chosen-single chosen-default\"]"));

    }

    public WebElement btnAddChildParty() {
        return Hooks.driver.findElement(By.id("btnAddChildParty"));

    }
    public WebElement btnSaveChildParty() {
        return Hooks.driver.findElement(By.xpath("//div[@id=\"dialog-box-id-1697452620405\"]//input[@class=\"radius button\"]"));

    }
    public WebElement transactionNum() {
        return Hooks.driver.findElement(By.id("3258"));
    }




}
