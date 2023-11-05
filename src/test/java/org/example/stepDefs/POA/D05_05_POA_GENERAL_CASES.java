package org.example.stepDefs.POA;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.POA.P05_01_POA_SPECIAL;
import org.example.pages.POA.P05_05_POA_GENERAL_CASES;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

import static org.example.stepDefs.Hooks.driver;

public class D05_05_POA_GENERAL_CASES {

    P05_05_POA_GENERAL_CASES POAGeneralCases = new P05_05_POA_GENERAL_CASES();

    P05_01_POA_SPECIAL POASpecial = new P05_01_POA_SPECIAL();


    @And("user close the second Party and open the model Nav for CASES")
    public void userCloseTheSecondPartyForPOA_SPECIALAndOpenTheSamplesNavForPOA_SPECIAL() throws InterruptedException {
        Thread.sleep(100);
        POASpecial.nav_Second_Side().click();
        Thread.sleep(100);
        POAGeneralCases.nav_sample().click();
    }

    @When("user chick the fixed text checkbox and click inside the state of qatar radio btn for cases")
    public void userChickTheFixedTextcheckboxAndClickInsideTheStateOfQatarRadioBtn() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Thread.sleep(200);
        POAGeneralCases.simpleTextCheckbox();
//        WebElement checkboxElement = wait.until(ExpectedConditions.elementToBeClickable(POAGeneralCases.simpleTextCheckbox()));

        jse.executeScript("arguments[0].scrollIntoView(true);", POAGeneralCases.simpleTextCheckbox());
        POAGeneralCases.simpleTextCheckbox().click();
        Thread.sleep(200);

        WebElement checkboxElement2 = POAGeneralCases.inSideQaterRadioBtn();
        jse.executeScript("arguments[0].scrollIntoView(true);", checkboxElement2);

        checkboxElement2.click();
//        Thread.sleep(100);
//        POASpecial.inSideQaterRadioBtn().click();

    }

    @And("user insert Date")
    public void userInsertDate() throws InterruptedException {
        WebElement datepicker = POAGeneralCases.inputDate();
        datepicker.click(); // Click on the input field to focus it

        Thread.sleep(200);
        WebElement datepicker2 = POAGeneralCases.testDate();
        datepicker2.click();

        Thread.sleep(200);
        WebElement datepicker3 = POAGeneralCases.testDate2();
        datepicker3.click();

        Thread.sleep(200);
        WebElement datepicker4 = POAGeneralCases.selectYear();
        datepicker4.click();

        Thread.sleep(200);
        WebElement datepicker5 = POAGeneralCases.selectMonth();
        datepicker5.click();

        Thread.sleep(200);
        WebElement datepicker6 = POAGeneralCases.selectDay();
        datepicker6.click();

    }

    @And("user close the the samples Nav and open the fees Nav for cases")
    public void userCloseTheTheSamplesNavForPOA_SPECIALAndOpenTheFeesNavForPOA_SPECIAL() throws InterruptedException {
        Thread.sleep(100);
        POAGeneralCases.selectPaymentNav().click();

    }

    @And("user click btnCollection")
    public void userBtnCollection() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnCollection")));

        element.click();
//        Thread.sleep(2000);
//        while (!isDisplayed(Hooks.driver.findElement(By.id("cboxLoadedContent"))))
//        {
//            Thread.sleep(3000);
//            System.out.println("Element collection is not visible yet");
//        }
        Thread.sleep(500);
        POAGeneralCases.yesButton().click();
    }

    public static boolean isDisplayed(WebElement element) {
        try {
            if(element.isDisplayed())
                return element.isDisplayed();
        }catch (NoSuchElementException ex) {
            return false;
        }
        return false;
    }
}
