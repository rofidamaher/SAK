package org.example.stepDefs.POA;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.POA.P05_01_POA_SPECIAL;
import org.example.pages.POA.P05_02_POA_PARTIAL_STEPPED;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class D05_02_POA_PARTIAL_STEPPEDStepDef {

    P05_02_POA_PARTIAL_STEPPED POAPaetialStepped = new P05_02_POA_PARTIAL_STEPPED();
    P05_01_POA_SPECIAL POASpecial = new P05_01_POA_SPECIAL();



    @When("user add the first Party with obj of index {string} and id of index {string} id equal {string} and BayanatElwkalaFirstParty equal {string} click on btnAddFirstParty")
    public void userAddTheFirstPartyForPOA_PARTIAL_STEPPEDWithObjOfIndexAndIdOfIndexIdEqualAndBayanatElwkalaFirstPartyEqualClickOnBtnAddFirstParty(String arg0, String arg1, String arg2, String arg3) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));

        POASpecial.drop_listFirstParty().click();

        WebElement objeItem = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='ddlAdjectiveFirstParty_chosen']//ul[@class='chosen-results']//li[@data-option-array-index='" + arg0 + "']")));
        objeItem.click();

        POASpecial.drop_id_listFirstParty().click();

        WebElement idItem = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='ddlConfirmTypeFirstParty_chosen']//ul[@class='chosen-results']//li[@data-option-array-index='" + arg1 + "']")));
        idItem.click();

        WebElement idInputFirstParty = wait.until(ExpectedConditions.elementToBeClickable(POASpecial.id_inputFirstParty()));
        idInputFirstParty.sendKeys(arg2);
        POAPaetialStepped.txtBayanatElwkalaFirstParty().sendKeys(arg3);
        POASpecial.applicant_checkboxFirstParty().click();
    }

    @And("user click on addCompanyStakeholder with id of index {string} id equal {string} and Choose a nationality equal {string} and click at add btn and save btn")
    public void userClickOnAddCompanyStakeholderWithIdOfIndexIdEqualAndChooseANationalityEqualAndClickAtAddBtnAndSaveBtn(String arg0, String arg1, String arg2) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));

        POAPaetialStepped.addCompanyStakeholder().click();

        WebElement dropDownListIds = wait.until(ExpectedConditions.elementToBeClickable(POAPaetialStepped.dropDownListIds()));
        dropDownListIds.click();

        WebElement objeItem = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='chosen-results']//li[@data-option-array-index='" + arg0 + "']")));
        objeItem.click();

        POAPaetialStepped.inputId().sendKeys(arg1);

        WebElement dropDownListNationality = wait.until(ExpectedConditions.elementToBeClickable(POAPaetialStepped.dropDownListNationality()));
        dropDownListNationality.click();

        WebElement idItem = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='chosen-results']//li[@data-option-array-index='" + arg2 + "']")));
        idItem.click();

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loader")));

        POAPaetialStepped.btnAddChildParty().click();
        POAPaetialStepped.btnSaveChildParty().click();



    }


}
