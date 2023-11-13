package org.example.stepDefs.ConfirmationSignatures;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.ConfirmationSignatures.P07_01_AGREEMENT;
import org.example.pages.POA.P05_01_POA_SPECIAL;
import org.example.pages.SALE.P06_02_SALE_LAND;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


public class D07_01_AGREEMENTStepDef {

    P05_01_POA_SPECIAL POASpecial = new P05_01_POA_SPECIAL();
    P06_02_SALE_LAND saleLand = new P06_02_SALE_LAND();
    P07_01_AGREEMENT agreement = new P07_01_AGREEMENT();
    JavascriptExecutor jse = (JavascriptExecutor) Hooks.driver;

    @When("user Add childType with obj of index {string} txtConfirmChildParty {string} and click on save btn")
    public void userAddChildTypeWithObjOfIndexTxtConfirmChildPartyAndClickOnSaveBtn(String arg0, String arg1) throws InterruptedException {

        Thread.sleep(300);
        saleLand.drop_listChildType().click();
        Thread.sleep(100);
        WebElement objeItem = Hooks.driver.findElement(By.xpath("//div[@id='childType_chosen']//li[@data-option-array-index='" + arg0 + "']"));
        objeItem.click();
        Thread.sleep(100);

        agreement.txtConfirmChildParty().sendKeys(arg1);
        saleLand.btnAddChildParty().click();
        saleLand.save().click();
        POASpecial.ok_but().click();

    }

    @When("user add the second Party with obj of index {string} and id of index {string} id equal {string}")
    public void userAddTheSecondPartyWithObjOfIndexAndIdOfIndexIdEqual(String arg0, String arg1, String arg2) throws InterruptedException {
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
        agreement.txtNameSeconedParty().click();
        jse.executeScript("window.scrollBy(0,150)");
    }

    @And("user click on add button then click on YesFirstParty and add second Party with id {string} successfully")
    public void userClickOnAddButtonThenClickOnYesFirstPartyAndAddSecondPartyWithIdSuccessfully(String arg0) throws InterruptedException {

        POASpecial.add_butSecondParty().click();

        agreement.YesFirstParty().click();
        Thread.sleep(100);
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        POASpecial.ok_but().click();

        jse.executeScript("window.scrollBy(0,150)");

        for (int i = 0; i <POASpecial.secondPartyTable().size() ; i++) {
            String actualResult =POASpecial.secondPartyTable().get(i).getText();
            System.out.println(actualResult);
            Assert.assertTrue(actualResult.contains(arg0),"id for second Party has found : " + i);
        }
    }


    @And("user close the second Party and open the third Party")
    public void userCloseTheSecondPartyAndOpenTheThirdParty() throws InterruptedException {
        Thread.sleep(100);
        POASpecial.nav_Second_Side().click();
        Thread.sleep(100);
        agreement.nav_third_Side().click();
    }

    @When("user add the third Party with obj of index {string} and id of index {string} id {string} NationalityThirdParty {string}")
    public void userAddTheThirdPartyWithObjOfIndexAndIdOfIndexIdDdlNationalityThirdParty_chosen(String arg0, String arg1, String arg2, String arg3) throws InterruptedException {
        agreement.drop_listThirdParty().click();
        Thread.sleep(100);
        WebElement objeItem = Hooks.driver.findElement( By.xpath("//div[@id='ddlAdjectiveThirdParty_chosen']//li[@data-option-array-index='"+arg0+"']"));

        objeItem.click();
        Thread.sleep(100);
        agreement.drop_id_listThirdParty().click();
        WebElement idItem = Hooks.driver.findElement(By.xpath("//div[@id='ddlConfirmTypeThirdParty_chosen']//li[@data-option-array-index='"+arg1+"']"));

        Thread.sleep(100);
        idItem.click();
        Thread.sleep(1000);
        agreement.txtConfirmThirdParty().sendKeys(arg2);

        agreement.ddlNationalityThirdParty_chosen().click();
        WebElement nationality = Hooks.driver.findElement(By.xpath("//div[@id='ddlNationalityThirdParty_chosen']//li[@data-option-array-index='"+arg3+"']"));

        Thread.sleep(100);
        nationality.click();

    }

    @And("user click on add button and add third Party with id {string} successfully")
    public void userClickOnAddButtonAndAddThirdPartyWithIdSuccessfully(String arg0) throws InterruptedException {
        agreement.btnAddThirdParty().click();
        Thread.sleep(100);
        POASpecial.ok_but().click();

        jse.executeScript("window.scrollBy(0,150)");

        for (int i = 0; i <agreement.thirdPartyTable().size() ; i++) {
            String actualResult =agreement.thirdPartyTable().get(i).getText();
            System.out.println(actualResult);
            Assert.assertTrue(actualResult.contains(arg0),"id for third Party has found : " + i);
        }
    }

    @And("user close the third Party and open the samples Nav")
    public void userCloseTheThirdPartyAndOpenTheSamplesNav() throws InterruptedException {

        Thread.sleep(100);
        agreement.nav_third_Side().click();
        Thread.sleep(100);
        POASpecial.nav_sample().click();
    }

    @When("user enter CONTRACT_VALUE {string} and select CONTRACT_PERIOD_FROM Y {string} M {string} D {string} CONTRACT_PERIOD_TO Y {string} M {string} D {string}")
    public void userEnterCONTRACT_VALUEAndSelectCONTRACT_PERIOD_FROMYMDCONTRACT_PERIOD_TOYMD(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws InterruptedException {
        Thread.sleep(10000);
        agreement.CONTRACT_VALUE().sendKeys(arg0);
        Thread.sleep(100);
        agreement.CONTRACT_PERIOD_FROM().click();
        Thread.sleep(200);
        setDateFrom(arg1,arg2,arg3);

        agreement.CONTRACT_PERIOD_TO().click();
        Thread.sleep(200);
        setDateTo(arg4,arg5,arg6);
    }
    public void setDateFrom(String Y , String M , String D) throws InterruptedException {
        //Thread.sleep(1000);
        agreement.datepicker_daysFrom().click();
        Thread.sleep(500);
        agreement.datepicker_monthsFrom().click();
        Thread.sleep(200);
        WebElement year = Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][1]//div[@class='datepicker-years']//span[text()='"+Y+"']"));
        year.click();
        WebElement Month = Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][1]//div[@class='datepicker-months']//span[text()='"+M+"']"));
        Month.click();
        WebElement Day = Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][1]//div[@class='datepicker-days']//td[text()='"+D+"']"));
        Day.click();
    }
    public void setDateTo(String Y , String M , String D) throws InterruptedException {
        //Thread.sleep(1000);
        agreement.datepicker_daysTo().click();
        Thread.sleep(200);
        agreement.datepicker_monthsTo().click();
        Thread.sleep(200);
        WebElement year = Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][2]//div[@class='datepicker-years']//span[text()='"+Y+"']"));
        year.click();
        WebElement Month = Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][2]//div[@class='datepicker-months']//span[text()='"+M+"']"));
        Month.click();
        WebElement Day = Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][2]//div[@class='datepicker-days']//td[text()='"+D+"']"));
        Day.click();
    }


}
