package com.cybertek.tests.day6_testng_intro_dropdowns;

import com.cybertek.utilities.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC1_Simple_dropdown {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement correctActual = driver.findElement(By.xpath("(//select[@id='dropdown'])[1]"));
        correctActual.getText();
        String correctExpected = "Please select an option";

        if (correctActual.equals(correctExpected)) {
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }


    }
}



   // TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
    // 1.Open Chrome browser
    // 2.Go to http://practice.cybertekschool.com/dropdown
    // 3.Verify “Simple dropdown” default selected value is correctExpected: “Please select an option”
    // 4.Verify“State selection” default selected value is correctExpected: “Select a State”

