package org.example.stepDefs.MainMenu;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.MainMenu.PersonalInbox;


public class PersonalInboxStepDef {

    PersonalInbox searchPage = new PersonalInbox();
<<<<<<< HEAD
=======

>>>>>>> adf37fe (test)
    @When("user click on PersonalInbox")
    public void userClickOnPersonalInbox() {
        searchPage.inbox().click();
    }

    @Then("PersonalInbox page open successfully")
    public void personalinboxPageOpenSuccessfully() {
    }

    @And("user enter request num {string} in request field and click on search btn on PersonalInbox page")
    public void userEnterRequestNumInRequestFieldAndClickOnSearchBtnOnPersonalInboxPage(String arg0) {
        
    }

    @Then("user find request successfully in PersonalInbox pag")
    public void userFindRequestSuccessfullyInPersonalInboxPag() {
    }
}
