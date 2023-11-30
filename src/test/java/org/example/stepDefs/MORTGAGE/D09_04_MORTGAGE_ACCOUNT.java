package org.example.stepDefs.MORTGAGE;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.MORTGAGE.P09_04_MORTGAGE_ACCOUNT;
import org.example.stepDefs.ConfirmationSignatures.D07_01_AGREEMENTStepDef;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class D09_04_MORTGAGE_ACCOUNT {

    P09_04_MORTGAGE_ACCOUNT mortgageAccount = new P09_04_MORTGAGE_ACCOUNT();

    D07_01_AGREEMENTStepDef agreementStepDef = new D07_01_AGREEMENTStepDef();

    @Then("Account Number is {string} Name Of Bank is {string}")
    public void accountNumberAndNameOfBank(String arg0, String arg1) throws InterruptedException {
    Thread.sleep(200);
    mortgageAccount.Account_Number().click();
    mortgageAccount.Account_Number().sendKeys(arg0);
    Thread.sleep(200);
    mortgageAccount.Bank_Name().click();
    WebElement objeItem = Hooks.driver.findElement(By.xpath("//div[@id='3777_chosen']//div[@class='chosen-drop']//ul//li[@data-option-array-index='"+arg1+"']"));
    objeItem.click();
}

    @When("select MORTGAGE_PERIOD_FROM Y {string} M {string} D {string} MORTGAGE_PERIOD_TO Y {string} M {string} D {string} for Account")
    public void userSelectMORTGAGE_PERIOD_FROMYMDAndMORTGAGE_PERIOD_TOYMD(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) throws InterruptedException {
        Thread.sleep(100);
        mortgageAccount.MORTGAGE_PERIOD_FROM().click();
        Thread.sleep(2000);
        agreementStepDef.setDateFrom(arg0, arg1, arg2);

        mortgageAccount.MORTGAGE_PERIOD_TO().click();
        Thread.sleep(2000);
        agreementStepDef.setDateTo(arg3, arg4, arg5);

    }

    @Then("Mortgage value is {string} and Approval letter number is {string} for Account")
    public void MortgageValueAndApprovalLetterNumber(String arg0, String arg1) throws InterruptedException {
        mortgageAccount.MortgageValue().click();
        Thread.sleep(100);
        mortgageAccount.MortgageValue().sendKeys(arg0);

        Thread.sleep(500);
        mortgageAccount.ApprovalLetterNumber().click();
        Thread.sleep(100);
        mortgageAccount.ApprovalLetterNumber().sendKeys(arg1);
    }


}
