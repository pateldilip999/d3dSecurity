package com;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverClass {

   public static WebDriver driver;

    public void openBrowser(){

// open browser

        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();

    }

    public void closeBrowser()

    {

        driver.quit();
    }



}


