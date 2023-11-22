package org.example.stepDefs.First_Step;

import io.cucumber.java.en.And;
import org.example.pages.First_Step.P10_PARTIES;

public class D10_PARTIESStepDef {

    P10_PARTIES parties = new P10_PARTIES();


    // القيم طرف اول
    @And("book's number is {string} and Book side is {string} for first Party")
    public void bookNumberAndBookSide(String arg0, String arg1) throws InterruptedException{

        Thread.sleep(200);
        parties.numberBook_FirstParty().click();
        parties.numberBook_FirstParty().sendKeys(arg0);

        Thread.sleep(300);
        parties.coverBook_FirstParty().click();
        parties.coverBook_FirstParty().sendKeys(arg1);
    }

    // الوصي طرف تاني
    @And("book's number is {string} and Book side is {string} for second party")
    public void bookNumberAndBookSideForSecondParty(String arg0, String arg1) throws InterruptedException{

        Thread.sleep(200);
        parties.wasyNumberBook_SecondParty().click();
        parties.wasyNumberBook_SecondParty().sendKeys(arg0);

        Thread.sleep(300);
        parties.wasyCoverBook_SecondParty().click();
        parties.wasyCoverBook_SecondParty().sendKeys(arg1);
    }

    // الولي الطبيعي
    @And("book's number is {string} and Book side is {string} for waly and first Party")
    public void bookNumberAndBookSideForWaly(String arg0, String arg1) throws InterruptedException{

        Thread.sleep(200);
        parties.walyNumberBook_FirstParty().click();
        parties.walyNumberBook_FirstParty().sendKeys(arg0);

        Thread.sleep(300);
        parties.walyCoverBook_FirstParty().click();
        parties.walyCoverBook_FirstParty().sendKeys(arg1);
    }

}
