package org.example.stepDefs.MORTGAGE;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.MORTGAGE.P09_01_MORTGAGE_LAND;
import org.example.pages.MORTGAGE.P09_03_MORTGAGE_RE;
import org.example.pages.POA.P05_01_POA_SPECIAL;
import org.example.pages.SALE.P06_01_SALE_COMPANY;
import org.example.stepDefs.ConfirmationSignatures.D07_01_AGREEMENTStepDef;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class D09_03_MORTGAGE_REStepDef {
    P09_03_MORTGAGE_RE mortgageRE = new P09_03_MORTGAGE_RE();
    P05_01_POA_SPECIAL POASpecial = new P05_01_POA_SPECIAL();
    P06_01_SALE_COMPANY saleCompany = new P06_01_SALE_COMPANY();
    D07_01_AGREEMENTStepDef agreementStepDef = new D07_01_AGREEMENTStepDef();

    @When("user click on MORTGAGE_RE")
    public void userClickOnMORTGAGE_RE() {
        mortgageRE.MORTGAGE_RE().click();
    }

    @Then("user clicked on MORTGAGE_RE successfully")
    public void userClickedOnMORTGAGE_RESuccessfully() {
        SoftAssert soft = new SoftAssert();
        String expectedResult = "رهن أصول";
        String actualResult = mortgageRE.MORTGAGE_label().getText();
        System.out.println(actualResult);
        soft.assertEquals(actualResult.contains(expectedResult), true);
        soft.assertTrue(actualResult.contains(expectedResult), "user clicked on MORTGAGE_RE successfully");
        String expectedResulturl = "http://192.168.1.111:8085/Master.html#/MORTGAGE_RE/:95";
        String actualResulturl = Hooks.driver.getCurrentUrl();
        System.out.println(actualResulturl);
        soft.assertTrue(actualResulturl.contains(expectedResulturl), "user clicked on MORTGAGE_RE successfully");


        soft.assertAll();
    }

    @When("user add the first Party with obj of index {string} civilId {string} ddlNationalityFirstParty_chosen {string} textname {string} and click on chkDepositFirstParty")
    public void userAddTheFirstPartyWithObjOfIndexCivilIdDdlNationalityFirstParty_chosenTextnameAndClickOnChkDepositFirstParty(String arg0, String arg1, String arg2, String arg3) throws InterruptedException {
        POASpecial.drop_listFirstParty().click();
        Thread.sleep(100);
        WebElement objeItem = Hooks.driver.findElement( By.xpath("//div[@id='ddlAdjectiveFirstParty_chosen']//li[@data-option-array-index='"+arg0+"']"));
        objeItem.click();
        Thread.sleep(100);
        POASpecial.id_inputFirstParty().sendKeys(arg1);
        mortgageRE.ddlNationalityFirstParty_chosen().click();
        WebElement nationalityItem = Hooks.driver.findElement( By.xpath("//div[@id='ddlNationalityFirstParty_chosen']//li[@data-option-array-index='"+arg2+"']"));
        nationalityItem.click();
        Thread.sleep(100);
        mortgageRE.textname().sendKeys(arg3);
        POASpecial.applicant_checkboxFirstParty().click();

    }


    @When("user AddChildParty with adj of index {string} and obj of index {string} id equal {string} and click on save btn")
    public void userAddChildPartyWithAdjOfIndexAndObjOfIndexIdEqualAndClickOnSaveBtn(String arg0, String arg1, String arg2) throws InterruptedException {

        saleCompany.AddChildParty().click();
        saleCompany.ddlAdjectiveDependentParty_chosen().click();
        Thread.sleep(100);
        WebElement objeItem = Hooks.driver.findElement( By.xpath("//div[@id='ddlAdjectiveDependentParty_chosen']//li[@data-option-array-index='"+arg0+"']"));
        objeItem.click();
        mortgageRE.childType_chosen().click();
        Thread.sleep(100);
        WebElement childTypeItem = Hooks.driver.findElement( By.xpath("//div[@id='childType_chosen']//li[@data-option-array-index='"+arg1+"']"));
        childTypeItem.click();
        Thread.sleep(100);
        saleCompany.ddlID().sendKeys(arg2);
        Thread.sleep(100);
        saleCompany.saveBtn().click();
        Thread.sleep(100);
        saleCompany.savechildBtn().click();
        Thread.sleep(100);
        POASpecial.ok_but().click();
    }

    @When("user enter MORTGAGE_NAME_RE {string} MORTGAGE_VALUE_RE {string} MORTGAGE_NO_APPROVAL_LETTER_RE {string} MORTGAGE_PERIOD_FROM Y {string} M {string} D {string} MORTGAGE_PERIOD_TO Y {string} M {string} D {string}")
    public void userEnterMORTGAGE_NAME_REMORTGAGE_VALUE_REMORTGAGE_NO_APPROVAL_LETTER_REMORTGAGE_PERIOD_FROMYMDMORTGAGE_PERIOD_TOYMD(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8) throws InterruptedException {

        Thread.sleep(100);
        mortgageRE.MORTGAGE_NAME_RE().sendKeys(arg0);
        mortgageRE.MORTGAGE_RE_FROM().click();
        Thread.sleep(200);
        agreementStepDef.setDateFrom(arg3, arg4, arg5);

        mortgageRE.MORTGAGE_RE_TO().click();
        Thread.sleep(200);
        agreementStepDef.setDateTo(arg6, arg7, arg8);
        Thread.sleep(200);
        mortgageRE.MORTGAGE_VALUE_RE().sendKeys(arg1);
        mortgageRE.MORTGAGE_NO_APPROVAL_LETTER_RE().sendKeys(arg2);

        mortgageRE.btnAddDebagaToTable().click();
        POASpecial.ok_but().click();
        Thread.sleep(2000);
    }
}