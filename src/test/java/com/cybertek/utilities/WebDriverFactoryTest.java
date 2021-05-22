package com.cybertek.utilities;

import org.openqa.selenium.WebDriver;

public class WebDriverFactoryTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("firefox");

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        String title1 = driver.getTitle();
        System.out.println(title1);

        driver.close();
    }
}
