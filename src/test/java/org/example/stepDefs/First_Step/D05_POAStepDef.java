package org.example.stepDefs.First_Step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.First_Step.P05_POA;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;


public class D05_POAStepDef {

    P05_POA poa = new P05_POA();

    @When("user click on POA_SPECIAL")
    public void userClickOnPOA_SPECIAL() {
        poa.POA_SPECIAL().click();
    }

    @And("user clicked on POA_SPECIAL successfully")
    public void userClickedOnTawkelRasmySuccessfully() {

        // Soft Assertion
        SoftAssert soft = new SoftAssert();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));

        //first Assert
        WebElement tawkelLabel = wait.until(ExpectedConditions.visibilityOf(poa.POA_label()));

        String actualResult =tawkelLabel.getText();
        System.out.println(actualResult);

        soft.assertTrue(actualResult.contains("توكيل خاص"), "User clicked on POA_SPECIAL successfully");


        //Hooks.driver.getCurrentUrl();
        // second Assert

        String expectedResulturl = "http://192.168.1.111:8085/Master.html#/POA_SPECIAL/:45";
        wait.until(ExpectedConditions.urlContains(expectedResulturl));

        String actualResulturl = Hooks.driver.getCurrentUrl();
        System.out.println(actualResulturl);
        soft.assertTrue(actualResulturl.contains(expectedResulturl),"user clicked on POA_SPECIAL successfully" );

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
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));

        //first Assert
        WebElement poaLabel = wait.until(ExpectedConditions.visibilityOf(poa.POA_label()));

        String expectedResult = "تنحى";
        String actualResult =poaLabel.getText();
        System.out.println(actualResult);

        soft.assertTrue(actualResult.contains("تنحى"), "User clicked on POA_PARTIAL_STEPPED successfully");

        //Hooks.driver.getCurrentUrl();
        // second Assert

        String expectedResulturl = "http://192.168.1.111:8085/Master.html#/POA_PARTIAL_STEPPED/:65";
        wait.until(ExpectedConditions.urlContains(expectedResulturl));

        String actualResulturl = Hooks.driver.getCurrentUrl();
        System.out.println(actualResulturl);
        soft.assertTrue(actualResulturl.contains(expectedResulturl),"user clicked on POA_PARTIAL_STEPPED successfully" );

        // Assert All
        soft.assertAll();
    }

    @When("user click on POA_TERMINATION")
    public void userClickOnPOA_TERMINATION() {
        poa.POA_TERMINATION().click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(poa.POA_TERMINATION()));
    }

    @And("user clicked on POA_TERMINATION successfully")
    public void userClickedOnPOA_TERMINATIONSuccessfully() {
        // Soft Assertion
        SoftAssert soft = new SoftAssert();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));

        //first Assert
        WebElement poaLabel = wait.until(ExpectedConditions.visibilityOf(poa.POA_label()));

        String expectedResult = "الغاء توكيل";
        String actualResult =poaLabel.getText();
        System.out.println(actualResult);

        soft.assertTrue(actualResult.contains("الغاء توكيل"), "User clicked on POA_TERMINATION successfully");

        //Hooks.driver.getCurrentUrl();
        // second Assert

        String expectedResulturl = "http://192.168.1.111:8085/Master.html#/POA_TERMINATION/:61";
        wait.until(ExpectedConditions.urlContains(expectedResulturl));

        String actualResulturl = Hooks.driver.getCurrentUrl();
        System.out.println(actualResulturl);

        soft.assertTrue(actualResulturl.contains(expectedResulturl),"user clicked on POA_TERMINATION successfully" );

        // Assert All
        soft.assertAll();
    }

    @When("user click on POA_PARTIAL_TERMINATION")
    public void userClickOnPOA_PARTIAL_TERMINATION(){
        poa.POA_PARTIAL_TERMINATION().click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(poa.POA_PARTIAL_TERMINATION()));
    }

    @And("user clicked on POA_PARTIAL_TERMINATION successfully")
    public void userClickedOnPOA_PARTIAL_TERMINATIONSuccessfully() {
        // Soft Assertion
        SoftAssert soft = new SoftAssert();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));

        //first Assert
        WebElement poaLabel = wait.until(ExpectedConditions.visibilityOf(poa.POA_label()));

        String expectedResult = "الغاء توكيل جزئى";
        String actualResult =poaLabel.getText();
        System.out.println(actualResult);

        soft.assertTrue(actualResult.contains("الغاء توكيل جزئى"), "User clicked on POA_PARTIAL_TERMINATION successfully");

        //Hooks.driver.getCurrentUrl();
        // second Assert

        String expectedResulturl = "http://192.168.1.111:8085/Master.html#/POA_PARTIAL_TERMINATION/:64";
        wait.until(ExpectedConditions.urlContains(expectedResulturl));

        String actualResulturl = Hooks.driver.getCurrentUrl();
        System.out.println(actualResulturl);

        soft.assertTrue(actualResulturl.contains(expectedResulturl),"user clicked on POA_PARTIAL_TERMINATION successfully" );

        // Assert All
        soft.assertAll();
    }
}
