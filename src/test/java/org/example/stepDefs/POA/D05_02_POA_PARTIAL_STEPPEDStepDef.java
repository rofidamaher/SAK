package org.example.stepDefs.POA;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.POA.P05_01_POA_SPECIAL;
import org.example.pages.POA.P05_02_POA_PARTIAL_STEPPED;
import org.example.pages.POA.P05_04_POA_PARTIAL_TERMINATION;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static org.example.stepDefs.POA.D05_01_POA_SPECIALStepDef.isDisplayed;


public class D05_02_POA_PARTIAL_STEPPEDStepDef {

     P05_02_POA_PARTIAL_STEPPED POAPaetialStepped = new P05_02_POA_PARTIAL_STEPPED();
    P05_01_POA_SPECIAL POASpecial = new P05_01_POA_SPECIAL();
    P05_04_POA_PARTIAL_TERMINATION p0504PoaPartialTermination = new P05_04_POA_PARTIAL_TERMINATION();
    JavascriptExecutor jse = (JavascriptExecutor) Hooks.driver;
    @When("user add the first Party with obj of index {string} and id of index {string} id equal {string} and BayanatElwkalaFirstParty equal {string} click on btnAddFirstParty")
    public void userAddTheFirstPartyForPOA_PARTIAL_STEPPEDWithObjOfIndexAndIdOfIndexIdEqualAndBayanatElwkalaFirstPartyEqualClickOnBtnAddFirstParty(String arg0, String arg1, String arg2, String arg3) throws InterruptedException {
        POASpecial.drop_listFirstParty().click();
        Thread.sleep(100);
        WebElement objeItem = Hooks.driver.findElement( By.xpath("//div[@id='ddlAdjectiveFirstParty_chosen']//li[@data-option-array-index='"+arg0+"']"));

        objeItem.click();
        Thread.sleep(100);
        POASpecial.drop_id_listFirstParty().click();
        WebElement idItem = Hooks.driver.findElement(By.xpath("//div[@id='ddlConfirmTypeFirstParty_chosen']//li[@data-option-array-index='"+arg1+"']"));

        Thread.sleep(100);
        idItem.click();
        Thread.sleep(1000);
        POASpecial.id_inputFirstParty().sendKeys(arg2);
        POAPaetialStepped.txtBayanatElwkalaFirstParty().sendKeys(arg3);
        POASpecial.applicant_checkboxFirstParty().click();
    }

    @And("user click on addCompanyStakeholder with id of index {string} id equal {string} and Choose a nationality equal {string} and click at add btn and save btn")
    public void userClickOnAddCompanyStakeholderWithIdOfIndexIdEqualAndChooseANationalityEqualAndClickAtAddBtnAndSaveBtn(String arg0, String arg1, String arg2) throws InterruptedException {
      POAPaetialStepped.addCompanyStakeholder().click();
        Thread.sleep(300);
        POAPaetialStepped.dropDownListIds().click();
        Thread.sleep(100);
        WebElement objeItem = Hooks.driver.findElement( By.xpath("//ul[@class='chosen-results']//li[@data-option-array-index='"+arg0+"']"));

        objeItem.click();
        Thread.sleep(100);
        POAPaetialStepped.inputId().sendKeys(arg1);

        POAPaetialStepped.dropDownListNationality().click();
        WebElement idItem = Hooks.driver.findElement(By.xpath("//ul[@class='chosen-results']//li[@data-option-array-index='"+arg2+"']"));

        Thread.sleep(100);
        idItem.click();
        Thread.sleep(1000);
        POAPaetialStepped.btnAddChildParty().click();
        POAPaetialStepped.btnSaveChildParty().click();



    }


    @And("user select person who step aside agency and step aside from him then click save btn")
    public void userSelectPersonWhoStepAsideAgencyAndStepAsideFromHimThenClickSaveBtn() throws InterruptedException {
        Thread.sleep(3000);
        int i = 0;
        while (!isDisplayed(p0504PoaPartialTermination.btnAddAgent())) {
            Thread.sleep(3000);
            System.out.println("Element btnAddAgent is not visible yet");
        }
        p0504PoaPartialTermination.checkboxItems().get(0).click();
        Thread.sleep(300);
        p0504PoaPartialTermination.checkboxItems().get(1).click();

        jse.executeScript("arguments[0].scrollIntoView();", p0504PoaPartialTermination.btnAddChildParty());
        p0504PoaPartialTermination.btnAddChildParty().click();
        Thread.sleep(200);
        //jse.executeScript("arguments[0].scrollIntoView();", POASpecial.saveModelBtn());
        POASpecial.cboxClose().click();
        POASpecial.saveModelBtn().click();
        Thread.sleep(100);
        POASpecial.ok_but().click();
    }

    @And("user enter transaction num {string} for POA_PARTIAL_STEPPED and click save model btn")
    public void userEnterTransactionNumForPOA_PARTIAL_STEPPEDAndClickSaveModelBtn(String arg0) throws InterruptedException {

        POAPaetialStepped.transactionNum().sendKeys(arg0);
        jse.executeScript("arguments[0].scrollIntoView();", POASpecial.saveModelBtn());

        POASpecial.saveModelBtn().click();
        Thread.sleep(100);
        //POASpecial.ok_but().click();
    }
}
