package org.example.stepDefs.First_Step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.First_Step.P03_Home;
import org.example.stepDefs.Hooks;
import org.testng.asserts.SoftAssert;


public class D03_HomeStepDef {

    P03_Home home = new P03_Home();

    @And("user click on Documentation")
    public void userClickOnDocumentation() {
       home.doc().click();
    }

    @Then("user clicked on Documentation successfully")
    public void userClickedOnDocumentationSuccessfully() {
        // Soft Assertion
        SoftAssert soft = new SoftAssert();
        //first Assert
        String expectedResult = "خدمات التوثيق";
        String actualResult =home.doc_label().getText();

        System.out.println(actualResult);
        soft.assertEquals(actualResult.contains(expectedResult),true);
        soft.assertTrue(actualResult.contains(expectedResult),"user click on tawsek successful" );

        //Hooks.driver.getCurrentUrl();
        // second Assert

        String expectedResulturl = "http://192.168.1.111:8085/Master.html#/DOCUMENTATION_P/:12";
        String actualResulturl = Hooks.driver.getCurrentUrl();
        System.out.println(actualResulturl);
        soft.assertTrue(actualResulturl.contains(expectedResulturl),"user click on tawsek successful" );

        // Assert All
        soft.assertAll();
    }

    @And("user click on CONFIRMATION_SIGNATURES_P")
    public void userClickOnConfirmationSignatures() {
        home.CONFIRMATION_SIGNATURES_P().click();
    }

    @Then("user clicked on CONFIRMATION_SIGNATURES_P successfully")
    public void userClickedOnConfirmationSignaturesSuccessfully() {
        SoftAssert soft = new SoftAssert();
        //first Assert
        String expectedResult = "خدمات التصديق";
        String actualResult =home.con_sig_label().getText();

        System.out.println(actualResult);
        soft.assertEquals(actualResult.contains(expectedResult),true);
        soft.assertTrue(actualResult.contains(expectedResult),"user click on ConfirmationSignatures successful" );
        String expectedResulturl = "http://192.168.1.111:8085/Master.html#/CONFIRMATION_SIGNATURES_P/:2";
        String actualResulturl = Hooks.driver.getCurrentUrl();
        System.out.println(actualResulturl);
        soft.assertTrue(actualResulturl.contains(expectedResulturl),"user click on ConfirmationSignatures successful" );

        // Assert All
        soft.assertAll();
    }

}
