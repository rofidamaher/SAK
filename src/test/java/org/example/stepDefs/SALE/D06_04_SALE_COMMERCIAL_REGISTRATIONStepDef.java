package org.example.stepDefs.SALE;

import io.cucumber.java.en.When;
import org.example.pages.POA.P05_01_POA_SPECIAL;
import org.example.pages.SALE.P06_01_SALE_COMPANY;
import org.example.pages.SALE.P06_03_SALE_SHARE;
import org.example.pages.SALE.P06_04_SALE_COMMERCIAL_REGISTRATION;
import org.example.stepDefs.ConfirmationSignatures.D07_01_AGREEMENTStepDef;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class D06_04_SALE_COMMERCIAL_REGISTRATIONStepDef {
    P06_04_SALE_COMMERCIAL_REGISTRATION saleCommercialRegistration = new P06_04_SALE_COMMERCIAL_REGISTRATION();
    P05_01_POA_SPECIAL poaSpecial = new P05_01_POA_SPECIAL();
    JavascriptExecutor jse = (JavascriptExecutor) Hooks.driver;


    @When("user add the first Party with obj of index {string} and id of index {string} id {string} and txtPercentFristParty {string} click on chkDepositFirstParty")
    public void userAddTheFirstPartyWithObjOfIndexAndIdOfIndexIdAndTxtPercentFristPartyClickOnChkDepositFirstParty(String arg0, String arg1, String arg2, String arg3) throws InterruptedException {

        poaSpecial.drop_listFirstParty().click();
        Thread.sleep(100);
        WebElement objeItem = Hooks.driver.findElement( By.xpath("//div[@id='ddlAdjectiveFirstParty_chosen']//li[@data-option-array-index='"+arg0+"']"));

        objeItem.click();
        Thread.sleep(100);
        poaSpecial.drop_id_listFirstParty().click();

        WebElement idItem = Hooks.driver.findElement(By.xpath("//div[@id='ddlConfirmTypeFirstParty_chosen']//li[@data-option-array-index='"+arg1+"']"));
        Thread.sleep(100);
        idItem.click();
        saleCommercialRegistration.txtPercentFristParty().clear();
        Thread.sleep(1000);
        poaSpecial.id_inputFirstParty().sendKeys(arg2);
        saleCommercialRegistration.txtPercentFristParty().sendKeys(arg3);
        poaSpecial.applicant_checkboxFirstParty().click();

    }

    @When("user add the second Party with obj of index {string} and id of index {string} id {string} and CR {string} txtPercentSecondParty {string}")
    public void userAddTheSecondPartyWithObjOfIndexAndIdOfIndexIdAndCRTxtPercentSecondParty(String arg0, String arg1, String arg2, String arg3, String arg4) throws InterruptedException {

        poaSpecial.drop_listSecondParty().click();
        Thread.sleep(100);
        WebElement objeItem = Hooks.driver.findElement( By.xpath("//div[@id='ddlAdjectiveSecondParty_chosen']//li[@data-option-array-index='"+arg0+"']"));

        objeItem.click();
        Thread.sleep(500);
        poaSpecial.drop_id_listSecondParty().click();
        WebElement idItem = Hooks.driver.findElement(By.xpath("//div[@id='ddlConfirmTypeSeconedParty_chosen']//li[@data-option-array-index='"+arg1+"']"));
        Thread.sleep(100);
        idItem.click();
        saleCommercialRegistration.txtPercentSecondParty().clear();
        Thread.sleep(1000);
        poaSpecial.id_inputSecondParty().sendKeys(arg2);
        poaSpecial.elsqlEltogary_Value().sendKeys(arg3);
        poaSpecial.companyNameSecondParty().click();
        saleCommercialRegistration.txtPercentSecondParty().sendKeys(arg4);

        jse.executeScript("window.scrollBy(0,150)");

    }

    @When("user enter SALE_PERMIT_NO_COMPANY {string} SALE_PERMIT_VALUE_COMPANY {string} SALE_PERMIT_NO_APPROVAL_LETTER_COMPANY {string} and click on add btn")
    public void userEnterSALE_PERMIT_NO_COMPANYSALE_PERMIT_VALUE_COMPANYSALE_PERMIT_NO_APPROVAL_LETTER_COMPANYAndClickOnAddBtn(String arg0, String arg1, String arg2) throws InterruptedException {

        saleCommercialRegistration.SALE_PERMIT_NO_COMPANY().sendKeys(arg0);
        saleCommercialRegistration.SALE_PERMIT_NO_COMPANY().click();
        Thread.sleep(300);
        saleCommercialRegistration.SALE_PERMIT_VALUE_COMPANY().sendKeys(arg1);
        saleCommercialRegistration.SALE_PERMIT_NO_APPROVAL_LETTER_COMPANY().sendKeys(arg2);
        Thread.sleep(300);
        saleCommercialRegistration.btnAddDebagaToTable().click();
        Thread.sleep(300);
        poaSpecial.ok_but().click();
        Thread.sleep(3000);

    }
}