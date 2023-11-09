package org.example.stepDefs.First_Step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.First_Step.P08_AUTH;
import org.example.stepDefs.Hooks;
import org.testng.asserts.SoftAssert;


public class D08_AUTHStepDef {

    P08_AUTH auth = new P08_AUTH();

    @When("user click on CONTRACT_ESTABLISHMENT")
    public void userClickOnCONTRACT_ESTABLISHMENT() {
        auth.CONTRACT_ESTABLISHMENT().click();
    }
    @And("user clicked on CONTRACT_ESTABLISHMENT successfully")
    public void userClickedOnCONTRACT_ESTABLISHMENTSuccessfully() {
     SoftAssert soft = new SoftAssert();

        String expectedResult = "عقد تأسيس";
        String actualResult =auth.AUTH_label().getText();

        System.out.println(actualResult);
        soft.assertEquals(actualResult.contains(expectedResult),true);
        soft.assertTrue(actualResult.contains(expectedResult),"user clicked on CONTRACT_ESTABLISHMENT successfully" );

        String expectedResulturl = "http://192.168.1.111:8085/Master.html#/CONTRACT_ESTABLISHMENT/:36";
        String actualResulturl = Hooks.driver.getCurrentUrl();
        System.out.println(actualResulturl);
        soft.assertTrue(actualResulturl.contains(expectedResulturl),"user clicked on CONTRACT_ESTABLISHMENT successfully" );

        soft.assertAll();
    }


}
