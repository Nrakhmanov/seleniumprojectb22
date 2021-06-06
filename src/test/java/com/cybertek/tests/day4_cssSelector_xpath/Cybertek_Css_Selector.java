package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cybertek_Css_Selector {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/forgot_password");

        //WebElement homeLink = driver.findElement(By.cssSelector("a.nav-link"));
        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());

        WebElement forgotPasswordHeader = driver.findElement(By.tagName("h2"));
        System.out.println("forgotPasswordHeader.isDisplayed() = " + forgotPasswordHeader.isDisplayed());

        WebElement emailLabel = driver.findElement(By.cssSelector("label[for='email']"));
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());

        WebElement emailBox = driver.findElement(By.cssSelector("input[name='email']"));
        System.out.println("emailBox.isDisplayed() = " + emailBox.isDisplayed());

        WebElement retrieveButton = driver.findElement(By.cssSelector("button[id='form_submit']"));
        System.out.println("retrieveButton.isDisplayed() = " + retrieveButton.isDisplayed());

        WebElement poweredbyText = driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        System.out.println("poweredbyText.isDisplayed() = " + poweredbyText.isDisplayed());

        driver.close();


    }
}
