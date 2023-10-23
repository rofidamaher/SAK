package org.example.stepDefs.First_Step;

import io.cucumber.java.en.And;
import org.example.pages.First_Step.P04_DOCUMENTATION_P;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;


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
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));

        //first Assert
        WebElement tawkelLabel = wait.until(ExpectedConditions.visibilityOf(doc.Tawkel_label()));

        String actualResult =tawkelLabel.getText();

        System.out.println(actualResult);
        soft.assertTrue(actualResult.contains("التوكيلات"), "User clicked on Tawkel successfully");

        // second Assert

        String expectedResulturl = "http://192.168.1.111:8085/Master.html#/POA/:16";

        wait.until(ExpectedConditions.urlContains(expectedResulturl));

        String actualResulturl = Hooks.driver.getCurrentUrl();
        System.out.println(actualResulturl);
        soft.assertTrue(actualResulturl.contains(expectedResulturl),"user clicked on Tawkel successfully" );

        // Assert All
        soft.assertAll();
    }

}
