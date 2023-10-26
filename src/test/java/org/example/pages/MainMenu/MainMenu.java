package org.example.pages.MainMenu;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainMenu {

   public WebElement mainMenu()
{
    return Hooks.driver.findElement(By.className("menu-icon"));
}



}
