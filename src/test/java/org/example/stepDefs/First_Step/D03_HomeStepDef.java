package org.example.stepDefs.First_Step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.First_Step.P03_Home;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;


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
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));

        //first Assert
        WebElement docLabel = wait.until(ExpectedConditions.visibilityOf(home.doc_label()));

        String actualResult =docLabel.getText();

        System.out.println(actualResult);
        soft.assertTrue(actualResult.contains("خدمات التوثيق"), "User clicked on documentation successfully");


        //Hooks.driver.getCurrentUrl();
        // second Assert

        String expectedResulturl = "http://192.168.1.111:8085/Master.html#/DOCUMENTATION_P/:12";
        wait.until(ExpectedConditions.urlContains(expectedResulturl));

        String actualResulturl = Hooks.driver.getCurrentUrl();
        System.out.println(actualResulturl);
        soft.assertTrue(actualResulturl.contains(expectedResulturl),"user click on tawsek successful" );

        // Assert All
        soft.assertAll();
    }
}
