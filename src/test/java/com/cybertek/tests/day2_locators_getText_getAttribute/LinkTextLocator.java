package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        //driver.findElement(By.linkText("Gmail")).click();

        driver.findElement(By.partialLinkText("mail")).click();


        String expectedInTitle = "Gmail";

        if(driver.getTitle().contains(expectedInTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }

        driver.navigate().back();

        String expectedTitle2 = "Google";

        if(driver.getTitle().equals(expectedTitle2)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }

        driver.close();



    }
}
