package org.example.stepDefs.MORTGAGE;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.MORTGAGE.P09_01_MORTGAGE_MARINE_LAND;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class D09_01_MORTGAGE_MARINE_LANDStepDef {
    P09_01_MORTGAGE_MARINE_LAND mortgage = new P09_01_MORTGAGE_MARINE_LAND();

    JavascriptExecutor jse = (JavascriptExecutor) Hooks.driver;

    @When("user click on MORTGAGE_LAND")
    public void userClickOnMORTGAGE_MARINE_LAND() {
        mortgage.MORTGAGE_MARINE_LAND().click();
    }

    @And("user clicked on MORTGAGE_LAND successfully")
    public void userClickedOnMORTGAGE_MARINE_LANDSuccessfully() {

        // Soft Assertion
        SoftAssert soft = new SoftAssert();

        //first Assert
        String expectedResult = "رهن ارض بحرية";
        String actualResult = mortgage.MORTGAGE_MARINE_LAND_label().getText();

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

    @Then("region is {string} and space is {string} and cadastral number is {string}")
    public void regionAndSpaceAndCadastralNumber(String arg0, String arg1, String arg2) throws InterruptedException {
        mortgage.region_number().click();
        Thread.sleep(100);
        mortgage.region_number().sendKeys(arg0);

        Thread.sleep(500);

        mortgage.space_number().click();
        Thread.sleep(100);
        mortgage.space_number().sendKeys(arg1);

        Thread.sleep(500);

        mortgage.cadastral_number().click();
        Thread.sleep(100);
        mortgage.cadastral_number().sendKeys(arg2);
    }


    @When("select MORTGAGE_PERIOD_FROM Y {string} M {string} D {string} MORTGAGE_PERIOD_TO Y {string} M {string} D {string}")
    public void userSelectMORTGAGE_PERIOD_FROMYMDAndMORTGAGE_PERIOD_TOYMD(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) throws InterruptedException {
        Thread.sleep(100);
        mortgage.MORTGAGE_PERIOD_FROM().click();
        Thread.sleep(2000);
        setDateFrom(arg0, arg1, arg2);

        mortgage.MORTGAGE_PERIOD_TO().click();
        Thread.sleep(2000);
        setDateTo(arg3, arg4, arg5);

    }

    public void setDateFrom(String Y, String M, String D) throws InterruptedException {
        Thread.sleep(1000);
        mortgage.datepicker_daysFrom().click();
        Thread.sleep(500);
        mortgage.datepicker_monthsFrom().click();
        Thread.sleep(200);
        WebElement year = Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][1]//div[@class='datepicker-years']//span[text()='"+Y+"']"));
        year.click();
        WebElement Month = Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][1]//div[@class='datepicker-months']//span[text()='"+M+"']"));
        Month.click();
        WebElement Day = Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][1]//div[@class='datepicker-days']//td[text()='"+D+"']"));
        Day.click();
    }

    public void setDateTo(String Y , String M , String D) throws InterruptedException {
        Thread.sleep(1000);
        mortgage.datepicker_daysTo().click();
        Thread.sleep(200);
        mortgage.datepicker_monthsTo().click();
        Thread.sleep(200);
        WebElement year = Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][2]//div[@class='datepicker-years']//span[text()='"+Y+"']"));
        year.click();
        WebElement Month = Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][2]//div[@class='datepicker-months']//span[text()='"+M+"']"));
        Month.click();
        WebElement Day = Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom'][2]//div[@class='datepicker-days']//td[text()='"+D+"']"));
        Day.click();
    }

    @Then("Mortgage value is {string} and Approval letter number is {string}")
    public void MortgageValueAndApprovalLetterNumber(String arg0, String arg1) throws InterruptedException {
        mortgage.MortgageValue().click();
        Thread.sleep(100);
        mortgage.MortgageValue().sendKeys(arg0);

        Thread.sleep(500);
        mortgage.ApprovalLetterNumber().click();
        Thread.sleep(100);
        mortgage.ApprovalLetterNumber().sendKeys(arg1);
    }

    @And("Add Debaga To Table And Add Debaga Request")
    public void AddDebagaToTableAndAddDebagaRequest() throws InterruptedException {
        Thread.sleep(100);
        mortgage.AddDebagaToTable().click();
        Thread.sleep(900);
        mortgage.cboxLoadedContent_ok().click();
        Thread.sleep(500);
        jse.executeScript("arguments[0].scrollIntoView();", mortgage.AddDebagaRequest());
        mortgage.AddDebagaRequest().click();
        Thread.sleep(200);
        mortgage.cboxLoadedContent_ok().click();

    }
}
