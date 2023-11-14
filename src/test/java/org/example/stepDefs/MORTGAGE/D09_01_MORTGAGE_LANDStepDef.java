package org.example.stepDefs.MORTGAGE;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.CONFIRMATION_SIGNATURES_P.P07_01_AGREEMENT;
import org.example.pages.MORTGAGE.P09_01_MORTGAGE_LAND;
import org.example.stepDefs.ConfirmationSignatures.D07_01_AGREEMENTStepDef;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class D09_01_MORTGAGE_LANDStepDef {
    P09_01_MORTGAGE_LAND mortgage = new P09_01_MORTGAGE_LAND();
    D07_01_AGREEMENTStepDef agreementStepDef = new D07_01_AGREEMENTStepDef();

    JavascriptExecutor jse = (JavascriptExecutor) Hooks.driver;
    @Then("region is {string} and space is {string} and cadastral number is {string}")
    public void regionAndSpaceAndCadastralNumber(String arg0, String arg1, String arg2) throws InterruptedException {
        mortgage.region_number().click();
        Thread.sleep(100);
        mortgage.region_number().sendKeys(arg0);

        Thread.sleep(500);

        mortgage.space_number().click();
        Thread.sleep(100);
        mortgage.space_number().sendKeys(arg1);

        Thread.sleep(500);

        mortgage.cadastral_number().click();
        Thread.sleep(100);
        mortgage.cadastral_number().sendKeys(arg2);
    }


    @When("select MORTGAGE_PERIOD_FROM Y {string} M {string} D {string} MORTGAGE_PERIOD_TO Y {string} M {string} D {string}")
    public void userSelectMORTGAGE_PERIOD_FROMYMDAndMORTGAGE_PERIOD_TOYMD(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) throws InterruptedException {
        Thread.sleep(100);
        mortgage.MORTGAGE_PERIOD_FROM().click();
        Thread.sleep(2000);
        agreementStepDef.setDateFrom(arg0, arg1, arg2);

        mortgage.MORTGAGE_PERIOD_TO().click();
        Thread.sleep(2000);
        agreementStepDef.setDateTo(arg3, arg4, arg5);

    }

    @Then("Mortgage value is {string} and Approval letter number is {string}")
    public void MortgageValueAndApprovalLetterNumber(String arg0, String arg1) throws InterruptedException {
        mortgage.MortgageValue().click();
        Thread.sleep(100);
        mortgage.MortgageValue().sendKeys(arg0);

        Thread.sleep(500);
        mortgage.ApprovalLetterNumber().click();
        Thread.sleep(100);
        mortgage.ApprovalLetterNumber().sendKeys(arg1);
    }

    @And("Add Debaga To Table And Add Debaga Request")
    public void AddDebagaToTableAndAddDebagaRequest() throws InterruptedException {
        Thread.sleep(100);
        //
        mortgage.AddDebagaToTable().click();
        Thread.sleep(900);
        mortgage.cboxLoadedContent_ok().click();
        Thread.sleep(500);
        jse.executeScript("arguments[0].scrollIntoView();", mortgage.AddDebagaRequest());
        mortgage.AddDebagaRequest().click();
        Thread.sleep(200);
        mortgage.cboxLoadedContent_ok().click();

    }
}
