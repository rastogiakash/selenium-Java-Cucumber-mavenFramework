package com.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.automation.utils.ConfigUtils.getPropertyByKey;
import static com.automation.utils.ConfigUtils.loadProperties;

/**
 * Author : Akash Rastogi
 * DriverUtils: Utility methods for invoking webdriver instance and performing operations on selenium webdriver
 * Available Utils : initDiver(), getDriver(), tearDown()
 */
public class DriverUtils {
    static WebDriver driver;

    public static void initDriver() {
        loadProperties();
        //System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //driver = new ChromeDriver();
        
        System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(getPropertyByKey("application.url"));
    }



    public static WebDriver getDriver() {

        if (driver == null ) {
            initDriver();
        }
        return driver;
    }

    public static void tearDown() {
        driver.quit();
        driver = null;
    }
}
