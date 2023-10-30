package org.example.stepDefs.First_Step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.First_Step.P04_DOCUMENTATION_P;
import org.example.stepDefs.Hooks;
import org.testng.asserts.SoftAssert;


public class D04_DOCUMENTATION_PStepDef {

    P04_DOCUMENTATION_P doc = new P04_DOCUMENTATION_P();
<<<<<<< HEAD
=======

>>>>>>> adf37fe (test)
    @When("user click on POA")
    public void userClickOnPOA() {
        doc.POA().click();
    }

    @And("user clicked on POA successfully")
    public void userClickedOnPOASuccessfully() {
        // Soft Assertion
        SoftAssert soft = new SoftAssert();
        //first Assert
        String expectedResult = "التوكيلات";
        String actualResult =doc.POA_label().getText();

        System.out.println(actualResult);
        soft.assertEquals(actualResult.contains(expectedResult),true);
        soft.assertTrue(actualResult.contains(expectedResult),"user clicked on POA successfully" );

        //Hooks.driver.getCurrentUrl();
        // second Assert

        String expectedResulturl = "http://192.168.1.111:8085/Master.html#/POA/:16";
        String actualResulturl = Hooks.driver.getCurrentUrl();
        System.out.println(actualResulturl);
        soft.assertTrue(actualResulturl.contains(expectedResulturl),"user clicked on POA successfully" );

        // Assert All
        soft.assertAll();
    }


    @When("user click on SAlE")
    public void userClickOnSAlE() {
        doc.SALE().click();

    }

    @And("user clicked on SAlE successfully")
    public void userClickedOnSAlESuccessfully() {
        SoftAssert soft = new SoftAssert();
        String expectedResult = "البيع";
        String actualResult =doc.SALE_label().getText();

        System.out.println(actualResult);
        soft.assertEquals(actualResult.contains(expectedResult),true);
        soft.assertTrue(actualResult.contains(expectedResult),"user clicked on SAlE successfully" );
        String expectedResulturl = "http://192.168.1.111:8085/Master.html#/SALE/:15";
        String actualResulturl = Hooks.driver.getCurrentUrl();
        System.out.println(actualResulturl);
        soft.assertTrue(actualResulturl.contains(expectedResulturl),"user clicked on SAlE successfully" );

        soft.assertAll();
    }
}
