package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertPractices2 {

    WebDriver driver;


    @BeforeMethod
    public void setupMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }

    @Test
    public void JsConfirm(){

        WebElement confirmJSButton = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        confirmJSButton.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        String actualtext = resultText.getText();
        String expectedresult = "You clicked: Ok";

        Assert.assertTrue(resultText.isDisplayed(), "Result text is not displayed");

        Assert.assertEquals(expectedresult, actualtext);


    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}

