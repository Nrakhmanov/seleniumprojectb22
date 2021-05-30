package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class iframePractice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        // 1. Open browser
        // 2. Go to website: http://practice.cybertekschool.com/iframe
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/iframe");

    }

    @Test
    public void tc4_iframe_practice() {

        // 1 - changing to iframe by index: we pass index number
        //driver.switchTo().frame(0);

        //2 - changing to iframe using WebElement
        // WebElement iframe = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")
        //WebElement iframe = driver.findElement(By.xpath("//iframe[@class='tox-edit-area__iframe']"));
        //driver.switchTo().frame(iframe);

        // 3 - if <iframe> tag has id or name attribute, we can pass its attributes value as a string into
        driver.switchTo().frame("mce_0_ifr");

        //locating web element text
        WebElement yourTextGoesHereText = driver.findElement(By.xpath("//p"));

        // 4. Assert: “Your content goes here.” Text is displayed.
        Assert.assertTrue(yourTextGoesHereText.isDisplayed());

        //locating header
        //driver.switchTo().parentFrame();//switch to upper level (direct parent) frame
        driver.switchTo().defaultContent(); // switch to main <html>
        WebElement headerText = driver.findElement(By.xpath("//h3"));

        // 5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor
        Assert.assertTrue(headerText.isDisplayed());

    }

    @AfterClass
    public void tearDownClass() throws InterruptedException {

        driver.close();
    }
}














