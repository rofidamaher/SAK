package org.example.stepDefs.POA;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.POA.P05_01_POA_SPECIAL;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


public class D05_01_POA_SPECIALStepDef {

    P05_01_POA_SPECIAL POASpecial = new P05_01_POA_SPECIAL();

    @When("user add the first Party with obj of index {string} and id of index {string} id equal {string} and click on btnAddFirstParty")
    public void userAddTheFirstSideForPOA_SPECIALWithObjOfIndexAndIdOfIndexIdEqualAndClickOnApplicant(String arg0, String arg1, String arg2){
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(POASpecial.drop_listFirstParty())).click();

        WebElement objeItem = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@id='ddlAdjectiveFirstParty_chosen']//ul[@class='chosen-results']//li[@data-option-array-index='" + arg0 + "']")));
        objeItem.click();

        wait.until(ExpectedConditions.elementToBeClickable(POASpecial.drop_id_listFirstParty())).click();

        WebElement idItem = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@id='ddlConfirmTypeFirstParty_chosen']//ul[@class='chosen-results']//li[@data-option-array-index='" + arg1 + "']")));
        idItem.click();

        wait.until(ExpectedConditions.elementToBeClickable(POASpecial.id_inputFirstParty())).sendKeys(arg2);
        wait.until(ExpectedConditions.elementToBeClickable(POASpecial.applicant_checkboxFirstParty())).click();

    }


    @And("user click on add button and add new first Party successfully")
    public void userClickOnAddButAndAddNewTransactionsSuccessfully(){

        JavascriptExecutor jse = (JavascriptExecutor) Hooks.driver;
        jse.executeScript("window.scrollBy(0,150)");

        POASpecial.add_butFirstParty().click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(POASpecial.ok_but())).click();
        String actualResult1 = POASpecial.transactions_num().getText();
        System.out.println(actualResult1);

        // Soft Assertion
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(POASpecial.transactions_num().isDisplayed());

        // Assert All
        soft.assertAll();
    }


    @And("user close first Party and open the second Party")
    public void userCloseFirstSideForPOA_SPECIALAndOpenTheSecondSideForPOA_SPECIAL(){
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(POASpecial.nav_First_Side())).click();
        wait.until(ExpectedConditions.elementToBeClickable(POASpecial.nav_Second_Side())).click();
    }

    @When("user add the second Party with obj of index {string} and id of index {string} id equal {string} and CR equal {string}")
    public void userAddTheSecondSideForPOA_SPECIALWithObjOfIndexAndIdOfIndexIdEqualAndCREqual(String arg0, String arg1, String arg2, String arg3){
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(POASpecial.drop_listSecondParty())).click();

        WebElement objeItem = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@id='ddlAdjectiveSecondParty_chosen']//ul[@class='chosen-results']//li[@data-option-array-index='" + arg0 + "']")));
        objeItem.click();

        wait.until(ExpectedConditions.elementToBeClickable(POASpecial.drop_id_listSecondParty())).click();

        WebElement idItem = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@id='ddlConfirmTypeSeconedParty_chosen']//ul[@class='chosen-results']//li[@data-option-array-index='" + arg1 + "']")));
        idItem.click();

        wait.until(ExpectedConditions.elementToBeClickable(POASpecial.id_inputSecondParty())).sendKeys(arg2);
        wait.until(ExpectedConditions.elementToBeClickable(POASpecial.elsqlEltogary_Value())).sendKeys(arg3);
        wait.until(ExpectedConditions.elementToBeClickable(POASpecial.companyNameSecondParty())).click();

        JavascriptExecutor jse = (JavascriptExecutor) Hooks.driver;
        jse.executeScript("window.scrollBy(0,150)");
    }


    @And("user click on add button and add new second Party with id {string} successfully")
    public void userClickOnAddButtonAndAddNewSecondPartyWithIdSuccessfully(String arg0){
        POASpecial.add_butSecondParty().click();

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(POASpecial.ok_but())).click();
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        for (WebElement tableData : POASpecial.secondPartyTable()) {
            String actualResult = tableData.getText();
            System.out.println(actualResult);
            Assert.assertTrue(actualResult.contains(arg0), "ID for second Party has been found: " + actualResult);
        }
    }
    @And("user close the second Party and open the model Nav")
    public void userCloseTheSecondPartyForPOA_SPECIALAndOpenTheSamplesNavForPOA_SPECIAL(){
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(POASpecial.nav_Second_Side())).click();
        wait.until(ExpectedConditions.elementToBeClickable(POASpecial.nav_sample())).click();
    }

    @When("user chick the fixed text checkbox and click inside the state of qatar radio btn")
    public void userChickTheFixedTextcheckboxAndClickInsideTheStateOfQatarRadioBtn(){
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(POASpecial.simpleTextCheckbox())).click();
        wait.until(ExpectedConditions.elementToBeClickable(POASpecial.inSideQaterRadioBtn())).click();
    }

    @And("user click on save model btn")
    public void userClickOnSaveModelBtn(){
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));


        JavascriptExecutor jse = (JavascriptExecutor) Hooks.driver;
        jse.executeScript("arguments[0].scrollIntoView();", POASpecial.saveModelBtn());

        wait.until(ExpectedConditions.elementToBeClickable(POASpecial.saveModelBtn())).click();
        wait.until(ExpectedConditions.elementToBeClickable(POASpecial.ok_but())).click();
    }

    @And("user close the the samples Nav and open the fees Nav")
    public void userCloseTheTheSamplesNavForPOA_SPECIALAndOpenTheFeesNavForPOA_SPECIAL(){
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(POASpecial.nav_sample())).click();
        wait.until(ExpectedConditions.elementToBeClickable(POASpecial.nav_fees())).click();
    }

    @When("user click on noFees checkbox and select ExcemptedReasons {string}")
    public void userClickOnNoFeesCheckboxAndSelectExcemptedReasons(String arg0){
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(POASpecial.chkNoFees())).click();
        WebElement excemptedReasonsElement = wait.until(ExpectedConditions.elementToBeClickable(POASpecial.excemptedReasons()));
        Select select = new Select(excemptedReasonsElement);
        select.selectByVisibleText(arg0);
    }

    @And("user click on btnViewTransaction")
    public void userClickOnBtnViewTransaction(){
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));

        JavascriptExecutor jse = (JavascriptExecutor) Hooks.driver;
        jse.executeScript("arguments[0].scrollIntoView();", POASpecial.btnViewTransaction());


        wait.until(ExpectedConditions.elementToBeClickable(POASpecial.btnViewTransaction())).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cboxContent")));

        POASpecial.cboxClose().click();
        // Thread.sleep(200);
    }

    @Then("user click on btnSubmitTransaction and Transaction added successfully")
    public void userClickOnBtnSubmitTransactionAndTransactionAddedSuccessfully() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));

        POASpecial.btnSubmitTransaction().click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cboxContent")));

        //        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(6));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cboxContent")));
//
//        while (!isDisplayed(Hooks.driver.findElement(By.id("cboxContent"))))
//        {
//            Thread.sleep(3000);
//            System.out.println("Element cboxContent is not visible yet");
//        }
//        POASpecial.cboxClose().click();
//        Thread.sleep(200);
        JavascriptExecutor jse = (JavascriptExecutor) Hooks.driver;
        jse.executeScript("arguments[0].scrollIntoView();", POASpecial.completeRequestShowFlag());

        Assert.assertFalse(POASpecial.completeRequestShowFlag().isDisplayed());
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
