package com.practice.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    public static void loadConfig(){
        try{
            FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
            properties = new Properties();
            properties.load(fis);
        } catch (IOException e){
            throw new RuntimeException("Failed to load config.properties file");
        }
    }

    public static String get(String key){
        if(properties == null){
            loadConfig();
        }
        return properties.getProperty(key);
    }

}
