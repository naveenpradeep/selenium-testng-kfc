package com.practice.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

private static WebDriver driver;

    public static WebDriver initDriver(){
    if(driver==null){
        String browser = ConfigReader.get("browser");

        switch (browser){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            default:
                throw new RuntimeException("Unsupported browser: " + browser);
        }
    }
    return driver;
    }

    public static void quitDriver(){
        if(driver != null){
            driver.quit();
        }
    }



}
