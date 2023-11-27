package org.example.pages.First_Step;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P10_PARTIES {

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
}
