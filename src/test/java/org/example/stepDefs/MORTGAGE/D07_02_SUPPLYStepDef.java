package org.example.stepDefs.MORTGAGE;

import io.cucumber.java.en.When;
import org.example.pages.MORTGAGE.P07_01_AGREEMENT;
import org.example.pages.MORTGAGE.P07_02_SUPPLY;


public class D07_02_SUPPLYStepDef {

    P07_02_SUPPLY supply = new P07_02_SUPPLY();
    P07_01_AGREEMENT agreement =new P07_01_AGREEMENT();
    D07_01_AGREEMENTStepDef agreementStepDef = new D07_01_AGREEMENTStepDef();
    @When("user enter GOODS_DATA {string} and select CONTRACT_PERIOD_FROM Y {string} M {string} D {string} CONTRACT_PERIOD_TO Y {string} M {string} D {string} and CONTRACT_VALUE {string}")
    public void userEnterGOODS_DATAAndSelectCONTRACT_PERIOD_FROMYMDCONTRACT_PERIOD_TOYMDAndCONTRACT_VALUE(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws InterruptedException {
        Thread.sleep(1000);
        supply.GOODS_DATA().sendKeys(arg0);
        Thread.sleep(100);
        agreement.CONTRACT_PERIOD_FROM().click();
        Thread.sleep(200);
        agreementStepDef.setDateFrom(arg1,arg2,arg3);
        agreement.CONTRACT_PERIOD_TO().click();
        Thread.sleep(200);
        agreementStepDef.setDateTo(arg4,arg5,arg6);
        supply.CONTRACT_VALUE().sendKeys(arg7);

    }

}
