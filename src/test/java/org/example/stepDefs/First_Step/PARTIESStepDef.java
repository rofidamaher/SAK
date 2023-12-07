package org.example.stepDefs.First_Step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.CONFIRMATION_SIGNATURES_P.P07_01_AGREEMENT;
import org.example.pages.First_Step.PARTIES;
import org.example.pages.POA.P05_01_POA_SPECIAL;
import org.example.pages.SALE.P06_02_SALE_LAND;
import org.example.stepDefs.ConfirmationSignatures.D07_01_AGREEMENTStepDef;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class PARTIESStepDef {

    PARTIES parties = new PARTIES();
    P05_01_POA_SPECIAL POASpecial = new P05_01_POA_SPECIAL();
    P07_01_AGREEMENT agreement = new P07_01_AGREEMENT();
    P06_02_SALE_LAND saleLand = new P06_02_SALE_LAND();
    D07_01_AGREEMENTStepDef agreementStepDef = new D07_01_AGREEMENTStepDef();

    JavascriptExecutor jse = (JavascriptExecutor) Hooks.driver;


    // القيم طرف اول
    @And("book's number is {string} and Book side is {string} for first Party")
    public void bookNumberAndBookSide(String arg0, String arg1) throws InterruptedException{

        Thread.sleep(200);
        parties.numberBook_FirstParty().click();
        parties.numberBook_FirstParty().sendKeys(arg0);

        Thread.sleep(300);
        parties.coverBook_FirstParty().click();
        parties.coverBook_FirstParty().sendKeys(arg1);
    }

    // الوصي طرف تاني
    @And("book's number is {string} and Book side is {string} for second party")
    public void bookNumberAndBookSideForSecondParty(String arg0, String arg1) throws InterruptedException{

        Thread.sleep(200);
        parties.wasyNumberBook_SecondParty().click();
        parties.wasyNumberBook_SecondParty().sendKeys(arg0);

        Thread.sleep(300);
        parties.wasyCoverBook_SecondParty().click();
        parties.wasyCoverBook_SecondParty().sendKeys(arg1);
    }

    // الولي الطبيعي
    @And("book's number is {string} and Book side is {string} for waly and first Party")
    public void bookNumberAndBookSideForWaly(String arg0, String arg1) throws InterruptedException{

        Thread.sleep(200);
        parties.walyNumberBook_FirstParty().click();
        parties.walyNumberBook_FirstParty().sendKeys(arg0);

        Thread.sleep(300);
        parties.walyCoverBook_FirstParty().click();
        parties.walyCoverBook_FirstParty().sendKeys(arg1);
    }

    //القيم طرف اول
    @When("user add the first Party with obj of index {string} and id of index {string} id equal {string} and book's number is {string} and Book side is {string} for first Party")
    public void userAddTheFirstPartyWithObjOfIndexAndIdOfIndexIdEqualAndBookSNumberIsAndBookSideIsForFirstParty(String arg0, String arg1, String arg2, String arg3, String arg4) throws InterruptedException {

        POASpecial.drop_listFirstParty().click();
        Thread.sleep(100);
        WebElement objeItem = Hooks.driver.findElement( By.xpath("//div[@id='ddlAdjectiveFirstParty_chosen']//li[@data-option-array-index='"+arg0+"']"));
        objeItem.click();
        Thread.sleep(100);

        POASpecial.drop_id_listFirstParty().click();
        WebElement idItem = Hooks.driver.findElement(By.xpath("//div[@id='ddlConfirmTypeFirstParty_chosen']//li[@data-option-array-index='"+arg1+"']"));
        Thread.sleep(100);
        idItem.click();

        Thread.sleep(1000);
        POASpecial.id_inputFirstParty().sendKeys(arg2);
        Thread.sleep(200);
        //parties.numberBook_FirstParty().click();
        parties.numberBook_FirstParty().sendKeys(arg3);
        Thread.sleep(300);
       // parties.coverBook_FirstParty().click();
        parties.coverBook_FirstParty().sendKeys(arg4);
    }

    // المفوض طرف ثاني(تفويض يدوي )
    @When("user add the second Party with obj of index {string} and id of index {string} id {string} txtBayanatElwkalaSecondParty {string}")
    public void userAddTheSecondPartyWithObjOfIndexAndIdOfIndexIdTxtBayanatElwkalaSecondParty(String arg0, String arg1, String arg2, String arg3) throws InterruptedException {

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
        parties.txtBayanatElwkalaSecondParty().sendKeys(arg3);
        jse.executeScript("window.scrollBy(0,50)");

    }
    @And("user click on ShowChild btn for id {string}")
    public void userClickOnShowChildBtnForId(String arg0) throws InterruptedException {
        Thread.sleep(500);
        for (int i = 0; i <POASpecial.secondPartyTable().size() ; i++) {
            String actualResult =POASpecial.secondPartyTable().get(i).getText();
            Thread.sleep(100);
            if(actualResult.equals(arg0)) {
                Thread.sleep(100);
                parties.ShowChildsecondPartyTable().get(i).click();
                Thread.sleep(300);
                break;
            }
        }

    }

    //المفوض طرف ثاني (تفويض الي )
    @When("user add the second Party with obj of index {string} and id of index {string} id {string} click on Wkala and txtRqmElwekalaSecondParty {string}")
    public void userAddTheSecondPartyWithObjOfIndexAndIdOfIndexIdClickOnWkalaAndTxtRqmElwekalaSecondParty(String arg0, String arg1, String arg2, String arg3) throws InterruptedException {

        jse.executeScript("window.scrollBy(0,-150)");
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
        parties.Wkala().click();
        Thread.sleep(100);

        parties.txtRqmElwekalaSecondParty().sendKeys(arg3);
       // jse.executeScript("window.scrollBy(0,50)");

        parties.Wkala().click();


    }
    // اضافة موكل للمفوض(تفويض الي ) طرف ثاني
    @And("user click on add button and choose AgentPersonsSecond {string} Sure new second Party id {string} added successfully")
    public void userClickOnAddButtonAndChooseAgentPersonsSecondSureNewSecondPartyIdAddedSuccessfully(String arg0, String arg1) throws InterruptedException {
        String actualResult ;
        int i;
        Thread.sleep(2100);
        POASpecial.add_butSecondParty().click();
        Thread.sleep(1000);
        for ( i = 0; i <parties.AgentPersonsSecondTd().size() ; i++) {
            actualResult = parties.AgentPersonsSecondTd().get(i).getText();
            Thread.sleep(100);
            if (actualResult.equals(arg0)) {
                parties.AgentPersonsSecondTd().get(i - 2).click();
               break;
            }
        }
        Thread.sleep(300);

        parties.saveAgentPersonsSecond().click();
        Thread.sleep(2000);
        POASpecial.ok_but().click();
        Thread.sleep(600);


        for (i = 0; i < POASpecial.secondPartyTable().size(); i++) {
            actualResult = POASpecial.secondPartyTable().get(i).getText();
            Thread.sleep(100);
            if (actualResult.equals(arg1)) {
                System.out.println(actualResult);
                Assert.assertTrue(actualResult.equals(arg1), "id for second Party has found : " + arg1);
            }
        }
    }
    //مخول بالتوقيع قيد منشاه
    @When("user add the second Party with obj of index {string} and id of index {string} id {string} txtBuildingNumberSecondParty {string} txtEmailBoxSecondParty {string} txtCompanyPhoneSecondParty {string} cRExpiryDateSecondParty Y {string} M {string} D {string}")
    public void userAddTheSecondPartyWithObjOfIndexAndIdOfIndexIdTxtBuildingNumberSecondPartyTxtEmailBoxSecondPartyTxtCompanyPhoneSecondPartyCRExpiryDateSecondPartyYMD(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8) throws InterruptedException {

        jse.executeScript("window.scrollBy(0,-150)");
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
        Thread.sleep(100);
        parties.txtBuildingNumberSecondParty().sendKeys(arg3);
        Thread.sleep(100);
        parties.txtEmailBoxSecondParty().sendKeys(arg4);
        Thread.sleep(100);
        parties.txtCompanyPhoneSecondParty().sendKeys(arg5);
        Thread.sleep(100);
        parties.cRExpiryDateSecondParty().click();

        agreementStepDef.setDateFrom(arg6,arg7,arg8);

    }
     //الولي الطبييعي
    @When("user add the second Party with obj of index {string} and id of index {string} id {string} txtWalyRaqmSecondParty {string} txtWalyYearSecondParty {string}")
    public void userAddTheSecondPartyWithObjOfIndexAndIdOfIndexIdTxtWalyRaqmSecondPartyTxtWalyYearSecondParty(String arg0, String arg1, String arg2, String arg3, String arg4) throws InterruptedException {

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
        parties.txtWalyRaqmSecondParty().sendKeys(arg3);
        Thread.sleep(100);
        parties.txtWalyYearSecondParty().sendKeys(arg4);
        jse.executeScript("window.scrollBy(0,150)");

    }


    @When("user add the second Party with obj of index {string} and id of index {string} id {string} txtBuildingNumberSecondParty {string}")
    public void userAddTheSecondPartyWithObjOfIndexAndIdOfIndexIdTxtBuildingNumberSecondParty(String arg0, String arg1, String arg2, String arg3) throws InterruptedException {

        jse.executeScript("window.scrollBy(0,-150)");
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
        parties.txtBuildingNumberSecondParty().sendKeys(arg3);
        Thread.sleep(100);

    }
}
