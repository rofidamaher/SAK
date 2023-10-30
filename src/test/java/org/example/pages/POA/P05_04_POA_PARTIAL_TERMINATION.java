package org.example.pages.POA;


import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P05_04_POA_PARTIAL_TERMINATION {

    public WebElement transactionNum() {
        return Hooks.driver.findElement(By.id("3259"));
    }


    public WebElement btnAddAgent() {
        return Hooks.driver.findElement(By.id("btnAddAgent"));
    }

    public List<WebElement> checkboxItems()
    {
        List<WebElement> checkboxItems = Hooks.driver.findElements(By.xpath("//div[@id='cboxContent']//input[@type=\"checkbox\"]"));
        return checkboxItems;
    }
    public List<WebElement> idsNum()
    {
        List<WebElement> idsNum = Hooks.driver.findElements(By.xpath("//div[@id='cboxContent']//td[@data-title=\" رقم الإثبات\"]"));
        return idsNum;
    }
    public WebElement btnAddChildParty() {
        return Hooks.driver.findElement(By.xpath("//div[@id='cboxContent']//input[@id=\"btnAddChildParty\"]"));
    }

}
