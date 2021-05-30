package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertsPractices {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        // 1. Open browser
        // 2. Go to website: http://practice.cybertekschool.com/javascript_alerts
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }

    @Test
    public void information_alert_test(){
        // Locating the button for alert to click
        WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));

        // 3. Click to “Click for JS Alert” button
        informationAlertButton.click();

        // Switching driver's focus to alert, so we can handle it
        Alert alert = driver.switchTo().alert();

        // 4. Click to OK button from the alert
        alert.accept();

        // 5. Verify “You successfuly clicked an alert” text is displayed.

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        String actualText = resultText.getText();
        String expectedText = "You successfuly clicked an alert";

        Assert.assertTrue(resultText.isDisplayed(), "Result text is NOT displayed on the page"); //checks if text is displayed

        Assert.assertEquals(actualText, expectedText, "Actual text is not as expected"); // if yes, then it compares if texts are similar
    }
}








