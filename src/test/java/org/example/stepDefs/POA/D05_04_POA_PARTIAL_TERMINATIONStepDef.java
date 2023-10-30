package org.example.stepDefs.POA;

import io.cucumber.java.en.And;
import org.example.pages.POA.P05_01_POA_SPECIAL;
import org.example.pages.POA.P05_04_POA_PARTIAL_TERMINATION;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.JavascriptExecutor;

import static org.example.stepDefs.POA.D05_01_POA_SPECIALStepDef.isDisplayed;


public class D05_04_POA_PARTIAL_TERMINATIONStepDef {
     P05_04_POA_PARTIAL_TERMINATION p0504PoaPartialTermination = new P05_04_POA_PARTIAL_TERMINATION();
     P05_01_POA_SPECIAL POASpecial = new P05_01_POA_SPECIAL();
    JavascriptExecutor jse = (JavascriptExecutor) Hooks.driver;
    @And("user enter transaction num {string} for POA_PARTIAL_TERMINATION and click save model btn")
    public void userEnterTransactionNumForPOA_PARTIAL_TERMINATIONAndClickSaveModelBtn(String arg0) throws InterruptedException {
        p0504PoaPartialTermination.transactionNum().sendKeys(arg0);
        jse.executeScript("arguments[0].scrollIntoView();", POASpecial.saveModelBtn());

        POASpecial.saveModelBtn().click();
        Thread.sleep(100);
        //POASpecial.ok_but().click();
    }
    @And("user select person who cancel agency {string} and click save btn")
    public void userSelectPersonWhoCancelAgencyAndClickSaveBtn(String arg0) throws InterruptedException {
        Thread.sleep(3000);
        int i = 0;
        while (!isDisplayed(p0504PoaPartialTermination.btnAddAgent())) {
            Thread.sleep(3000);
            System.out.println("Element btnAddAgent is not visible yet");
        }
        p0504PoaPartialTermination.checkboxItems().get(0).click();
        Thread.sleep(300);

        while (p0504PoaPartialTermination.idsNum().get(i).isDisplayed()) {
            if (p0504PoaPartialTermination.idsNum().get(i).getText().contains(arg0)) {
                p0504PoaPartialTermination.checkboxItems().get(i).click();
                break;
            }
            i++;
        }

        jse.executeScript("arguments[0].scrollIntoView();", p0504PoaPartialTermination.btnAddChildParty());
        p0504PoaPartialTermination.btnAddChildParty().click();
        Thread.sleep(200);
        //jse.executeScript("arguments[0].scrollIntoView();", POASpecial.saveModelBtn());
        POASpecial.cboxClose().click();
        POASpecial.saveModelBtn().click();
        Thread.sleep(100);
        POASpecial.ok_but().click();
    }
}