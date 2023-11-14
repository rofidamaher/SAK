package org.example.stepDefs.First_Step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.First_Step.P07_MORTGAGE;
import org.example.stepDefs.Hooks;
import org.testng.asserts.SoftAssert;


public class D07_ConfirmationSignaturesStepDef {

    P07_MORTGAGE confirmationSignatures = new P07_MORTGAGE();


    @When("user click on AGREEMENT")
    public void userClickOnAGREEMENT() {
        confirmationSignatures.AGREEMENT().click();
        
    }
    @And("user clicked on AGREEMENT successfully")
    public void userClickedOnAGREEMENTSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        SoftAssert soft = new SoftAssert();

        String expectedResult = "عقد إتفاق";
        String actualResult =confirmationSignatures.Treatment_label().getText();

        System.out.println(actualResult);
        soft.assertEquals(actualResult.contains(expectedResult),true);
        soft.assertTrue(actualResult.contains(expectedResult),"user clicked on AGREEMENT successfully" );
        String expectedResulturl = "http://192.168.1.111:8085/Master.html#/AGREEMENT/:7";
        String actualResulturl = Hooks.driver.getCurrentUrl();
        System.out.println(actualResulturl);
        soft.assertTrue(actualResulturl.contains(expectedResulturl),"user clicked on AGREEMENT successfully" );

        // Assert All
        soft.assertAll();
    }

    @When("user click on SUPPLY")
    public void userClickOnSUPPLY() {
        confirmationSignatures.SUPPLY().click();
    }

    @And("user clicked on SUPPLY successfully")
    public void userClickedOnSUPPLYSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        SoftAssert soft = new SoftAssert();

        String expectedResult = "عقد توريد";
        String actualResult =confirmationSignatures.Treatment_label().getText();

        System.out.println(actualResult);
        soft.assertEquals(actualResult.contains(expectedResult),true);
        soft.assertTrue(actualResult.contains(expectedResult),"user clicked on SUPPLY successfully" );
        String expectedResulturl = "http://192.168.1.111:8085/Master.html#/SUPPLY/:6";
        String actualResulturl = Hooks.driver.getCurrentUrl();
        System.out.println(actualResulturl);
        soft.assertTrue(actualResulturl.contains(expectedResulturl),"user clicked on SUPPLY successfully" );

        // Assert All
        soft.assertAll();
    }
}
