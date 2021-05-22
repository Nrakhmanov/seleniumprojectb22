package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classNamePractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/inputs");
        driver.findElement(By.className("nav-link")).click();

        String expectedTitle = "Practice";

        if(driver.getTitle().equals(expectedTitle)){
            System.out.println("title verification PASSED");
        }else{
            System.out.println("title verification FAILED");
        }

        driver.close();
        }
    }

