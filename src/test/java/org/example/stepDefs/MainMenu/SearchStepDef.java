package org.example.stepDefs.MainMenu;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.MainMenu.Search;
import org.example.stepDefs.Hooks;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;


public class SearchStepDef {

    Search searchPage = new Search();
<<<<<<< HEAD
=======

>>>>>>> adf37fe (test)
    @When("user click on Search icon")
    public void userClickOnSearchIcon() {
        Hooks.driver. manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        searchPage.searchIcon().click();
    }

    @Then("Search page open successfully")
    public void searchPageOpenSuccessfully() throws InterruptedException {
       Hooks.driver. manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        //new WebDriverWait(Hooks.driver,Duration.ofSeconds(30));
       // element = WebDriverWait(Hooks.driver, 10).until(EC.element_to_be_clickable((By.ID, "element_id")))
        //implicitlyWait(10, TimeUnit.SECONDS);
       // Soft Assertion
        SoftAssert soft = new SoftAssert();
        //first Assert
        String expectedResult = "البحث";
        String actualResult =searchPage.searchTitle().getText();

        System.out.println(actualResult);
        soft.assertEquals(actualResult.contains(expectedResult),true);
        soft.assertTrue(actualResult.contains(expectedResult),"user open Search page" );
        // Assert All
        soft.assertAll();
    }

    @And("user enter request num {string} in request field and click on search bun")
    public void userEnterRequestNumInRequestFieldAndClickOnSearchBun(String arg0) throws InterruptedException {
        Thread.sleep(200);
    searchPage.requestNum().sendKeys(arg0);
    Thread.sleep(200);
    searchPage.searchBun().click();
    }


    @Then("user find request successfully by searching request num {string}")
    public void userFindRequestSuccessfullyBySearchingRequestNum(String arg0) {

        Hooks.driver. manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        for (int i = 0; i < searchPage.tableDataNumList().size() ; i++) {
            String actualResult =searchPage.tableDataNumList().get(i).getText();
            System.out.println(actualResult);
            Assert.assertTrue(actualResult.contains(arg0),"request num has found" + i);
            //Assert.assertEquals(actualResult.contains(expectedResult),true,"euro symbol is displayed on product :" + i);

        }
    }
}
