package org.example.stepDefs.MainMenu;

import io.cucumber.java.en.And;
import org.example.pages.MainMenu.MainMenu;
import org.example.stepDefs.Hooks;

import java.util.concurrent.TimeUnit;


public class MainMenuStepDef {

    MainMenu menu = new MainMenu();

    @And("user open MainMenu")
    public void userOpenMainMenu() {
        Hooks.driver. manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        menu.mainMenu().click();
    }


}
