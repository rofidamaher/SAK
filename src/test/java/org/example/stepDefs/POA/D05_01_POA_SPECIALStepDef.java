package org.example.stepDefs.POA;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.POA.P05_01_POA_SPECIAL;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


public class D05_01_POA_SPECIALStepDef {

    P05_01_POA_SPECIAL POASpecial = new P05_01_POA_SPECIAL();
    JavascriptExecutor jse = (JavascriptExecutor) Hooks.driver;
    String transactions_num ;

    @When("user add the first Party with obj of index {string} and id of index {string} id equal {string} and click on chkDepositFirstParty")
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
    public String userClickOnAddButAndAddNewTransactionsSuccessfully() throws InterruptedException {
        jse.executeScript("window.scrollBy(0,150)");
        POASpecial.add_butFirstParty().click();
        Thread.sleep(1000);
        // Soft Assertion
        SoftAssert soft = new SoftAssert();
        POASpecial.ok_but().click();
        String actualResult1 = POASpecial.transactions_num().getText();
        transactions_num = POASpecial.transactions_num().getText();

        System.out.println(actualResult1);
        soft.assertTrue(POASpecial.transactions_num().isDisplayed());
        // Assert All
        soft.assertAll();

        return transactions_num;
    }


    @And("user close first Party and open the second Party")
    public void userCloseFirstSideForPOA_SPECIALAndOpenTheSecondSideForPOA_SPECIAL() throws InterruptedException {
        Thread.sleep(100);
        POASpecial.nav_First_Side().click();
        Thread.sleep(100);
        POASpecial.nav_Second_Side().click();

    }

    @When("user add the second Party with obj of index {string} and id of index {string} id equal {string} and CR equal {string}")
    public void userAddTheSecondSideForPOA_SPECIALWithObjOfIndexAndIdOfIndexIdEqualAndCREqual(String arg0, String arg1, String arg2, String arg3) throws InterruptedException {
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
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        jse.executeScript("window.scrollBy(0,150)");

        for (int i = 0; i <POASpecial.secondPartyTable().size() ; i++) {
            String actualResult =POASpecial.secondPartyTable().get(i).getText();
            System.out.println(actualResult);
            Assert.assertTrue(actualResult.contains(arg0),"id for second Party has found : " + i);
            //Assert.assertEquals(actualResult.contains(expectedResult),true,"euro symbol is displayed on product :" + i);
        }
    }
    @And("user close the second Party and open the model Nav")
    public void userCloseTheSecondPartyForPOA_SPECIALAndOpenTheSamplesNavForPOA_SPECIAL() throws InterruptedException {
        Thread.sleep(100);
        POASpecial.nav_Second_Side().click();
        Thread.sleep(100);
        POASpecial.nav_sample().click();
    }

    @When("user chick the fixed text checkbox and click inside the state of qatar radio btn")
    public void userChickTheFixedTextcheckboxAndClickInsideTheStateOfQatarRadioBtn() throws InterruptedException {
        POASpecial.simpleTextCheckbox().click();
        Thread.sleep(100);
        POASpecial.inSideQaterRadioBtn().click();

    }

    @And("user click on save model btn")
    public void userClickOnSaveModelBtn() throws InterruptedException {

        jse.executeScript("arguments[0].scrollIntoView();", POASpecial.saveModelBtn());

        POASpecial.saveModelBtn().click();
        Thread.sleep(100);
        POASpecial.ok_but().click();

    }

    @And("user close the the samples Nav and open the fees Nav")
    public void userCloseTheTheSamplesNavForPOA_SPECIALAndOpenTheFeesNavForPOA_SPECIAL() throws InterruptedException {

        POASpecial.nav_sample().click();
        Thread.sleep(100);
        POASpecial.nav_fees().click();
        Thread.sleep(100);
    }
    @When("user click on noFees checkbox and select ExcemptedReasons {string}")
    public void userClickOnNoFeesCheckboxAndSelectExcemptedReasons(String arg0) throws InterruptedException {
        POASpecial.chkNoFees().click();
        Thread.sleep(500);
        Select select = new Select(POASpecial.excemptedReasons());
        select.selectByVisibleText(arg0);
    }

    @And("user click on btnViewTransaction")
    public void userClickOnBtnViewTransaction() throws InterruptedException {
        jse.executeScript("arguments[0].scrollIntoView();", POASpecial.btnViewTransaction());
        POASpecial.btnViewTransaction().click();
        Thread.sleep(2000);
        while (!isDisplayed(Hooks.driver.findElement(By.id("cboxContent"))))
        {
            Thread.sleep(3000);
            System.out.println("Element is not visible yet");
        }
        Thread.sleep(200);
        POASpecial.cboxClose().click();
       // Thread.sleep(200);
    }

    @Then("user click on btnSubmitTransaction")
    public void userClickOnBtnSubmitTransactionAndTransactionAddedSuccessfully() throws InterruptedException {
        POASpecial.btnSubmitTransaction().click();
        Thread.sleep(10000);
//        Hooks.driver.switchTo().frame(Hooks.driver.findElement(By.className("cboxIframe")));
//        Thread.sleep(300);
//        Hooks.driver.switchTo().defaultContent();
//        Thread.sleep(300);
//        POASpecial.btnSubmitTransaction().getCssValue("background-color");
//        System.out.println(POASpecial.btnSubmitTransaction().getCssValue("background-color"));


//        while (!isDisplayed( Hooks.driver.findElement(By.id("cboxContent"))))
//        {
//            Thread.sleep(3000);
//            System.out.println("Element is not visible yet");
//        }
//        Thread.sleep(500);
//        POASpecial.cboxClose().click();
//        Assert.assertTrue(POASpecial.completeRequestShowFlag().isDisplayed());
    }

    public static boolean isDisplayed(WebElement element) {
        try {
            if(element.isDisplayed())
                return element.isDisplayed();
        }catch (NoSuchElementException ex) {
            return false;
        }
        return false;
    }



}
