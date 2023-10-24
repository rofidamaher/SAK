package org.example.stepDefs.MainMenu;

import io.cucumber.java.en.And;
import org.example.pages.MainMenu.P07_MainMenu;
import org.example.stepDefs.Hooks;

import java.util.concurrent.TimeUnit;


public class D07_MainMenuStepDef {

    P07_MainMenu menu = new P07_MainMenu();

    @And("user open MainMenu")
    public void userOpenMainMenu() {
        Hooks.driver. manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        menu.mainMenu().click();
    }


}
