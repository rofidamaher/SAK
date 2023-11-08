package org.example.pages.MainMenu;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Search {

   public WebElement searchIcon()
{
    return Hooks.driver.findElement(By.xpath("//img[@src=\"img/authimg/menuicons/complete_request_menu.png\"]"));
}
    public WebElement searchTitle()
    {
        return Hooks.driver.findElement(By.id("title_services"));
    }

    public WebElement requestNum()
    {
        return Hooks.driver.findElement(By.xpath("//input[@ng-model=\"requestNo\"]"));
    }


    public WebElement searchBun()
    {
        return Hooks.driver.findElement(By.xpath("//a[@ng-click='btnSearch()']"));
    }


    public List<WebElement> tableDataNumList()
    {
        List<WebElement> tableDNList = Hooks.driver.findElements(By.xpath("//tbody//tr//td[@data-title=\"رقم الطلب\"]//a[@class=\"ng-binding\"]"));
        return tableDNList;
    }

}
