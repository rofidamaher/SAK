package org.example.pages.POA;


import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P05_03_POA_TERMINATION {
    public WebElement transactionNum() {
        return Hooks.driver.findElement(By.id("3105"));
    }


}
