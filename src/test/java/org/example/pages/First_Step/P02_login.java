package org.example.pages.First_Step;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class P02_login {


   public WebElement UserName()
{
    return Hooks.driver.findElement(By.id("tb_UserName"));
}

    public WebElement Password()
    {
        return Hooks.driver.findElement(By.id("tb_Password"));
    }
    public WebElement btn_login()
    {
        return Hooks.driver.findElement(By.id("btnSignIn"));
    }

    public WebElement UserName_home()
    {
        return Hooks.driver.findElement(By.id("adminName"));
    }
}

