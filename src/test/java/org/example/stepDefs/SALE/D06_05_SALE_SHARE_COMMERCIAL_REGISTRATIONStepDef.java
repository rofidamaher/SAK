package org.example.stepDefs.SALE;

import io.cucumber.java.en.When;
import org.example.pages.POA.P05_01_POA_SPECIAL;
import org.example.pages.SALE.P06_04_SALE_COMMERCIAL_REGISTRATION;
import org.example.pages.SALE.P06_05_SALE_SHARE_COMMERCIAL_REGISTRATION;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class D06_05_SALE_SHARE_COMMERCIAL_REGISTRATIONStepDef {
    P06_05_SALE_SHARE_COMMERCIAL_REGISTRATION saleShareCommercialRegistration = new P06_05_SALE_SHARE_COMMERCIAL_REGISTRATION();
    P05_01_POA_SPECIAL poaSpecial = new P05_01_POA_SPECIAL();


    @When("user enter SalePermitNoCompany {string} SALE_PERMIT_VALUE_COMPANY {string} SALE_PERMIT_NO_APPROVAL_LETTER_COMPANY {string} and click on add btn")
    public void userEnterSalePermitNoCompanySALE_PERMIT_VALUE_COMPANYSALE_PERMIT_NO_APPROVAL_LETTER_COMPANYAndClickOnAddBtn(String arg0, String arg1, String arg2) throws InterruptedException {

        saleShareCommercialRegistration.SALE_PERMIT_NO_COMPANY().sendKeys(arg0);
        saleShareCommercialRegistration.SALE_PERMIT_NO_COMPANY().click();
        Thread.sleep(300);
        saleShareCommercialRegistration.SALE_PERMIT_VALUE_COMPANY().sendKeys(arg1);
        saleShareCommercialRegistration.SALE_PERMIT_NO_APPROVAL_LETTER_COMPANY().sendKeys(arg2);
        Thread.sleep(300);
        saleShareCommercialRegistration.btnAddDebagaToTable().click();
        Thread.sleep(300);
        poaSpecial.ok_but().click();
        Thread.sleep(3000);


    }
}