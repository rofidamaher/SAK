package org.example.stepDefs.SALE;

import io.cucumber.java.en.When;
import org.example.pages.POA.P05_01_POA_SPECIAL;
import org.example.pages.SALE.P06_01_SALE_COMPANY;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class D06_01_SALE_COMPANYStepDef {

    P05_01_POA_SPECIAL POASpecial = new P05_01_POA_SPECIAL();
    P06_01_SALE_COMPANY saleCompany = new P06_01_SALE_COMPANY();
    JavascriptExecutor jse = (JavascriptExecutor) Hooks.driver;

    @When("user add the first Party with obj of index {string} and id of index {string} civilId equal {string}  txtPercentFristParty {string} and click on chkDepositFirstParty")
    public void userAddTheFirstPartyWithObjOfIndexAndIdOfIndexCivilIdEqualTxtPercentFristPartyAndClickOnChkDepositFirstParty(String arg0, String arg1, String arg2, String arg3) throws InterruptedException {
     POASpecial.drop_listFirstParty().click();
        Thread.sleep(100);
        WebElement objeItem = Hooks.driver.findElement( By.xpath("//div[@id='ddlAdjectiveFirstParty_chosen']//ul[@class='chosen-results']//li[@data-option-array-index='"+arg0+"']"));

        objeItem.click();
        Thread.sleep(100);
        POASpecial.drop_id_listFirstParty().click();
        WebElement idItem = Hooks.driver.findElement(By.xpath("//div[@id='ddlConfirmTypeFirstParty_chosen']//ul[@class='chosen-results']//li[@data-option-array-index='"+arg1+"']"));

        Thread.sleep(100);
        idItem.click();
        saleCompany.civilId().sendKeys(arg2);
        saleCompany.txtPercentFristParty().sendKeys(arg3);
        POASpecial.applicant_checkboxFirstParty().click();

    }



}
