package com.StudentManagement.utilies;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public abstract class ConfigurationReader {
    private static final Properties properties = new Properties();

    static{

        try {
            System.setProperty("webdriver.http.factory", "jdk-http-client");

            FileInputStream file = new FileInputStream("configuration.properties");

            properties.load(file);

            file.close();


        } catch (IOException e) {
            System.out.println("File not found in the ConfigurationReader class.");
            e.printStackTrace();
        }

    }

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }
}
