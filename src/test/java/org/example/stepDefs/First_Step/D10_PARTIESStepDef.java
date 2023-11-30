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

    // الولي الطبيعي طرف اول
    @And("book's number is {string} and Book side is {string} for waly and first Party")
    public void bookNumberAndBookSideForWalyForFirstParty(String arg0, String arg1) throws InterruptedException{

        Thread.sleep(200);
        parties.walyNumberBook_FirstParty().click();
        parties.walyNumberBook_FirstParty().sendKeys(arg0);

        Thread.sleep(300);
        parties.walyCoverBook_FirstParty().click();
        parties.walyCoverBook_FirstParty().sendKeys(arg1);
    }

    // الولي الطبيعي طرف ثاني
    @And("book's number is {string} and Book side is {string} for waly and second Party")
    public void bookNumberAndBookSideForWalyForSecondParty(String arg0, String arg1) throws InterruptedException{

        Thread.sleep(200);
        parties.walyNumberBook_SecondParty().click();
        parties.walyNumberBook_SecondParty().sendKeys(arg0);

        Thread.sleep(300);
        parties.walyCoverBook_SecondParty().click();
        parties.walyCoverBook_SecondParty().sendKeys(arg1);
    }

    // وريث طرف اول
    @And("Date of the Deceased is {string} book's number is {string} and Book side is {string} for warith and first Party")
    public void dateOfDeceasedAndBookNumberAndBookSide(String arg0, String arg1, String arg2) throws InterruptedException {
        Thread.sleep(200);
        parties.Date_of_Deceased().click();
        parties.Date_of_Deceased().sendKeys(arg0);

        Thread.sleep(300);
        parties.numberBook_FirstParty().click();
        parties.numberBook_FirstParty().sendKeys(arg1);

        Thread.sleep(300);
        parties.coverBook_for_Deceased_FirstParty().click();
        parties.coverBook_for_Deceased_FirstParty().sendKeys(arg2);
    }
}
