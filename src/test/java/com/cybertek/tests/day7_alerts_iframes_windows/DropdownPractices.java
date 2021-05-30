package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {

    WebDriver driver;

    //    1. Open Chrome browser
    //    2. Go to http://practice.cybertekschool.com/dropdown

    @BeforeClass
    public void setupClass() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void tc1_simple_dropdown_test() {
    //    3. Verify “Simple dropdown” default selected value is correct
    //        Expected: “Please select an option”
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        WebElement currentlySelectedOption = simpleDropdown.getFirstSelectedOption();
        String actualTextOfCurrentOption = currentlySelectedOption.getText();
        String expectedText = "Please select an option";

        Assert.assertTrue(actualTextOfCurrentOption.equals(expectedText));

    //    4. Verify “State selection” default selected value is correct
    //        Expected: “Select a State”

        Select stateSelection = new Select(driver.findElement(By.xpath("//select[@id='state']")));

       // WebElement currentStateSelection = stateSelection.getFirstSelectedOption();
       // String actualStateSelection = currentStateSelection.getText();

        String actualStateSelection = stateSelection.getFirstSelectedOption().getText();
        String expectedStateSelection = "Select a State";

        //Assert.assertTrue(actualStateSelection.equals(expectedStateSelection));
        Assert.assertEquals(actualStateSelection, expectedStateSelection);

    }

    @Test
    public void tc2_state_dropdown_test() {

        // locating state dropdown
        Select stateSelection = new Select(driver.findElement(By.xpath("//select[@id='state']")));

//        3. Select Illinois
        stateSelection.selectByVisibleText("Illinois");

//        4. Select Virginia
        stateSelection.selectByValue("VA");

//        5. Select California
        stateSelection.selectByIndex(5);

//        6. Verify final selected option is California.
        String expectedOptionText = "California";
        String actualOptionText = stateSelection.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText, expectedOptionText, "This message will be printed out if assertions fails");
//        Use all Select options. (visible text, value, index)
    }

    @AfterClass
    public void tearDownClass() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }





}
