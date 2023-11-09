package org.example.stepDefs.ConfirmationSignatures;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.ConfirmationSignatures.P07_01_AGREEMENT;
import org.example.pages.ConfirmationSignatures.P07_02_SUPPLY;
import org.example.pages.POA.P05_01_POA_SPECIAL;
import org.example.pages.SALE.P06_02_SALE_LAND;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


public class D07_02_SUPPLYStepDef {

    P07_02_SUPPLY supply = new P07_02_SUPPLY();
    P07_01_AGREEMENT agreement =new P07_01_AGREEMENT();
    D07_01_AGREEMENTStepDef agreementStepDef = new D07_01_AGREEMENTStepDef();
    @When("user enter GOODS_DATA {string} and select CONTRACT_PERIOD_FROM Y {string} M {string} D {string} CONTRACT_PERIOD_TO Y {string} M {string} D {string} and CONTRACT_VALUE {string}")
    public void userEnterGOODS_DATAAndSelectCONTRACT_PERIOD_FROMYMDCONTRACT_PERIOD_TOYMDAndCONTRACT_VALUE(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws InterruptedException {
        Thread.sleep(10000);
        supply.GOODS_DATA().sendKeys(arg0);
        Thread.sleep(100);
        agreement.CONTRACT_PERIOD_FROM().click();
        Thread.sleep(2000);
        setDateID3(arg1,arg2,arg3);
        agreement.CONTRACT_PERIOD_TO().click();
        Thread.sleep(2000);
        agreementStepDef.setDateID4(arg4,arg5,arg6);
        supply.CONTRACT_VALUE().sendKeys(arg7);

    }
    public void setDateID3(String Y , String M , String D) throws InterruptedException {
        Thread.sleep(1000);
        supply.datepicker_daysID3().click();
        Thread.sleep(500);
        supply.datepicker_monthsID3().click();
        Thread.sleep(200);
        WebElement year = Hooks.driver.findElement(By.xpath("//div[@id='datepicker_3']//div[@class='datepicker-years']//span[text()='"+Y+"']"));
        year.click();
        WebElement Month = Hooks.driver.findElement(By.xpath("//div[@id='datepicker_3']//div[@class='datepicker-months']//span[text()='"+M+"']"));
        Month.click();
        WebElement Day = Hooks.driver.findElement(By.xpath("//div[@id='datepicker_3']//div[@class='datepicker-days']//td[text()='"+D+"']"));
        Day.click();
    }

}
