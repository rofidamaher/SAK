package org.example.stepDefs.First_Step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.First_Step.P09_MORTGAGE;
import org.example.stepDefs.Hooks;
import org.testng.asserts.SoftAssert;

public class D09_MORTGAGEStepDef {

    P09_MORTGAGE mortgage = new P09_MORTGAGE();

    @When("user click on MORTGAGE_LAND")
    public void userClickOnMORTGAGE_MARINE_LAND() {
        mortgage.MORTGAGE_LAND().click();
    }

    @And("user clicked on MORTGAGE_LAND successfully")
    public void userClickedOnMORTGAGE_MARINE_LANDSuccessfully() {

        // Soft Assertion
        SoftAssert soft = new SoftAssert();

        //first Assert
        String expectedResult = "رهن ارض بحرية";
        String actualResult = mortgage.MORTGAGE_label().getText();

        System.out.println(actualResult);
        soft.assertEquals(actualResult.contains(expectedResult), true);
        soft.assertTrue(actualResult.contains(expectedResult), "user clicked on MORTGAGE_LAND successfully");

        //Hooks.driver.getCurrentUrl();
        // second Assert

        String expectedResulturl = "http://192.168.1.111:8085/Master.html#/MORTGAGE_LAND/:20";
        String actualResulturl = Hooks.driver.getCurrentUrl();
        System.out.println(actualResulturl);
        soft.assertTrue(actualResulturl.contains(expectedResulturl), "user clicked on MORTGAGE_LAND successfully");

        // Assert All
        soft.assertAll();
    }


    @When("user click on MORTGAGE_RE")
    public void userClickOnMORTGAGE_RE() {
        mortgage.MORTGAGE_RE().click();
    }

    @Then("user clicked on MORTGAGE_RE successfully")
    public void userClickedOnMORTGAGE_RESuccessfully() {
        SoftAssert soft = new SoftAssert();
        String expectedResult = "رهن أصول";
        String actualResult = mortgage.MORTGAGE_label().getText();
        System.out.println(actualResult);
        soft.assertEquals(actualResult.contains(expectedResult), true);
        soft.assertTrue(actualResult.contains(expectedResult), "user clicked on MORTGAGE_RE successfully");
        String expectedResulturl = "http://192.168.1.111:8085/Master.html#/MORTGAGE_RE/:95";
        String actualResulturl = Hooks.driver.getCurrentUrl();
        System.out.println(actualResulturl);
        soft.assertTrue(actualResulturl.contains(expectedResulturl), "user clicked on MORTGAGE_RE successfully");


        soft.assertAll();
    }

    @When("user click on MORTGAGE_COMPANY")
    public void userClickOnMORTGAGE_LAND() {
        mortgage.MORTGAGE_COMPANY().click();
    }

    @And("user clicked on MORTGAGE_COMPANY successfully")
    public void userClickedOnTawkelRasmySuccessfully() {

        // Soft Assertion
        SoftAssert soft = new SoftAssert();

        //first Assert
        String expectedResult = "رهن شركة / مؤسسة";
        String actualResult = mortgage.MORTGAGE_label().getText();

        System.out.println(actualResult);
        soft.assertEquals(actualResult.contains(expectedResult), true);
        soft.assertTrue(actualResult.contains(expectedResult), "user clicked on MORTGAGE_COMPANY successfully");

        //Hooks.driver.getCurrentUrl();
        // second Assert

        String expectedResulturl = "http://192.168.1.111:8085/Master.html#/MORTGAGE_COMPANY/:15";
        String actualResulturl = Hooks.driver.getCurrentUrl();
        System.out.println(actualResulturl);
        soft.assertTrue(actualResulturl.contains(expectedResulturl), "user clicked on MORTGAGE_COMPANY successfully");

        // Assert All
        soft.assertAll();
    }

}
