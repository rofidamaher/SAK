package org.example.stepDefs.PARTIES;

import io.cucumber.java.en.And;
import org.example.pages.PARTIES.P10_01_PARTIES;

public class D10_01_PARTIESStepDef {

    P10_01_PARTIES parties = new P10_01_PARTIES();


    @And("book's number is {string} and Book side is {string}")
    public void bookNumberAndBookSide(String arg0, String arg1) throws InterruptedException{

        Thread.sleep(200);
        parties.Raqm_FirstParty().click();
        parties.Raqm_FirstParty().sendKeys(arg0);

        Thread.sleep(300);
        parties.Year_FirstParty().click();
        parties.Year_FirstParty().sendKeys(arg1);
    }

    @And("book's number is {string} and Book side is {string} for second party")
    public void bookNumberAndBookSideForSecondParty(String arg0, String arg1) throws InterruptedException{

        Thread.sleep(200);
        parties.Raqm_SecondParty().click();
        parties.Raqm_SecondParty().sendKeys(arg0);

        Thread.sleep(300);
        parties.Year_SecondParty().click();
        parties.Year_SecondParty().sendKeys(arg1);
    }
}
