package org.example.stepDefs.First_Step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.First_Step.P04_DOCUMENTATION_P;
import org.example.pages.First_Step.P07_ConfirmationSignatures;
import org.example.stepDefs.Hooks;
import org.testng.asserts.SoftAssert;


public class D07_ConfirmationSignaturesStepDef {

    P07_ConfirmationSignatures confirmationSignatures = new P07_ConfirmationSignatures();


    @When("user click on AGREEMENT")
    public void userClickOnAGREEMENT() {
        confirmationSignatures.AGREEMENT().click();
        
    }

    @And("user clicked on AGREEMENT successfully")
    public void userClickedOnAGREEMENTSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        SoftAssert soft = new SoftAssert();

        String expectedResult = "عقد إتفاق";
        String actualResult =confirmationSignatures.AGREEMENT_label().getText();

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
}
