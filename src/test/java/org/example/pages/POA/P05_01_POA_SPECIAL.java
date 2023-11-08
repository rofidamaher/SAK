package org.example.pages.POA;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P05_01_POA_SPECIAL {

    public WebElement drop_listFirstParty() {
        return Hooks.driver.findElement(By.id("ddlAdjectiveFirstParty_chosen"));
    }

    public WebElement drop_id_listFirstParty() {
        return Hooks.driver.findElement(By.id("ddlConfirmTypeFirstParty_chosen"));

    }

    public WebElement applicant_checkboxFirstParty() {
        return Hooks.driver.findElement(By.id("chkDepositFirstParty"));
    }
    public WebElement id_inputFirstParty() {
        return Hooks.driver.findElement(By.id("txtConfirmFirstParty"));
    }

    public WebElement add_butFirstParty() {
        return Hooks.driver.findElement(By.id("btnAddFirstParty"));
    }


    public WebElement suc_message() {
        return Hooks.driver.findElement(By.xpath("//div[@id='cboxLoadedContent']//center//span"));
    }
    public WebElement ok_but() {

        return Hooks.driver.findElement(By.xpath("//div[@id='cboxLoadedContent']//button"));
    }
    public WebElement transactions_num() {
        return Hooks.driver.findElement(By.xpath("//div[@id='title_services']//span[@class]"));
    }
    public WebElement nav_First_Side() {
        return Hooks.driver.findElement(By.id("fisrtParty"));
    }
    public WebElement nav_Second_Side() {
        return Hooks.driver.findElement(By.id("secondParty"));
    }

    public WebElement drop_listSecondParty() {
        return Hooks.driver.findElement(By.id("ddlAdjectiveSecondParty_chosen"));
    }

    public WebElement drop_id_listSecondParty() {
        return Hooks.driver.findElement(By.id("ddlConfirmTypeSeconedParty_chosen"));
    }

    public WebElement id_inputSecondParty() {
        return Hooks.driver.findElement(By.id("txtConfirmSecondParty"));
    }
    public WebElement elsqlEltogary_Value() {
        return Hooks.driver.findElement(By.id("txtElsqlEltogarySecondParty"));
    }


    public WebElement add_butSecondParty() {
        return Hooks.driver.findElement(By.id("btnAddSeconedParty"));
    }


    public WebElement companyNameSecondParty() {
        return Hooks.driver.findElement(By.id("txtCompanyNameSecondParty"));
    }
    public List<WebElement> secondPartyTable()
    {
        List<WebElement> secondPartyTableIds = Hooks.driver.findElements(By.xpath("//form[@class=\"secondParty ng-pristine ng-valid ng-scope\"]//tbody//tr//td[@data-title=\" رقم الإثبات\"]"));
        return secondPartyTableIds;
    }
     public WebElement nav_sample() {
        return Hooks.driver.findElement(By.id("li_debage"));
    }

    public WebElement simpleTextCheckbox() {
        return Hooks.driver.findElement(By.xpath("//legend//input[@type=\"checkbox\"]"));
    }
    public WebElement inSideQaterRadioBtn() {
        return Hooks.driver.findElement(By.id("2483"));
    }

    public WebElement saveModelBtn() {
        return Hooks.driver.findElement(By.id("btnAddDebagaRequest"));
    }
    public WebElement nav_fees() {
        return Hooks.driver.findElement(By.id("li_fees"));
    }

    public WebElement chkNoFees() {
        return Hooks.driver.findElement(By.id("chkNoFees"));
    }

    public WebElement excemptedReasons() {
        return Hooks.driver.findElement(By.id("ddlExcemptedReasons"));
    }

    public WebElement btnViewTransaction() {
        return Hooks.driver.findElement(By.id("btnViewTransaction"));
    }

    public WebElement cboxClose() {
        return Hooks.driver.findElement(By.id("cboxClose"));
    }

    public WebElement btnSubmitTransaction() {
        return Hooks.driver.findElement(By.id("btnSubmitTransaction"));
    }
    public WebElement completeRequestShowFlag() {
        return Hooks.driver.findElement(By.id("completeRequestShowFlag"));
    }











}
