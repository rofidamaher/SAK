package org.example.pages.MORTGAGE;

import org.example.pages.CONFIRMATION_SIGNATURES_P.P07_01_AGREEMENT;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P09_05_MORTGAGE_STOCKS {

    P07_01_AGREEMENT agreement = new P07_01_AGREEMENT();

    public WebElement Commercial_Registration_No()
    {
        return Hooks.driver.findElement(By.id("703"));
    }

    public WebElement POP_MESSAGE()
    {
        return Hooks.driver.findElement(By.xpath("//div[@id='cboxLoadedContent']//center//button"));
    }

    public WebElement Company_Name()
    {
        return Hooks.driver.findElement(By.id("700"));
    }

    public WebElement Company_Code()
    {
        return Hooks.driver.findElement(By.id("702"));
    }

    public WebElement Shareholder_Number()
    {
        return Hooks.driver.findElement(By.id("704"));
    }

    public WebElement MORTGAGE_PERIOD_FROM() {
        return Hooks.driver.findElement(By.id("698"));
    }

    public WebElement MORTGAGE_PERIOD_TO() {
        return Hooks.driver.findElement(By.id("699"));
    }

    public WebElement MortgageValue() {
        return Hooks.driver.findElement(By.id("697"));
    }

    public WebElement number_sharesPledged() {
        return Hooks.driver.findElement(By.id("701"));
    }

    public void setDateFrom(String Y , String M , String D) throws InterruptedException {
        //Thread.sleep(1000);
        agreement.datepicker_daysFrom().click();
        Thread.sleep(500);
        agreement.datepicker_monthsFrom().click();
        Thread.sleep(200);
        WebElement year = Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][1]//div[@class='datepicker-years']//span[text()='"+Y+"']"));
        year.click();
        WebElement Month = Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][1]//div[@class='datepicker-months']//span[text()='"+M+"']"));
        Month.click();
        WebElement Day = Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][1]//div[@class='datepicker-days']//td[text()='"+D+"']"));
        Day.click();
    }
    public void setDateTo(String Y , String M , String D) throws InterruptedException {
        //Thread.sleep(1000);
        agreement.datepicker_daysTo().click();
        Thread.sleep(200);
        agreement.datepicker_monthsTo().click();
        Thread.sleep(200);
        WebElement year = Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][2]//div[@class='datepicker-years']//span[text()='"+Y+"']"));
        year.click();
        WebElement Month = Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][2]//div[@class='datepicker-months']//span[text()='"+M+"']"));
        Month.click();
        WebElement Day = Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][2]//div[@class='datepicker-days']//td[text()='"+D+"']"));
        Day.click();
    }

}
