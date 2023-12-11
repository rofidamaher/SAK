package org.example.stepDefs.MORTGAGE;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.MORTGAGE.P9_02_MORTGAGE_COMPANY;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class D09_02_MORTGAGE_COMPANYStepDef {

    P9_02_MORTGAGE_COMPANY mortgageCompany = new P9_02_MORTGAGE_COMPANY();

    @Then("Commercial Registration No is {string} and Company Name is {string} and mail box is {string} and phone number is {string}")
    public void CommercialRegistrationNoAndCompanyNameAndMailBoxAndPhoneNumber(String arg0, String arg1, String arg2, String arg3) throws InterruptedException {
        mortgageCompany.Commercial_Registration_No().click();
        Thread.sleep(100);
        mortgageCompany.Commercial_Registration_No().sendKeys(arg0);

        Thread.sleep(500);

        mortgageCompany.Company_Name().click();
        mortgageCompany.cboxLoadedContent_ok().click();
        mortgageCompany.Company_Name().click();
        Thread.sleep(100);
        mortgageCompany.Company_Name().sendKeys(arg1);

        Thread.sleep(500);

        mortgageCompany.mail_box().click();
        Thread.sleep(100);
        mortgageCompany.mail_box().sendKeys(arg2);

        Thread.sleep(500);

        mortgageCompany.phone_number().click();
        Thread.sleep(100);
        mortgageCompany.phone_number().sendKeys(arg3);

    }

    @And("select EXPIRE_DATE Y {string} M {string} D {string}")
    public void userSelectExpire_DateYMD(String arg0, String arg1, String arg2) throws InterruptedException {
        Thread.sleep(100);
        mortgageCompany.expiry_date().click();
        Thread.sleep(2000);
        setDate(arg0, arg1, arg2);
    }

    public void setDate(String Y, String M, String D) throws InterruptedException {
        Thread.sleep(1000);
        mortgageCompany.datepicker_days().click();
        Thread.sleep(200);
        mortgageCompany.datepicker_months().click();
        Thread.sleep(200);
        WebElement year = Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][1]//div[@class='datepicker-years']//span[text()='" + Y + "']"));
        year.click();
        WebElement Month = Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][1]//div[@class='datepicker-months']//span[text()='" + M + "']"));
        Month.click();
        WebElement Day = Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][1]//div[@class='datepicker-days']//td[text()='" + D + "']"));
        Day.click();
    }

    @When("select MORTGAGE_PERIOD_FROM Y {string} M {string} D {string} MORTGAGE_PERIOD_TO Y {string} M {string} D {string} for MORTGAGE_COMPANY")
    public void userSelectMORTGAGE_PERIOD_FROMYMDAndMORTGAGE_PERIOD_TOYMD2(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) throws InterruptedException {
        Thread.sleep(100);
        mortgageCompany.MORTGAGE_PERIOD_FROM().click();
        Thread.sleep(2000);
        setDateFrom(arg0, arg1, arg2);

        mortgageCompany.MORTGAGE_PERIOD_TO().click();
        Thread.sleep(2000);
        setDateTo(arg3, arg4, arg5);

    }

    public void setDateFrom(String Y, String M, String D) throws InterruptedException {
        //Thread.sleep(1000);
        mortgageCompany.datepicker_daysFrom().click();
        Thread.sleep(500);
        mortgageCompany.datepicker_monthsFrom().click();
        Thread.sleep(200);
        WebElement year = Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][2]//div[@class='datepicker-years']//span[text()='" + Y + "']"));
        year.click();
        WebElement Month = Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][2]//div[@class='datepicker-months']//span[text()='" + M + "']"));
        Month.click();
        WebElement Day = Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][2]//div[@class='datepicker-days']//td[text()='" + D + "']"));
        Day.click();
    }

    public void setDateTo(String Y, String M, String D) throws InterruptedException {
        //Thread.sleep(1000);
        mortgageCompany.datepicker_daysTo().click();
        Thread.sleep(200);
        mortgageCompany.datepicker_monthsTo().click();
        Thread.sleep(200);
        WebElement year = Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][3]//div[@class='datepicker-years']//span[text()='" + Y + "']"));
        year.click();
        WebElement Month = Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][3]//div[@class='datepicker-months']//span[text()='" + M + "']"));
        Month.click();
        WebElement Day = Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][3]//div[@class='datepicker-days']//td[text()='" + D + "']"));
        Day.click();
    }

    @Then("Mortgage value is {string} and Approval letter number is {string} for Mortgage Company")
    public void MortgageValueAndApprovalLetterNumberForMortgageCompany(String arg0, String arg1) throws InterruptedException {
        mortgageCompany.MortgageValue().click();
        Thread.sleep(100);
        mortgageCompany.MortgageValue().sendKeys(arg0);

        Thread.sleep(500);
        mortgageCompany.ApprovalLetterNumber().click();
        Thread.sleep(100);
        mortgageCompany.ApprovalLetterNumber().sendKeys(arg1);
    }
}
