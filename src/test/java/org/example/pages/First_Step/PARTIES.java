package org.example.pages.First_Step;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PARTIES {

    //القيم طرف اول
    public WebElement numberBook_FirstParty() {
        return Hooks.driver.findElement(By.id("txtValueRaqmFirstParty"));
    }

    //القيم طرف اول
    public WebElement coverBook_FirstParty() {
        return Hooks.driver.findElement(By.id("txtValueYearFirstParty"));
    }


    //الولي الطبيعي طرف اول
    public WebElement walyNumberBook_FirstParty() {
        return Hooks.driver.findElement(By.id("txtWalyRaqmFirstParty"));
    }

    //الولي الطبيعي طرف اول
    public WebElement walyCoverBook_FirstParty() {
        return Hooks.driver.findElement(By.id("txtWalyYearFirstParty"));
    }

    // الوصي
    public WebElement wasyNumberBook_SecondParty() {
        return Hooks.driver.findElement(By.id("txtWasySecondParty"));
    }

    // الوصي
    public WebElement wasyCoverBook_SecondParty() {
        return Hooks.driver.findElement(By.id("txtWasyYearSecondParty"));
    }

    public WebElement txtBayanatElwkalaSecondParty() {
        return Hooks.driver.findElement(By.id("txtBayanatElwkalaSecondParty"));
    }
    public List<WebElement> ShowChildsecondPartyTable()
    {
        List<WebElement> ShowChildsecondPartyIds = Hooks.driver.findElements(By.xpath("//form[@class='secondParty ng-pristine ng-valid ng-scope']//div[@id='PersonList']"));
        return ShowChildsecondPartyIds;
    }
    public WebElement Wkala() {
        return Hooks.driver.findElement(By.id("Wkala22"));
    }
    public WebElement txtRqmElwekalaSecondParty() {
        return Hooks.driver.findElement(By.id("txtRqmElwekalaSecondParty"));
    }
    public List<WebElement> AgentPersonsSecondTd()
    {
        List<WebElement> agentPersonsSecondIds = Hooks.driver.findElements(By.xpath("//div[@id='AgentPersonsSecondPage']//td"));
        return agentPersonsSecondIds;
    }
    public WebElement saveAgentPersonsSecond() {
        return Hooks.driver.findElement(By.xpath("//div[@id='AgentPersonsSecondPage']//input[@value=\"حفظ\"]"));
    }
    public WebElement txtBuildingNumberSecondParty() {
        return Hooks.driver.findElement(By.id("txtBuildingNumberSecondParty"));
    }
    public WebElement txtEmailBoxSecondParty() {
        return Hooks.driver.findElement(By.id("txtEmailBoxSecondParty"));
    }
    public WebElement txtCompanyPhoneSecondParty() {
        return Hooks.driver.findElement(By.id("txtCompanyPhoneSecondParty"));
    }
    public WebElement cRExpiryDateSecondParty() {
        return Hooks.driver.findElement(By.id("txtCRExpiryDateSecondParty"));
    }
    public WebElement txtWalyRaqmSecondParty() {
        return Hooks.driver.findElement(By.id("txtWalyRaqmSecondParty"));
    }
    public WebElement txtWalyYearSecondParty() {
        return Hooks.driver.findElement(By.id("txtWalyYearSecondParty"));
    }


}
