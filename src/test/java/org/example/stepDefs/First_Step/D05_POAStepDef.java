package org.example.stepDefs.First_Step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.First_Step.P05_POA;
import org.example.stepDefs.Hooks;
import org.testng.asserts.SoftAssert;


public class D05_POAStepDef {

    P05_POA poa = new P05_POA();
    @When("user click on POA_SPECIAL")
    public void userClickOnPOA_SPECIAL() {
        poa.POA_SPECIAL().click();
    }

    @When("user click on POA_GENERAL_CASES")
    public void userClickOnPOA_GENERAL_CASES() {
        poa.POA_GENERAL_CASES().click();
    }

    @And("user clicked on POA_SPECIAL successfully")
    public void userClickedOnTawkelRasmySuccessfully() {

        // Soft Assertion
        SoftAssert soft = new SoftAssert();
        //first Assert
        String expectedResult = "توكيل خاص";
        String actualResult =poa.POA_label().getText();

        System.out.println(actualResult);
        soft.assertEquals(actualResult.contains(expectedResult),true);
        soft.assertTrue(actualResult.contains(expectedResult),"user clicked on POA_SPECIAL successfully" );

        //Hooks.driver.getCurrentUrl();
        // second Assert

        String expectedResulturl = "http://192.168.1.111:8085/Master.html#/POA_SPECIAL/:45";
        String actualResulturl = Hooks.driver.getCurrentUrl();
        System.out.println(actualResulturl);
        soft.assertTrue(actualResulturl.contains(expectedResulturl),"user clicked on POA_SPECIAL successfully" );

        // Assert All
        soft.assertAll();
    }

    @And("user clicked on POA_GENERAL_CASES successfully")
    public void userClickedOnTawkelKadayaSuccessfully() {

        // Soft Assertion
        SoftAssert soft = new SoftAssert();
        //first Assert
        String expectedResult = "توكيل عام في القضايا";
        String actualResult =poa.POA_label().getText();

        System.out.println(actualResult);
        soft.assertEquals(actualResult.contains(expectedResult),true);
        soft.assertTrue(actualResult.contains(expectedResult),"user clicked on POA_GENERAL_CASES successfully" );

        //Hooks.driver.getCurrentUrl();
        // second Assert

        String expectedResulturl = "http://192.168.1.111:8085/Master.html#/POA_GENERAL_CASES/:51";
        String actualResulturl = Hooks.driver.getCurrentUrl();
        System.out.println(actualResulturl);
        soft.assertTrue(actualResulturl.contains(expectedResulturl),"user clicked on POA_GENERAL_CASES successfully" );

        // Assert All
        soft.assertAll();
    }

    @When("user click on POA_PARTIAL_STEPPED")
    public void userClickOnPOA_PARTIAL_STEPPED() {
        poa.POA_PARTIAL_STEPPED().click();
    }

    @And("user clicked on POA_PARTIAL_STEPPED successfully")
    public void userClickedOnPOA_PARTIAL_STEPPEDSuccessfully() {

        // Soft Assertion
        SoftAssert soft = new SoftAssert();
        //first Assert
        String expectedResult = "تنحى";
        String actualResult =poa.POA_label().getText();

        System.out.println(actualResult);
        soft.assertEquals(actualResult.contains(expectedResult),true);
        soft.assertTrue(actualResult.contains(expectedResult),"user clicked on POA_PARTIAL_STEPPED successfully" );

        //Hooks.driver.getCurrentUrl();
        // second Assert

        String expectedResulturl = "http://192.168.1.111:8085/Master.html#/POA_PARTIAL_STEPPED/:65";
        String actualResulturl = Hooks.driver.getCurrentUrl();
        System.out.println(actualResulturl);
        soft.assertTrue(actualResulturl.contains(expectedResulturl),"user clicked on POA_PARTIAL_STEPPED successfully" );

        // Assert All
        soft.assertAll();
    }

    @When("user click on POA_TERMINATION")
    public void userClickOnPOA_TERMINATION() throws InterruptedException {
        poa.POA_TERMINATION().click();
        Thread.sleep(200);
    }

    @And("user clicked on POA_TERMINATION successfully")
    public void userClickedOnPOA_TERMINATIONSuccessfully() {
        // Soft Assertion
        SoftAssert soft = new SoftAssert();
        //first Assert
        String expectedResult = "الغاء توكيل";
        String actualResult =poa.POA_label().getText();

        System.out.println(actualResult);
        soft.assertEquals(actualResult.contains(expectedResult),true);
        soft.assertTrue(actualResult.contains(expectedResult),"user clicked on POA_TERMINATION successfully" );

        //Hooks.driver.getCurrentUrl();
        // second Assert

        String expectedResulturl = "http://192.168.1.111:8085/Master.html#/POA_TERMINATION/:61";
        String actualResulturl = Hooks.driver.getCurrentUrl();
        System.out.println(actualResulturl);
        soft.assertTrue(actualResulturl.contains(expectedResulturl),"user clicked on POA_TERMINATION successfully" );

        // Assert All
        soft.assertAll();
    }

    @When("user click on POA_PARTIAL_TERMINATION")
    public void userClickOnPOA_PARTIAL_TERMINATION() throws InterruptedException {
        poa.POA_PARTIAL_TERMINATION().click();
        Thread.sleep(200);
    }

    @And("user clicked on POA_PARTIAL_TERMINATION successfully")
    public void userClickedOnPOA_PARTIAL_TERMINATIONSuccessfully() {
        // Soft Assertion
        SoftAssert soft = new SoftAssert();
        //first Assert
        String expectedResult = "الغاء توكيل جزئى";
        String actualResult =poa.POA_label().getText();

        System.out.println(actualResult);
        soft.assertEquals(actualResult.contains(expectedResult),true);
        soft.assertTrue(actualResult.contains(expectedResult),"user clicked on POA_PARTIAL_TERMINATION successfully" );

        //Hooks.driver.getCurrentUrl();
        // second Assert

        String expectedResulturl = "http://192.168.1.111:8085/Master.html#/POA_PARTIAL_TERMINATION/:64";
        String actualResulturl = Hooks.driver.getCurrentUrl();
        System.out.println(actualResulturl);
        soft.assertTrue(actualResulturl.contains(expectedResulturl),"user clicked on POA_PARTIAL_TERMINATION successfully" );

        // Assert All
        soft.assertAll();
    }
}
