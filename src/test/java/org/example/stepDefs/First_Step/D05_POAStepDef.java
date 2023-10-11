package org.example.stepDefs.First_Step;

import io.cucumber.java.en.And;
import org.example.pages.First_Step.P05_POA;
import org.example.stepDefs.Hooks;
import org.testng.asserts.SoftAssert;


public class D05_POAStepDef {

    P05_POA tawkel = new P05_POA();

    @And("user click on POA_SPECIAL")
    public void userClickOnTawkelRasmy() {
        tawkel.Tawkel_rasmy().click();
    }

    @And("user clicked on POA_SPECIAL successfully")
    public void userClickedOnTawkelRasmySuccessfully() {

        // Soft Assertion
        SoftAssert soft = new SoftAssert();
        //first Assert
        String expectedResult = "توكيل خاص";
        String actualResult =tawkel.Tawkel_rasmy_label().getText();

        System.out.println(actualResult);
        soft.assertEquals(actualResult.contains(expectedResult),true);
        soft.assertTrue(actualResult.contains(expectedResult),"user clicked on Tawkel racmy successfully" );

        //Hooks.driver.getCurrentUrl();
        // second Assert

        String expectedResulturl = "http://192.168.1.111:8085/Master.html#/POA_SPECIAL/:45";
        String actualResulturl = Hooks.driver.getCurrentUrl();
        System.out.println(actualResulturl);
        soft.assertTrue(actualResulturl.contains(expectedResulturl),"user clicked on Tawkel racmy successfully" );

        // Assert All
        soft.assertAll();
    }





}
