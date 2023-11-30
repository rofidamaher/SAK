package org.example.pages.First_Step;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P10_PARTIES {

    //القيم طرف اول رقم الكتاب
    public WebElement numberBook_FirstParty() {
        return Hooks.driver.findElement(By.id("txtValueRaqmFirstParty"));
    }

    //القيم طرف اول جهة الكتاب
    public WebElement coverBook_FirstParty() {
        return Hooks.driver.findElement(By.id("txtValueYearFirstParty"));
    }


    //الولي الطبيعي طرف اول رقم الكتاب
    public WebElement walyNumberBook_FirstParty() {
        return Hooks.driver.findElement(By.id("txtWalyRaqmFirstParty"));
    }

    //الولي الطبيعي طرف اول جهة الكتاب
    public WebElement walyCoverBook_FirstParty() {
        return Hooks.driver.findElement(By.id("txtWalyYearFirstParty"));
    }

    //الولي الطبيعي طرف ثاني رقم الكتاب
    public WebElement walyNumberBook_SecondParty() {
        return Hooks.driver.findElement(By.id("txtWalyRaqmSecondParty"));
    }

    //الولي الطبيعي طرف ثاني جهة الكتاب
    public WebElement walyCoverBook_SecondParty() {
        return Hooks.driver.findElement(By.id("txtWalyYearSecondParty"));
    }

    // الوصي طرف اول رقم الكتاب
    public WebElement wasyNumberBook_SecondParty() {
        return Hooks.driver.findElement(By.id("txtWasySecondParty"));
    }

    // الوصي طرف اول جهة الكتاب
    public WebElement wasyCoverBook_SecondParty() {
        return Hooks.driver.findElement(By.id("txtWasyYearSecondParty"));
    }

    // وريث طرف اول بيانات الكنوفي
    public WebElement Date_of_Deceased()
    {
        return Hooks.driver.findElement(By.id("txtDeadPersonFirstParty"));
    }

    // وريث طرف اول جهة الكتاب
    public WebElement coverBook_for_Deceased_FirstParty() {
        return Hooks.driver.findElement(By.id("txtDeadYearFirstParty"));
    }

}
