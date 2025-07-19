package com.practice.tests;

import com.practice.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = DriverManager.initDriver();
    }

    @AfterClass
    public void tearDown(){
        DriverManager.quitDriver();
    }

}
