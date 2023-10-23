package org.example.stepDefs.POA;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.POA.P05_01_POA_SPECIAL;
import org.example.pages.POA.P05_02_POA_PARTIAL_STEPPED;
import org.example.pages.POA.P05_03_POA_TERMINATION;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class D05_03_POA_TERMINATIONStepDef {

    P05_03_POA_TERMINATION p0503PoaTermination = new P05_03_POA_TERMINATION();
    P05_01_POA_SPECIAL POASpecial = new P05_01_POA_SPECIAL();

    @When("user close first Party and open the model Nav")
    public void userCloseFirstPartyAndOpenTheSamplesNav(){
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        POASpecial.nav_First_Side().click();
        WebElement navSample = wait.until(ExpectedConditions.elementToBeClickable(POASpecial.nav_sample()));
        navSample.click();
    }

    @And("user enter transaction num {string} and click save model btn")
    public void userEnterTransactionNumAndClickSaveModelBtn(String arg0) throws InterruptedException {
        p0503PoaTermination.transactionNum().sendKeys(arg0);
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));

        WebElement saveModelBtn = POASpecial.saveModelBtn();
        ((JavascriptExecutor) Hooks.driver).executeScript("arguments[0].scrollIntoView(true);", saveModelBtn);

        wait.until(ExpectedConditions.elementToBeClickable(saveModelBtn)).click();


        WebElement okButton = POASpecial.ok_but();
        wait.until(ExpectedConditions.elementToBeClickable(okButton)).click();
    }
}
