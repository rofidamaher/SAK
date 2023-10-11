package org.example.stepDefs;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;
public class Hooks {
    public static WebDriver driver = null ;

    @Before
    public static void OpenBrowser() {
        // 1- Bridge

//        String chromePath = System.getProperty("user.dir") + "src/main/resources/chromedriver.exe";
//        System.out.println(chromePath);
//        System.setProperty("webdriver.chrome.driver",chromePath);
        System.setProperty("webdriver.chrome.driver","D:\\informatique\\SAK\\code\\Automation pro Test templet\\src\\main\\resources\\chromedriver.exe");

        //2 new object
        ChromeOptions options= new ChromeOptions();
        options.addArguments("-remote-allow-origins=*");
        driver = new ChromeDriver();

        // 3- Configurations
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 4- navigate to url
        driver.navigate().to("http://192.168.1.111:8085/Master.html#/Login");
    }

    @After
    public static void quitDriver () throws InterruptedException
    {
        Thread.sleep(3000);
        driver.quit();
    }

}
