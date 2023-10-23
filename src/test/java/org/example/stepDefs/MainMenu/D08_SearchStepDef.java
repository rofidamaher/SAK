package org.example.stepDefs.MainMenu;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.MainMenu.P08_Search;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class D08_SearchStepDef {

    P08_Search searchPage = new P08_Search();

    @When("user click on Search icon")
    public void userClickOnSearchIcon() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        WebElement searchIcon = wait.until(ExpectedConditions.elementToBeClickable(searchPage.searchIcon()));

        searchIcon.click();
    }

    @Then("Search page open successfully")
    public void searchPageOpenSuccessfully() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        WebElement searchTitle = wait.until(ExpectedConditions.visibilityOf(searchPage.searchTitle()));

        //new WebDriverWait(Hooks.driver,Duration.ofSeconds(30));
        // element = WebDriverWait(Hooks.driver, 10).until(EC.element_to_be_clickable((By.ID, "element_id")))
        //implicitlyWait(10, TimeUnit.SECONDS);
        // Soft Assertion
        //first Assert
        String expectedResult = "البحث";
        String actualResult =searchTitle.getText();
        System.out.println(actualResult);

        SoftAssert soft = new SoftAssert();

        soft.assertTrue(actualResult.contains("البحث"), "User opened the Search page successfully");

        // Assert All
        soft.assertAll();
    }

    @And("user enter request num {string} in request field and click on search bun")
    public void userEnterRequestNumInRequestFieldAndClickOnSearchBun(String arg0){
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        WebElement requestNumField = wait.until(ExpectedConditions.elementToBeClickable(searchPage.requestNum()));
        requestNumField.sendKeys(arg0);

        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(searchPage.searchBun()));
        searchButton.click();
    }


    @Then("user find request successfully by searching request num {string}")
    public void userFindRequestSuccessfullyBySearchingRequestNum(String arg0) {

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));

        for (WebElement tableData : searchPage.tableDataNumList()) {
            WebElement tableDataElement = wait.until(ExpectedConditions.visibilityOf(tableData));
            String actualResult =tableDataElement.getText();
            System.out.println(actualResult);
            Assert.assertTrue(actualResult.contains(arg0),"request num has found: " + actualResult);
            //Assert.assertEquals(actualResult.contains(expectedResult),true,"euro symbol is displayed on product :" + i);
        }
    }
}
