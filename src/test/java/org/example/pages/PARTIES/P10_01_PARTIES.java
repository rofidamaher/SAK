package org.example.pages.PARTIES;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P10_01_PARTIES {

    public WebElement Raqm_FirstParty() {
        return Hooks.driver.findElement(By.id("txtValueRaqmFirstParty"));
    }

    public WebElement Year_FirstParty() {
        return Hooks.driver.findElement(By.id("txtValueYearFirstParty"));
    }

    public WebElement Raqm_SecondParty() {
        return Hooks.driver.findElement(By.id("txtWasySecondParty"));
    }

    public WebElement Year_SecondParty() {
        return Hooks.driver.findElement(By.id("txtWasyYearSecondParty"));
    }
}
