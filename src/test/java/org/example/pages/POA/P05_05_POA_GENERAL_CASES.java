package org.example.pages.POA;

import io.cucumber.java.en.When;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P05_05_POA_GENERAL_CASES {
    public WebElement nav_sample() {
        System.out.println("CASES");

        try {
            return Hooks.driver.findElement(By.xpath("//ul[@class='accordion marginFunctions']/li[4]/a/img"));
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return null; // Return null or handle the exception as needed
        }
    }

    public WebElement simpleTextCheckbox() {
        List<WebElement> checkboxElements = Hooks.driver.findElements(By.xpath("//input[@id='debagaCheckbox']"));

        if (checkboxElements.size() >= 3) {
            // Access the third matching element (index 2, as the list is 0-based)
            WebElement thirdInput = checkboxElements.get(2);

            return thirdInput;
        } else {
            // Handle the case where there are fewer than three matching elements
            System.out.println("There are fewer than three matching elements.");
            return null; // You can return null or handle the exception as needed
        }
    }

    public WebElement inSideQaterRadioBtn() {
        return Hooks.driver.findElement(By.id("1077"));
    }

    public WebElement inputDate() {
        return Hooks.driver.findElement(By.id("4778"));
    }

    public WebElement testDate() {
        System.out.println("test");
        return Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom']//div[@class='datepicker-days']//th[@class='date-switch']"));
    }

    public WebElement testDate2() {
        System.out.println("test");
        return Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom']//div[@class='datepicker-months']//th[@class='date-switch']"));
    }

    public WebElement selectYear() {
        return Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom']//div[@class='datepicker-years']//span[text()='2025']"));
    }

    public WebElement selectMonth() {
        return Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom']//div[@class='datepicker-months']//span[text()='Jul']"));
    }

    public WebElement selectDay() {
        return Hooks.driver.findElement(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-bottom']//div[@class='datepicker-days']//td[text()='16']"));
    }

    public WebElement selectPaymentNav() {
        return Hooks.driver.findElement(By.xpath("//ul[@class='accordion marginFunctions']//li[6][@class='accordion-navigation']//a"));
    }

    public WebElement btnCollection(){
        return Hooks.driver.findElement(By.id("btnCollection"));
    }

    public WebElement yesButton(){
        return Hooks.driver.findElement(By.xpath("//div[@id='cboxContent']//button[@id='yesButton']"));
    }
    }
