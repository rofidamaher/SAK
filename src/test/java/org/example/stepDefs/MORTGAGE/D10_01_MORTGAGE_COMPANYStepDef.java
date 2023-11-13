package org.example.stepDefs.MORTGAGE;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.MORTGAGE_COMPANY.P10_01_MORTGAGE_COMPANY;
import org.example.stepDefs.Hooks;
import org.testng.asserts.SoftAssert;

public class D10_01_MORTGAGE_COMPANYStepDef {

    P10_01_MORTGAGE_COMPANY mortgageCompany = new P10_01_MORTGAGE_COMPANY();

    @When("user click on MORTGAGE_COMPANY")
    public void userClickOnMORTGAGE_LAND() {
        mortgageCompany.MORTGAGE_COMPANY().click();
    }

    @And("user clicked on MORTGAGE_COMPANY successfully")
    public void userClickedOnTawkelRasmySuccessfully() {

        // Soft Assertion
        SoftAssert soft = new SoftAssert();

        //first Assert
        String expectedResult = "رهن شركة / مؤسسة";
        String actualResult =mortgageCompany.MORTGAGE_COMPANY_label().getText();

        System.out.println(actualResult);
        soft.assertEquals(actualResult.contains(expectedResult),true);
        soft.assertTrue(actualResult.contains(expectedResult),"user clicked on MORTGAGE_COMPANY successfully" );

        //Hooks.driver.getCurrentUrl();
        // second Assert

        String expectedResulturl = "http://192.168.1.111:8085/Master.html#/MORTGAGE_COMPANY/:15";
        String actualResulturl = Hooks.driver.getCurrentUrl();
        System.out.println(actualResulturl);
        soft.assertTrue(actualResulturl.contains(expectedResulturl),"user clicked on MORTGAGE_COMPANY successfully" );

        // Assert All
        soft.assertAll();
    }
}
