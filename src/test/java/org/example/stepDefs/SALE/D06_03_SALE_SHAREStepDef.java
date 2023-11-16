package org.example.stepDefs.SALE;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.CONFIRMATION_SIGNATURES_P.P07_01_AGREEMENT;
import org.example.pages.POA.P05_01_POA_SPECIAL;
import org.example.pages.SALE.P06_01_SALE_COMPANY;
import org.example.pages.SALE.P06_02_SALE_LAND;
import org.example.pages.SALE.P06_03_SALE_SHARE;
import org.example.stepDefs.ConfirmationSignatures.D07_01_AGREEMENTStepDef;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class D06_03_SALE_SHAREStepDef {
    P06_03_SALE_SHARE saleShare = new P06_03_SALE_SHARE();
    P06_01_SALE_COMPANY saleCompany=new P06_01_SALE_COMPANY();
    P05_01_POA_SPECIAL poaSpecial = new P05_01_POA_SPECIAL();
    D07_01_AGREEMENTStepDef agreementStepDef = new D07_01_AGREEMENTStepDef();
    @When("user select person has id {string} soldValue {string} and click on save btn")
    public void userSelectPersonHasIdSoldValueAndClickOnSaveBtn(String arg0, String arg1) throws InterruptedException {
        Thread.sleep(1000);
        for (int i = 0; i <saleShare.listTDTable().size() ; i++) {
            String actualResult =saleShare.listTDTable().get(i).getText();
            Thread.sleep(100);
            if(actualResult.equals(arg0)) {
                System.out.println(actualResult);
                saleShare.listCheckbox().get(i/5).click();
                break;
            }
        }
        Thread.sleep(1000);
        saleShare.soldValue().sendKeys(arg1);
        saleShare.saveBtn().click();
        Thread.sleep(100);
        saleCompany.savechildBtn().click();
        Thread.sleep(1000);
        poaSpecial.ok_but().click();
    }

    @When("user enter SALE_NAME_COMPANY {string} SALE_COMMERICAL_NO_STOCKS {string} date Y {string} M {string} D {string} SALE_VALUE_STOCKS {string} and click on add btn")
    public void userEnterSALE_NAME_COMPANYSALE_COMMERICAL_NO_STOCKSDateYMDSALE_VALUE_STOCKSAndClickOnAddBtn(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) throws InterruptedException {

        saleShare.SALE_NAME_COMPANY().sendKeys(arg0);
        saleShare.SALE_COMMERICAL_NO_STOCKS().sendKeys(arg1);
        saleShare.date().click();
        Thread.sleep(200);
        agreementStepDef.setDateFrom(arg2,arg3,arg4);
        saleShare.SALE_VALUE_STOCKS().sendKeys(arg5);
        saleShare.btnAddDebagaToTable().click();
        Thread.sleep(200);
        poaSpecial.ok_but().click();
        Thread.sleep(500);
    }
}