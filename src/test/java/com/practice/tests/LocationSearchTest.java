package com.practice.tests;

import org.testng.annotations.Test;

public class LocationSearchTest extends BaseTest {

    @Test
    public void searchNearBy(){
        driver.get("https://restaurants.kfc.co.in/");
    }

}
