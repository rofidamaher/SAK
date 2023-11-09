package org.example.pages.ConfirmationSignatures;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P07_02_SUPPLY {



    public WebElement CONTRACT_VALUE(){
        return Hooks.driver.findElement(By.id("738"));
    }

    public WebElement GOODS_DATA(){
        return Hooks.driver.findElement(By.id("13"));
    }

    public WebElement datepicker_daysID3() {
        return Hooks.driver.findElement(By.xpath("//div[@id='datepicker_3']//div[@class='datepicker-days']//th[@class='date-switch']"));
    }
    public WebElement datepicker_monthsID3() {
        return Hooks.driver.findElement(By.xpath("//div[@id='datepicker_3']//div[@class='datepicker-months']//th[@class='date-switch']"));
    }

}
