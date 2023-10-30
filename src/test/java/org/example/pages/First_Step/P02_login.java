package org.example.pages.First_Step;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
<<<<<<< HEAD
public class P02_login {

=======

public class P02_login {
//    public P02_login()
//    {
//        PageFactory.initElements(Hooks.driver,this);
//    }
>>>>>>> adf37fe (test)
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
//    public WebElement error_message()
//    {
//        return Hooks.driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
//    }

    public WebElement UserName_home()
    {
        return Hooks.driver.findElement(By.id("adminName"));
    }


//    @FindBy(className = "ico-login")
//    public WebElement login_page;
//
//    @FindBy(id = "Email")
//    public WebElement Email;
//
//    @FindBy(id = "Password")
//    public WebElement Password;
//
//    @FindBy(className = "button-1 login-button")
//    public WebElement btn_login;

//    @FindBy(className = "message-error validation-summary-errors")
//    public WebElement error_message;



}
