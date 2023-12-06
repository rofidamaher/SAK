package org.example.stepDefs.SALE;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.POA.P05_01_POA_SPECIAL;
import org.example.pages.SALE.P06_01_SALE_COMPANY;
import org.example.pages.SALE.P06_02_SALE_LAND;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.NoSuchElementException;


public class D06_02_SALE_LANDStepDef {
    P05_01_POA_SPECIAL POASpecial = new P05_01_POA_SPECIAL();
    P06_02_SALE_LAND saleLand = new P06_02_SALE_LAND();
    JavascriptExecutor jse = (JavascriptExecutor) Hooks.driver;

    @When("user add the first Party with obj of index {string} and id of index {string} id {string} txtBayanatElwkalaFirstParty {string} and click on chkDepositFirstParty")
    public void userAddTheFirstPartyWithObjOfIndexAndIdOfIndexIdTxtBayanatElwkalaFirstPartyAndClickOnChkDepositFirstParty(String arg0, String arg1, String arg2, String arg3) throws InterruptedException {
        POASpecial.drop_listFirstParty().click();
        Thread.sleep(100);
        WebElement objeItem = Hooks.driver.findElement(By.xpath("//div[@id='ddlAdjectiveFirstParty_chosen']//li[@data-option-array-index='" + arg0 + "']"));
        objeItem.click();
        Thread.sleep(100);

        POASpecial.drop_id_listFirstParty().click();
        WebElement idItem = Hooks.driver.findElement(By.xpath("//div[@id='ddlConfirmTypeFirstParty_chosen']//li[@data-option-array-index='" + arg1 + "']"));
        Thread.sleep(500);
        idItem.click();


        POASpecial.id_inputFirstParty().sendKeys(arg2);
        saleLand.txtBayanatElwkalaFirstParty().sendKeys(arg3);
        POASpecial.applicant_checkboxFirstParty().click();


    }


    @When("user Add childType with obj of index {string}  id {string} and click on save btn")
    public void userAddChildTypeWithObjOfIndexIdAndClickOnSaveBtn(String arg0, String arg1) throws InterruptedException {
        Thread.sleep(2000);
        saleLand.drop_listChildType().click();
        Thread.sleep(100);
        WebElement objeItem = Hooks.driver.findElement(By.xpath("//div[@id='childType_chosen']//li[@data-option-array-index='" + arg0 + "']"));
        objeItem.click();
        Thread.sleep(100);

        saleLand.qidNumber().sendKeys(arg1);
        saleLand.btnAddChildParty().click();
        saleLand.save().click();
        POASpecial.ok_but().click();
    }

    @When("user add the second Party with obj of index {string} and id of index {string} id {string} txtValueRaqmSecondParty {string} txtValueYearSecondParty {string}")
    public void userAddTheSecondPartyWithObjOfIndexAndIdOfIndexIdTxtValueRaqmSecondPartyTxtValueYearSecondParty(String arg0, String arg1, String arg2, String arg3, String arg4) throws InterruptedException {

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
        POASpecial.id_inputSecondParty().click();
        Thread.sleep(100);
        saleLand.txtValueRaqmSecondParty().sendKeys(arg3);
        Thread.sleep(100);
        saleLand.txtValueYearSecondParty().sendKeys(arg4);
        jse.executeScript("window.scrollBy(0,150)");
    }


    @And("user click on ShowChild btn second Party")
    public void userClickOnShowChildBtnSecondParty() throws InterruptedException {
        Thread.sleep(100);
        saleLand.ShowChildsecondParty().click();

    }

    @When("user add SALE_REGION_LAND {string} and SALE_AREA_LAND {string} SALE_FIGURE_AREAL_LAND {string} SALE_VALUE_LAND {string} SALE_NO_APPROVAL_LETTER_LAND {string} and click on add btn")
    public void userAddSALE_REGION_LANDAndSALE_AREA_LANDSALE_FIGURE_AREAL_LANDSALE_VALUE_LANDSALE_NO_APPROVAL_LETTER_LANDAndClickOnAddBtn(String arg0, String arg1, String arg2, String arg3, String arg4) {
        saleLand.SALE_REGION_LAND().sendKeys(arg0);
        saleLand.SALE_AREA_LAND().sendKeys(arg1);
        saleLand.SALE_FIGURE_AREAL_LAND().sendKeys(arg2);
        saleLand.SALE_VALUE_LAND().sendKeys(arg3);
        saleLand.SALE_NO_APPROVAL_LETTER_LAND().sendKeys(arg4);
        saleLand.btnAddDebagaToTable().click();
        POASpecial.ok_but().click();
    }
}