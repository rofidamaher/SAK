package org.example.stepDefs.Adjectives;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.Adjectives.P06_NewTreatment;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;


public class D06_NewTreatmentStepDef {

    P06_NewTreatment new_t = new P06_NewTreatment();

    @And("user add new treatment for obj of index {string} and id of index {string} id equal {string}")
    public void userAddNewTreatmentForObjOfIndexAndIdOfIndexIdEqual(String arg0, String arg1, String arg2) throws InterruptedException {

        new_t.drop_list().click();
        Thread.sleep(100);
        WebElement objeItem = Hooks.driver.findElement( By.xpath("//div[@id='ddlAdjectiveFirstParty_chosen']//ul[@class='chosen-results']//li[@data-option-array-index='"+arg0+"']"));

        objeItem.click();
        Thread.sleep(100);
        new_t.drop_id_list().click();
        WebElement idItem = Hooks.driver.findElement(By.xpath("//div[@id='ddlConfirmTypeFirstParty_chosen']//ul[@class='chosen-results']//li[@data-option-array-index='"+arg1+"']"));

        Thread.sleep(100);
        idItem.click();
        Thread.sleep(1000);
        new_t.id_input().sendKeys(arg2);

    }


    @When("user add new treatment for obj of index {string} and id of index {string} id equal {string} and CR equal {string}")
    public void userAddNewTreatmentForObjOfIndexAndIdOfIndexIdEqualAndCREqual(String arg0, String arg1, String arg2, String arg3) throws InterruptedException {
        new_t.drop_list().click();
        Thread.sleep(100);
        WebElement objeItem = Hooks.driver.findElement( By.xpath("//div[@id='ddlAdjectiveFirstParty_chosen']//ul[@class='chosen-results']//li[@data-option-array-index='"+arg0+"']"));

        objeItem.click();
        Thread.sleep(100);
        new_t.drop_id_list().click();
        WebElement idItem = Hooks.driver.findElement(By.xpath("//div[@id='ddlConfirmTypeFirstParty_chosen']//ul[@class='chosen-results']//li[@data-option-array-index='"+arg1+"']"));

        Thread.sleep(100);
        idItem.click();
        Thread.sleep(1000);
        new_t.id_input().sendKeys(arg2);
        new_t.CRValue().sendKeys(arg3);
        new_t.CompanyName().click();
    }

    @And("user click on add but and add new treatment successfully")
    public void userClickOnAddButAndAddNewTreatmentSuccessfully() throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor) Hooks.driver;
        jse.executeScript("window.scrollBy(0,150)");

        new_t.add_but().click();
        Thread.sleep(1000);
        // Soft Assertion
        SoftAssert soft = new SoftAssert();
        //first Assert
//        String expectedResult = "تم حفظ  الموكل  بنجاح";
//        String actualResult = new_t.suc_message().getText();
//
//        System.out.println(actualResult);
//        //soft.assertEquals(actualResult.contains(expectedResult), true);
//        soft.assertTrue(actualResult.contains(expectedResult), "user add new treatment successful");
//

        new_t.ok_but().click();


        String actualResult1 = new_t.Tre_num().getText();

        System.out.println(actualResult1);
        soft.assertTrue(new_t.Tre_num().isDisplayed());
        // Assert All
        soft.assertAll();


    }
}
