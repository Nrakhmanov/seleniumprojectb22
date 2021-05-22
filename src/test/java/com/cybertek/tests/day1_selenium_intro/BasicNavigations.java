package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        //1 - setup the browser driver
        WebDriverManager.chromedriver().setup();

        //2 - create instance of selenium driver
        //this line opens a browser
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // 3 - get the page
        driver.get("https://www.tesla.com");

        System.out.println("Current title: " + driver.getTitle());
        
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);


        //going back and forward using navigations
        Thread.sleep(3000);//stops code for 3 seconds
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();

        driver.navigate().to("https://www.google.com");

        System.out.println("Current title: " + driver.getTitle());

        currentUrl = driver.getCurrentUrl();

        System.out.println("Current url: " + currentUrl);

        driver.close();



        
        
        

    }
}
