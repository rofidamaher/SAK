package org.example.pages.MORTGAGE;


import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P9_02_MORTGAGE_COMPANY {

    public WebElement Commercial_Registration_No()
    {
        return Hooks.driver.findElement(By.id("290"));
    }

    public WebElement cboxLoadedContent_ok() {
        return Hooks.driver.findElement(By.xpath("//div[@id='cboxLoadedContent']//button"));
    }

    public WebElement Company_Name()
    {
        return Hooks.driver.findElement(By.id("361"));
    }

    public WebElement mail_box()
    {
        return Hooks.driver.findElement(By.id("362"));
    }

    public WebElement phone_number()
    {
        return Hooks.driver.findElement(By.id("363"));
    }

    public WebElement expiry_date()
    {
        return Hooks.driver.findElement(By.id("364"));
    }

    public WebElement datepicker_days() {
        return Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][1]//div[@class='datepicker-days']//th[@class='date-switch']"));
    }

    public WebElement datepicker_months() {
        return Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][1]//div[@class='datepicker-months']//th[@class='date-switch']"));
    }

    public WebElement MORTGAGE_PERIOD_FROM() {
        return Hooks.driver.findElement(By.id("288"));
    }

    public WebElement MORTGAGE_PERIOD_TO() {
        return Hooks.driver.findElement(By.id("289"));
    }

    public WebElement datepicker_daysFrom() {
        return Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][2]//div[@class='datepicker-days']//th[@class='date-switch']"));
    }

    public WebElement datepicker_monthsFrom() {
        return Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][2]//div[@class='datepicker-months']//th[@class='date-switch']"));
    }

    public WebElement datepicker_daysTo() {
        return Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][3]//div[@class='datepicker-days']//th[@class='date-switch']"));
    }

    public WebElement datepicker_monthsTo() {
        return Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][3]//div[@class='datepicker-months']//th[@class='date-switch']"));
    }

    public WebElement MortgageValue() {
        return Hooks.driver.findElement(By.id("287"));
    }

    public WebElement ApprovalLetterNumber() {
        return Hooks.driver.findElement(By.id("417"));
    }

}
