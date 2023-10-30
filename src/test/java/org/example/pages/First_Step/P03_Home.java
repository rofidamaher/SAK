package org.example.pages.First_Step;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P03_Home {
<<<<<<< HEAD
=======

>>>>>>> adf37fe (test)
   public WebElement doc()
{
    return Hooks.driver.findElement(By.xpath("//img[@ng-src='img/DOCUMENTATION_P.png']"));
}

    public WebElement doc_label()
    {
        return Hooks.driver.findElement(By.id("liDocumentation"));
    }

<<<<<<< HEAD
    public WebElement CONFIRMATION_SIGNATURES_P()
    {
        return Hooks.driver.findElement(By.xpath("//img[@ng-src='img/CONFIRMATION_SIGNATURES_P.png']"));
    }

    public WebElement con_sig_label()
    {
        return Hooks.driver.findElement(By.id("liConfirmationSignatures"));
    }


=======
>>>>>>> adf37fe (test)
}
