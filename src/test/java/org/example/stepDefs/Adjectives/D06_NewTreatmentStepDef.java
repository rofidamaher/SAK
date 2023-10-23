package org.example.stepDefs.Adjectives;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.Adjectives.P06_NewTreatment;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;


public class D06_NewTreatmentStepDef {

    P06_NewTreatment new_t = new P06_NewTreatment();

    @And("user add new treatment for obj of index {string} and id of index {string} id equal {string}")
    public void userAddNewTreatmentForObjOfIndexAndIdOfIndexIdEqual(String arg0, String arg1, String arg2){
        new_t.drop_list().click();

        // Wait for the object item to be clickable
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        WebElement objeItem = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@id='ddlAdjectiveFirstParty_chosen']//ul[@class='chosen-results']//li[@data-option-array-index='"+arg0+"']")));

        objeItem.click();

        new_t.drop_id_list().click();

        // Wait for the ID item to be clickable
        WebElement idItem = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@id='ddlConfirmTypeFirstParty_chosen']//ul[@class='chosen-results']//li[@data-option-array-index='"+arg1+"']")));

        idItem.click();

        // Use explicit wait for the ID input to be clickable and then send keys
        WebElement idInput = wait.until(ExpectedConditions.elementToBeClickable(new_t.id_input()));
        idInput.sendKeys(arg2);
    }


    @When("user add new treatment for obj of index {string} and id of index {string} id equal {string} and CR equal {string}")
    public void userAddNewTreatmentForObjOfIndexAndIdOfIndexIdEqualAndCREqual(String arg0, String arg1, String arg2, String arg3){
        new_t.drop_list().click();

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));

        WebElement objeItem = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@id='ddlAdjectiveFirstParty_chosen']//ul[@class='chosen-results']//li[@data-option-array-index='"+arg0+"']")));
        objeItem.click();

        new_t.drop_id_list().click();

        WebElement idItem = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@id='ddlConfirmTypeFirstParty_chosen']//ul[@class='chosen-results']//li[@data-option-array-index='"+arg1+"']")));
        idItem.click();

        WebElement idInput = wait.until(ExpectedConditions.elementToBeClickable(new_t.id_input()));
        idInput.sendKeys(arg2);

        WebElement crValue = wait.until(ExpectedConditions.elementToBeClickable(new_t.CRValue()));
        crValue.sendKeys(arg3);

        new_t.CompanyName().click();
    }

    @And("user click on add but and add new treatment successfully")
    public void userClickOnAddButAndAddNewTreatmentSuccessfully(){
        JavascriptExecutor jse = (JavascriptExecutor) Hooks.driver;
        jse.executeScript("window.scrollBy(0,150)");

        new_t.add_but().click();

        // Use WebDriverWait to wait for the "OK" button to be clickable
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(new_t.ok_but())).click();

        // Wait for the treatment number element to be displayed
        WebElement treNum = wait.until(ExpectedConditions.visibilityOf(new_t.Tre_num()));
        String actualResult1 = treNum.getText();

        System.out.println(actualResult1);

        // Soft Assertion
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(treNum.isDisplayed());

        // Assert All
        soft.assertAll();
    }
}
