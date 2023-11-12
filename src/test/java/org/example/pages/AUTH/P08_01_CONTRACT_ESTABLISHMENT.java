package org.example.pages.AUTH;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P08_01_CONTRACT_ESTABLISHMENT {

    public WebElement addressFirstParty(){
        return Hooks.driver.findElement(By.id("txtAddress"));
    }
    public WebElement txtFirstRatioOfPartnership(){
        return Hooks.driver.findElement(By.id("txtFirstRatioOfPartnership"));
    }
    public WebElement txtElsqlEltogaryFirstParty(){
        return Hooks.driver.findElement(By.id("txtElsqlEltogaryFirstParty"));
    }
    public WebElement txtCompanyNameFirstParty(){
        return Hooks.driver.findElement(By.id("txtCompanyNameFirstParty"));
    }
    public WebElement dropDownListNationality(){
        return Hooks.driver.findElement(By.id("NationalitySeglFirstParty_chosen"));
    }
    public WebElement txtSecondPrivilege(){
        return Hooks.driver.findElement(By.id("txtSecondPrivilege"));
    }
    public WebElement txtSecondPrivilegeValidity(){
        return Hooks.driver.findElement(By.id("txtSecondPrivilegeValidity"));
    }
    public WebElement CONTRACT_ESTABLISHMENT_COMPANY_TYPE(){
        return Hooks.driver.findElement(By.id("4803_chosen"));
    }
    public WebElement CONTRACT_ESTABLISHMENT_NAME(){
        return Hooks.driver.findElement(By.id("3404"));
    }
    public WebElement CONTRACT_ESTABLISHMENT_ADDRESS(){
        return Hooks.driver.findElement(By.id("3403"));
    }
    public WebElement CONTRACT_ESTABLISHMENT_CAPITAL(){
        return Hooks.driver.findElement(By.id("3401"));
    }
    public WebElement CONTRACT_ESTABLISHMENT_DURATION(){
        return Hooks.driver.findElement(By.id("3402"));
    }
    public WebElement CONTRACT_ESTABLISHMENT_ACTIVITIES(){
        return Hooks.driver.findElement(By.id("3405"));
    }





}
