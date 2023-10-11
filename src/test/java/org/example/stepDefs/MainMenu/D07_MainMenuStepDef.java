package org.example.stepDefs.MainMenu;

import io.cucumber.java.en.And;
import org.example.pages.MainMenu.P07_MainMenu;
import org.example.stepDefs.Hooks;

import java.util.concurrent.TimeUnit;


public class D07_MainMenuStepDef {

    P07_MainMenu menu = new P07_MainMenu();

    @And("user open MainMenu")
    public void userClickOnDocumentation() {
        Hooks.driver. manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        menu.mainMenu().click();
    }

//    @Then("user clicked on Documentation successfully")
//    public void userClickedOnDocumentationSuccessfully() {
//        // Soft Assertion
//        SoftAssert soft = new SoftAssert();
//        //first Assert
//        String expectedResult = "خدمات التوثيق";
//        String actualResult =home.doc_label().getText();
//
//        System.out.println(actualResult);
//        soft.assertEquals(actualResult.contains(expectedResult),true);
//        soft.assertTrue(actualResult.contains(expectedResult),"user click on tawsek successful" );
//
//        //Hooks.driver.getCurrentUrl();
//        // second Assert
//
//        String expectedResulturl = "http://192.168.1.111:8085/Master.html#/DOCUMENTATION_P/:12";
//        String actualResulturl =Hooks.driver.getCurrentUrl();
//        System.out.println(actualResulturl);
//        soft.assertTrue(actualResulturl.contains(expectedResulturl),"user click on tawsek successful" );
//
//        // Assert All
//        soft.assertAll();
//    }
}
