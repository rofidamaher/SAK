package org.example.pages.MainMenu;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P09_PersonalInbox {

    public WebElement inbox()
    {
        return Hooks.driver.findElement(By.xpath("//img[@src=\"img/authimg/menuicons/email_menu.png\"]"));
    }



}
