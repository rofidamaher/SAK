package org.example.pages.Adjectives;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P06_NewTreatment {

    public WebElement drop_list() {
        return Hooks.driver.findElement(By.id("ddlAdjectiveFirstParty_chosen"));
    }

    public WebElement adjectiveItem() {
        return Hooks.driver.findElement(By.xpath("//div[@id='ddlAdjectiveFirstParty_chosen']//ul[@class='chosen-results']//li[@data-option-array-index='8']"));
    }
    public WebElement drop_id_list() {
        return Hooks.driver.findElement(By.id("ddlConfirmTypeFirstParty_chosen"));
    }
    public WebElement CRValue() {
        return Hooks.driver.findElement(By.id("txtElsqlEltogaryFirstParty"));
    }

    public WebElement CompanyName() {
        return Hooks.driver.findElement(By.id("txtCompanyNameFirstParty"));
    }



    public WebElement id_input() {
        return Hooks.driver.findElement(By.id("txtConfirmFirstParty"));
    }

    public WebElement add_but() {
        return Hooks.driver.findElement(By.id("btnAddFirstParty"));
    }

    public WebElement suc_message() {
        return Hooks.driver.findElement(By.xpath("//div[@id='cboxLoadedContent']//center//span"));
    }

    public WebElement ok_but() {
        return Hooks.driver.findElement(By.xpath("//div[@id='cboxLoadedContent']//button"));
    }
    public WebElement Tre_num() {
        return Hooks.driver.findElement(By.xpath("//div[@id='title_services']//span[@class]"));
    }

}
