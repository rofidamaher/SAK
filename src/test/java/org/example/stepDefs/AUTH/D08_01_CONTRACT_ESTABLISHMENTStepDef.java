package org.example.stepDefs.AUTH;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.AUTH.P08_01_CONTRACT_ESTABLISHMENT;
import org.example.pages.POA.P05_01_POA_SPECIAL;
import org.example.pages.SALE.P06_02_SALE_LAND;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class D08_01_CONTRACT_ESTABLISHMENTStepDef {
    P08_01_CONTRACT_ESTABLISHMENT contractEstablishment = new P08_01_CONTRACT_ESTABLISHMENT();
    P05_01_POA_SPECIAL POASpecial = new P05_01_POA_SPECIAL();
    JavascriptExecutor jse = (JavascriptExecutor) Hooks.driver;

    @When("user add the first Party with obj of index {string} and id of index {string} id {string} addressFirstParty {string} txtFirstRatioOfPartnership {string} txtElsqlEltogaryFirstParty {string} txtCompanyNameFirstParty {string} txtNationalitySeglFirstParty {string} and click on chkDepositFirstParty")
    public void userAddTheFirstPartyWithObjOfIndexAndIdOfIndexIdAddressFirstPartyTxtFirstRatioOfPartnershipTxtElsqlEltogaryFirstPartyTxtCompanyNameFirstPartyTxtNationalitySeglFirstPartyAndClickOnChkDepositFirstParty(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws InterruptedException {

        POASpecial.drop_listFirstParty().click();
        Thread.sleep(100);
        WebElement objeItem = Hooks.driver.findElement( By.xpath("//div[@id='ddlAdjectiveFirstParty_chosen']//li[@data-option-array-index='"+arg0+"']"));
        objeItem.click();

        Thread.sleep(100);
        POASpecial.drop_id_listFirstParty().click();
        WebElement idItem = Hooks.driver.findElement(By.xpath("//div[@id='ddlConfirmTypeFirstParty_chosen']//li[@data-option-array-index='"+arg1+"']"));
        Thread.sleep(500);
        idItem.click();

        POASpecial.id_inputFirstParty().sendKeys(arg2);
        contractEstablishment.addressFirstParty().sendKeys(arg3);
        contractEstablishment.txtFirstRatioOfPartnership().sendKeys(arg4);
        contractEstablishment.txtElsqlEltogaryFirstParty().sendKeys(arg5);
        contractEstablishment.txtCompanyNameFirstParty().sendKeys(arg6);
        jse.executeScript("window.scrollBy(0,300)");


        contractEstablishment.dropDownListNationality().click();
        WebElement nationalityItem = Hooks.driver.findElement(By.xpath("//div[@id='NationalitySeglFirstParty_chosen']//li[@data-option-array-index='"+arg7+"']"));
        Thread.sleep(500);
        nationalityItem.click();
        POASpecial.applicant_checkboxFirstParty().click();

    }

    @When("user add the second Party with obj of index {string} and id of index {string} id {string} and txtSecondPrivilege {string} txtSecondPrivilegeValidity {string}")
    public void userAddTheSecondPartyWithObjOfIndexAndIdOfIndexIdAndTxtSecondPrivilegeTxtSecondPrivilegeValidity(String arg0, String arg1, String arg2, String arg3, String arg4) throws InterruptedException {

        POASpecial.drop_listSecondParty().click();
        Thread.sleep(100);
        WebElement objeItem = Hooks.driver.findElement( By.xpath("//div[@id='ddlAdjectiveSecondParty_chosen']//li[@data-option-array-index='"+arg0+"']"));

        objeItem.click();
        Thread.sleep(500);
        POASpecial.drop_id_listSecondParty().click();
        WebElement idItem = Hooks.driver.findElement(By.xpath("//div[@id='ddlConfirmTypeSeconedParty_chosen']//li[@data-option-array-index='"+arg1+"']"));
        Thread.sleep(100);
        idItem.click();
        Thread.sleep(1000);
        POASpecial.id_inputSecondParty().sendKeys(arg2);
        contractEstablishment.txtSecondPrivilege().sendKeys(arg3);
        contractEstablishment.txtSecondPrivilegeValidity().sendKeys(arg4);

        jse.executeScript("window.scrollBy(0,150)");


    }

    @When("user enter CONTRACT_ESTABLISHMENT_COMPANY TYPE {string} NAME {string} ADDRESS {string} CAPITAL {string} DURATION {string} ACTIVITIES {string}")
    public void userEnterCONTRACT_ESTABLISHMENT_COMPANYTYPENAMEADDRESSCAPITALDURATIONACTIVITIES(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) throws InterruptedException {

        contractEstablishment.CONTRACT_ESTABLISHMENT_COMPANY_TYPE().click();
        WebElement typeItem = Hooks.driver.findElement(By.xpath("//div[@id='4803_chosen']//li[@data-option-array-index='"+arg0+"']"));
        Thread.sleep(100);
        typeItem.click();
        contractEstablishment.CONTRACT_ESTABLISHMENT_NAME().sendKeys(arg1);
        contractEstablishment.CONTRACT_ESTABLISHMENT_ADDRESS().sendKeys(arg2);
        contractEstablishment.CONTRACT_ESTABLISHMENT_CAPITAL().sendKeys(arg3);
        contractEstablishment.CONTRACT_ESTABLISHMENT_DURATION().sendKeys(arg4);
        contractEstablishment.CONTRACT_ESTABLISHMENT_ACTIVITIES().sendKeys(arg5);
        Thread.sleep(1000);

    }
}