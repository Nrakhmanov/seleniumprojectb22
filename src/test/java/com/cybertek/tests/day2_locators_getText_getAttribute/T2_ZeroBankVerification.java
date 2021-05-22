package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_ZeroBankVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement zeroBankLink = driver.findElement(By.className("brand"));
        //WebElement zeroBankLink = driver.findElement(By.linkText("Zero Bank"));
        //WebElement zeroBankLink = driver.findElement(By.tagName("a"));

        String expectedLinkText = "Zero Bank";

        String actualLinkText = zeroBankLink.getText();

        if (actualLinkText.equals(expectedLinkText)) {
            System.out.println("Link text verification PASSED");
        } else {
            System.out.println("Link text verification FAILED");
        }


        String expectedHrefValue = "index.html";

        String actualHrefValue = zeroBankLink.getAttribute("href");

        if (actualHrefValue.contains(expectedHrefValue)) {
            System.out.println("HREF Attribute value verification PASSED");
        } else {
            System.out.println("HREF Attribute value verification FAILED");
        }

        driver.close();

    }
}
