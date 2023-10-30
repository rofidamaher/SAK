package org.example.stepDefs.First_Step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.First_Step.P02_login;
import org.example.stepDefs.Hooks;
import org.testng.asserts.SoftAssert;


public class D02_loginStepDef {

    P02_login login = new P02_login();


//    @Given("user go to login page")
//    public void login_page() throws InterruptedException {
//        login.login_page().click();
//        Thread.sleep(2000);
//    }

    @When("user login with email {string} and password {string}")
    public void userLoginWithEmailAndPassword(String arg0, String arg1) {
        login.UserName().sendKeys(arg0);
        login.Password().sendKeys(arg1);
    }

    @And("user press on login button")
    public void userPressOnLoginButton() throws InterruptedException {
        //login.Password().sendKeys(Keys.ENTER);
        Thread.sleep(300);
        login.btn_login().click();
    }

    @Then("user login to the system successfully by user {string}")
    public void userLoginToTheSystemSuccessfullyByUser(String arg0) throws InterruptedException {

        // Soft Assertion
        SoftAssert soft = new SoftAssert();
        //first Assert
        String actualResult =login.UserName_home().getText();
        System.out.println(actualResult);
        soft.assertEquals(actualResult.contains(arg0),true);
        soft.assertTrue(actualResult.contains(arg0),"user can login successful" );

        //Hooks.driver.getCurrentUrl();
       // second Assert

        String expectedResulturl = "http://192.168.1.111:8085/Master.html#/";
        String actualResulturl = Hooks.driver.getCurrentUrl();
        System.out.println(actualResulturl);
        soft.assertTrue(actualResulturl.contains(expectedResulturl),"user can login successful" );
        Thread.sleep(1000);
        // Assert All
        soft.assertAll();
    }

//    @Then("user could not login to the system by user {string}")
//    public void userLoginToTheSystemSuccessfullyByUser(String arg0) {
//       // Soft Assertion
//        SoftAssert soft = new SoftAssert();
//        //first Assert
//        String expectedResult = "Login was unsuccessful";
//        String actualResult =login.error_message().getText();
//        System.out.println(actualResult);
//        soft.assertEquals(actualResult.contains(expectedResult),true);
//        soft.assertTrue(actualResult.contains(expectedResult),"user can't login " );
////        // second Assert
//
//        String expectedResultcolor = "#e4434b";
//        String actualResultcolor =login.error_message().getCssValue("color");
//        String expectedColor = Color.fromString(actualResultcolor).asHex();
//
//        System.out.println(actualResultcolor);
//        System.out.println(expectedColor);
//        soft.assertTrue(expectedColor.contains(expectedResultcolor));
//
//        // Assert All
//        soft.assertAll();
//    }
//


}
