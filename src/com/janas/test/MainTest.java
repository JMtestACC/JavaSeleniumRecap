package com.janas.test;

import config.PropertiesFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
* Description: Example test for opening and closing different browsers.
* User need specify which browser should be used.
* @author JanAs
* @date 11.11.2019
*/

public class MainTest {

    public static String browser;
    static WebDriver driver;
    static String projectLocation = System.getProperty("user.dir");

    public static void main(String[] args) {
//        setBrowser();
        PropertiesFile.readPropertiesFile();
        setBrowserConfig();
        runtTest();
        PropertiesFile.writePropertiesFile();
    }

//    public static void setBrowser() {
//        browser = "Firefox";
//    }

    public static void setBrowserConfig() {

        // this condition block sets config for firefox browser
        if(browser.contains("Firefox")) {
            System.setProperty("webdriver.gecko.driver", projectLocation+"\\lib\\geckodriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        }

        // this condition block sets config for chrome browser
        if(browser.contains("Chrome")) {
            System.setProperty("webdriver.chrome.driver", projectLocation+"\\lib\\chromedriver\\chromedriver.exe");
            driver = new ChromeDriver();
        }
    }

    public static void runtTest() {
        driver.get("https://www.seleniumhq.org/");
        driver.quit();
    }
};

