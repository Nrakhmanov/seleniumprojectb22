package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {

    @BeforeClass
    public void setupClass(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

//    1. Open Chrome browser
//    2. Go to http://practice.cybertekschool.com/dropdown
//    3. Verify “Simple dropdown” default selected value is correct
//        Expected: “Please select an option”
//    4. Verify “State selection” default selected value is correct
//        Expected: “Select a State”
}
