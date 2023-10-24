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


public class D05_03_POA_TERMINATIONStepDef {

     P05_03_POA_TERMINATION p0503PoaTermination = new P05_03_POA_TERMINATION();
     P05_01_POA_SPECIAL POASpecial = new P05_01_POA_SPECIAL();

    @When("user close first Party and open the model Nav")
    public void userCloseFirstPartyAndOpenTheSamplesNav() throws InterruptedException {
        Thread.sleep(100);
        POASpecial.nav_First_Side().click();
        Thread.sleep(100);
        POASpecial.nav_sample().click();
    }

    @And("user enter transaction num {string} for POA_TERMINATION and click save model btn")
    public void userEnterTransactionNumAndClickSaveModelBtn(String arg0) throws InterruptedException {
        p0503PoaTermination.transactionNum().sendKeys(arg0);
        JavascriptExecutor jse = (JavascriptExecutor) Hooks.driver;
        jse.executeScript("arguments[0].scrollIntoView();", POASpecial.saveModelBtn());

        POASpecial.saveModelBtn().click();
        Thread.sleep(100);
        POASpecial.ok_but().click();
    }
}
