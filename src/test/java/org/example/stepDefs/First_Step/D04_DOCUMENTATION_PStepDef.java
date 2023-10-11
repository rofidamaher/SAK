package org.example.stepDefs.First_Step;

import io.cucumber.java.en.And;
import org.example.pages.First_Step.P04_DOCUMENTATION_P;
import org.example.stepDefs.Hooks;
import org.testng.asserts.SoftAssert;


public class D04_DOCUMENTATION_PStepDef {

    P04_DOCUMENTATION_P doc = new P04_DOCUMENTATION_P();

    @And("user click on POA")
    public void userClickOnPOA() {
        doc.Tawkel().click();
    }

    @And("user clicked on POA successfully")
    public void userClickedOnPOASuccessfully() {
        // Soft Assertion
        SoftAssert soft = new SoftAssert();
        //first Assert
        String expectedResult = "التوكيلات";
        String actualResult =doc.Tawkel_label().getText();

        System.out.println(actualResult);
        soft.assertEquals(actualResult.contains(expectedResult),true);
        soft.assertTrue(actualResult.contains(expectedResult),"user clicked on Tawkel successfully" );

        //Hooks.driver.getCurrentUrl();
        // second Assert

        String expectedResulturl = "http://192.168.1.111:8085/Master.html#/POA/:16";
        String actualResulturl = Hooks.driver.getCurrentUrl();
        System.out.println(actualResulturl);
        soft.assertTrue(actualResulturl.contains(expectedResulturl),"user clicked on Tawkel successfully" );

        // Assert All
        soft.assertAll();
    }

}
