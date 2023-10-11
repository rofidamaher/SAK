package org.example.stepDefs.POA;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.Adjectives.P06_NewTreatment;
import org.example.pages.POA.P05_01_POA_SPECIAL;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.util.concurrent.TimeUnit;


public class D05_01_POA_SPECIALStepDef {

    P05_01_POA_SPECIAL POASpecial = new P05_01_POA_SPECIAL();

    @When("user add the first Party for POA_SPECIAL with obj of index {string} and id of index {string} id equal {string} and click on applicant")
    public void userAddTheFirstSideForPOA_SPECIALWithObjOfIndexAndIdOfIndexIdEqualAndClickOnApplicant(String arg0, String arg1, String arg2) throws InterruptedException {
        POASpecial.drop_listFirstParty().click();
        Thread.sleep(100);
        WebElement objeItem = Hooks.driver.findElement( By.xpath("//div[@id='ddlAdjectiveFirstParty_chosen']//ul[@class='chosen-results']//li[@data-option-array-index='"+arg0+"']"));

        objeItem.click();
        Thread.sleep(100);
        POASpecial.drop_id_listFirstParty().click();
        WebElement idItem = Hooks.driver.findElement(By.xpath("//div[@id='ddlConfirmTypeFirstParty_chosen']//ul[@class='chosen-results']//li[@data-option-array-index='"+arg1+"']"));

        Thread.sleep(100);
        idItem.click();
        Thread.sleep(1000);
        POASpecial.id_inputFirstParty().sendKeys(arg2);
        POASpecial.applicant_checkboxFirstParty().click();

    }

    
    @And("user click on add button and add new first Party successfully")
    public void userClickOnAddButAndAddNewTransactionsSuccessfully() throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor) Hooks.driver;
        jse.executeScript("window.scrollBy(0,150)");

        POASpecial.add_butFirstParty().click();
        Thread.sleep(1000);
        // Soft Assertion
        SoftAssert soft = new SoftAssert();
        POASpecial.ok_but().click();
        String actualResult1 = POASpecial.transactions_num().getText();

        System.out.println(actualResult1);
        soft.assertTrue(POASpecial.transactions_num().isDisplayed());
        // Assert All
        soft.assertAll();


    }


    @And("user close first Party for POA_SPECIAL and open the second Party for POA_SPECIAL")
    public void userCloseFirstSideForPOA_SPECIALAndOpenTheSecondSideForPOA_SPECIAL() throws InterruptedException {

        POASpecial.nav_First_Side().click();
        Thread.sleep(100);
        POASpecial.nav_Second_Side().click();

    }

    @When("user add the second Party for POA_SPECIAL with obj of index {string} and id of index {string} id equal {string} and CR equal {string}")
    public void userAddTheSecondSideForPOA_SPECIALWithObjOfIndexAndIdOfIndexIdEqualAndCREqual(String arg0, String arg1, String arg2, String arg3) throws InterruptedException {
        POASpecial.drop_listSecondParty().click();
        Thread.sleep(100);
        WebElement objeItem = Hooks.driver.findElement( By.xpath("//div[@id='ddlAdjectiveSecondParty_chosen']//ul[@class='chosen-results']//li[@data-option-array-index='"+arg0+"']"));

        objeItem.click();
        Thread.sleep(100);
        POASpecial.drop_id_listSecondParty().click();
        WebElement idItem = Hooks.driver.findElement(By.xpath("//div[@id='ddlConfirmTypeSeconedParty_chosen']//ul[@class='chosen-results']//li[@data-option-array-index='"+arg1+"']"));

        Thread.sleep(100);
        idItem.click();
        Thread.sleep(1000);
        POASpecial.id_inputSecondParty().sendKeys(arg2);
        POASpecial.elsqlEltogary_Value().sendKeys(arg3);
        POASpecial.companyNameSecondParty().click();
        JavascriptExecutor jse = (JavascriptExecutor) Hooks.driver;
        jse.executeScript("window.scrollBy(0,150)");
    }


    @And("user click on add button and add new second Party with id {string} successfully")
    public void userClickOnAddButtonAndAddNewSecondPartyWithIdSuccessfully(String arg0) throws InterruptedException {
     POASpecial.add_butSecondParty().click();
        Thread.sleep(1000);
        POASpecial.ok_but().click();
        Hooks.driver. manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        for (int i = 0; i <POASpecial.secondPartyTable().size() ; i++) {
            String actualResult =POASpecial.secondPartyTable().get(i).getText();
            System.out.println(actualResult);
            Assert.assertTrue(actualResult.contains(arg0),"id for second Party has found : " + i);
            //Assert.assertEquals(actualResult.contains(expectedResult),true,"euro symbol is displayed on product :" + i);

        }
    }


}
