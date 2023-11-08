package org.example.stepDefs.First_Step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.First_Step.P06_SAEL;
import org.example.stepDefs.Hooks;
import org.testng.asserts.SoftAssert;


public class D06_SEALStepDef {

    P06_SAEL sael = new P06_SAEL();


    @When("user click on SALE_COMPANY")
    public void userClickOnSALE_COMPANY() {
        sael.SALE_COMPANY().click();
    }
    @And("user clicked on SALE_COMPANY successfully")
    public void userClickedOnSALE_COMPANYSuccessfully() {
        SoftAssert soft = new SoftAssert();

        String expectedResult = "بيع شركة / مؤسسة";
        String actualResult =sael.SALE_label().getText();

        System.out.println(actualResult);
        soft.assertEquals(actualResult.contains(expectedResult),true);
        soft.assertTrue(actualResult.contains(expectedResult),"user clicked on SALE successfully" );

        String expectedResulturl = "http://192.168.1.111:8085/Master.html#/SALE_COMPANY/:28";
        String actualResulturl = Hooks.driver.getCurrentUrl();
        System.out.println(actualResulturl);
        soft.assertTrue(actualResulturl.contains(expectedResulturl),"user clicked on SALE successfully" );

        soft.assertAll();
    }


    @When("user click on SALE_LAND")
    public void userClickOnSALE_LAND() {
        sael.SALE_LAND().click();
    }
    @And("user clicked on SALE_LAND successfully")
    public void userClickedOnSALE_LANDSuccessfully() {
        SoftAssert soft = new SoftAssert();

        String expectedResult = "بيع ارض بحرية";
        String actualResult =sael.SALE_label().getText();

        System.out.println(actualResult);
        soft.assertEquals(actualResult.contains(expectedResult),true);
        soft.assertTrue(actualResult.contains(expectedResult),"user clicked on SALE LAND successfully" );

        String expectedResulturl = "http://192.168.1.111:8085/Master.html#/SALE_LAND/:25";
        String actualResulturl = Hooks.driver.getCurrentUrl();
        System.out.println(actualResulturl);
        soft.assertTrue(actualResulturl.contains(expectedResulturl),"user clicked on SALE LAND successfully" );

        soft.assertAll();
    }
}
