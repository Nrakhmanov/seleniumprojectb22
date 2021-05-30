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

public class WindowHandlePractice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        // 1. Open browser
        // 2. Go to website: http://practice.cybertekschool.com/iframe
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/windows");

    }

    @Test
    public void windowTest() {

        // printing out the window handle of the first page
        // storing first window handle into a String
        String mainHandle = driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);

    //  4. Assert:	Title	is	“Practice”
        String actualTitleBeforeClick = driver.getTitle();
        String expectedTitleBeforeClick = "Practice";

        System.out.println("actualTitleBeforeClick = " + actualTitleBeforeClick);

        Assert.assertEquals(actualTitleBeforeClick, expectedTitleBeforeClick);

    //  5. Click	to:	“Click	Here” text
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();

        for (String eachWindow : driver.getWindowHandles()) {

            driver.switchTo().window(eachWindow);
            System.out.println("CURRENT TITLE WHEN SWITCHING: " + driver.getTitle());

        }



        String actualtitleAfterClick = driver.getTitle();
        System.out.println("actualtitleAfterClick = " + actualtitleAfterClick);

        //  6. Switch	to	new	Window.
    //  7. Assert:	Title	is	“New	Window”
    }

    @AfterClass
    public void tearDownClass() {

        driver.close();
    }
}
