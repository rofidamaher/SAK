package org.example.stepDefs.POA;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.First_Step.P05_POA;
import org.example.pages.POA.P05_01_POA_SPECIAL;
import org.example.pages.POA.P05_03_POA_TERMINATION;
import org.example.pages.POA.P05_04_POA_PARTIAL_TERMINATION;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.example.stepDefs.POA.D05_01_POA_SPECIALStepDef.isDisplayed;


public class D05_04_POA_PARTIAL_TERMINATIONStepDef {

    P05_04_POA_PARTIAL_TERMINATION p0504PoaPartialTermination = new P05_04_POA_PARTIAL_TERMINATION();
    P05_01_POA_SPECIAL POASpecial = new P05_01_POA_SPECIAL();
    JavascriptExecutor jse = (JavascriptExecutor) Hooks.driver;
    @And("user enter transaction num {string} for POA_PARTIAL_TERMINATION and click save model btn")
    public void userEnterTransactionNumForPOA_PARTIAL_TERMINATIONAndClickSaveModelBtn(String arg0) throws InterruptedException {
        p0504PoaPartialTermination.transactionNum().sendKeys(arg0);
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));

        WebElement saveModelBtn = POASpecial.saveModelBtn();
        ((JavascriptExecutor) Hooks.driver).executeScript("arguments[0].scrollIntoView(true);", saveModelBtn);

        wait.until(ExpectedConditions.elementToBeClickable(saveModelBtn)).click();

        WebElement okButton = POASpecial.ok_but();
        wait.until(ExpectedConditions.elementToBeClickable(okButton)).click();
    }
    @And("user select person who cancel agency {string} and click save btn")
    public void userSelectPersonWhoCancelAgencyAndClickSaveBtn(String arg0) {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));

        WebElement btnAddAgent = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("element_id"))); // Replace with actual ID
        btnAddAgent.click();

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int i = 0;
        while (p0504PoaPartialTermination.idsNum().get(i).isDisplayed()) {
            WebElement idNumElement = p0504PoaPartialTermination.idsNum().get(i);
            wait.until(ExpectedConditions.visibilityOf(idNumElement));

            if (idNumElement.getText().contains(arg0)) {
                p0504PoaPartialTermination.checkboxItems().get(i).click();
            }
            i++;
        }

        WebElement btnAddChildParty = p0504PoaPartialTermination.btnAddChildParty();
        ((JavascriptExecutor) Hooks.driver).executeScript("arguments[0].scrollIntoView(true);", btnAddChildParty);

        wait.until(ExpectedConditions.elementToBeClickable(btnAddChildParty)).click();
    }


}
