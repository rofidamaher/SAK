package org.example.stepDefs.MORTGAGE;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.MORTGAGE.P09_05_MORTGAGE_STOCKS;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class D09_05_MORTGAGE_STOCKSStepDef {
    P09_05_MORTGAGE_STOCKS mortgageStocks = new P09_05_MORTGAGE_STOCKS();

    @Then("Commercial Registration No is {string} and Company Name is {string} and Company Code is {string} and Shareholder Number is {string}")
    public void commercialRegistrationNoAndCompanyNameAndCompanyCodeAndShareholderNumber(String arg0, String arg1, String arg2, String arg3) throws InterruptedException {
        Thread.sleep(200);
        mortgageStocks.Commercial_Registration_No().click();
        mortgageStocks.Commercial_Registration_No().sendKeys(arg0);
        Thread.sleep(200);
        mortgageStocks.Company_Name().click();
        mortgageStocks.POP_MESSAGE().click();
        mortgageStocks.Company_Name().click();
        mortgageStocks.Company_Name().sendKeys(arg1);
        mortgageStocks.Company_Code().click();
        mortgageStocks.Company_Code().sendKeys(arg2);
        mortgageStocks.Shareholder_Number().click();
        mortgageStocks.Shareholder_Number().sendKeys(arg3);
    }

    @When("select MORTGAGE_PERIOD_FROM Y {string} M {string} D {string} MORTGAGE_PERIOD_TO Y {string} M {string} D {string} for Stocks")
    public void userSelectMORTGAGE_PERIOD_FROMYMDAndMORTGAGE_PERIOD_TOYMD(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) throws InterruptedException {
        Thread.sleep(100);
        mortgageStocks.MORTGAGE_PERIOD_FROM().click();
        Thread.sleep(2000);
        mortgageStocks.setDateFrom(arg0, arg1, arg2);
        mortgageStocks.MORTGAGE_PERIOD_TO().click();
        Thread.sleep(2000);
        mortgageStocks.setDateTo(arg3, arg4, arg5);
    }

    @Then("Mortgage value is {string} and number of shares pledged is {string}")
    public void MortgageValueAndNumberOfSharesPledged(String arg0, String arg1) throws InterruptedException {
        Thread.sleep(200);
        mortgageStocks.MortgageValue().click();
        mortgageStocks.MortgageValue().sendKeys(arg0);

        Thread.sleep(300);
        mortgageStocks.number_sharesPledged().click();
        mortgageStocks.number_sharesPledged().sendKeys(arg1);
    }


}
