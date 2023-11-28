package org.example.pages.MORTGAGE;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P09_04_MORTGAGE_ACCOUNT {

    public WebElement Account_Number()
    {
        return Hooks.driver.findElement(By.id("3776"));
    }

    public WebElement Bank_Name()
    {
        return Hooks.driver.findElement(By.xpath("//div[@id='3777_chosen']//a//span"));
    }

    public WebElement MORTGAGE_PERIOD_FROM() {
        return Hooks.driver.findElement(By.id("3778"));
    }

    public WebElement MORTGAGE_PERIOD_TO() {
        return Hooks.driver.findElement(By.id("3779"));
    }

    public WebElement MortgageValue() {
        return Hooks.driver.findElement(By.id("3780"));
    }

    public WebElement ApprovalLetterNumber() {
        return Hooks.driver.findElement(By.id("3781"));
    }

}
