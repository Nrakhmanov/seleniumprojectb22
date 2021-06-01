package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropdownPractices2 {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void TC_SelectDate_dropdown() {

    //Select “December 1st, 1922” and verify it is selected.
    //Select year using : visible text
        Select selectYear = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        selectYear.selectByVisibleText("1922");
        String expectedYear = "1922";
        String actualYear = selectYear.getFirstSelectedOption().getText();
        Assert.assertEquals(actualYear, expectedYear);
    //Select month using : value attribute
        Select selectMonth = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        selectMonth.selectByValue("11");
        String extectedMonth = "December";
        String actualMonth = selectMonth.getFirstSelectedOption().getText();
        Assert.assertEquals(actualMonth, extectedMonth);
    //Select day using : index number
        Select selectDay = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        selectDay.selectByIndex(0);
        String expectedDay = "1";
        String actualDay = selectDay.getFirstSelectedOption().getText();
        Assert.assertEquals(actualDay, expectedDay);

    }

    @Test
    public void TC_Multiple_Select_Dropdown() {

        Select selectMultiple = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));

        List<WebElement> selectList = new ArrayList<>();
        List<String> list = new ArrayList<>();
        selectMultiple.selectByIndex(0);
        selectMultiple.selectByIndex(1);
        selectMultiple.selectByIndex(2);
        selectMultiple.selectByIndex(3);
        selectMultiple.selectByIndex(4);
        selectMultiple.selectByIndex(5);


       selectList = selectMultiple.getAllSelectedOptions();

        for (WebElement each : selectList) {
            System.out.println(each.getText());
        }

        selectMultiple.deselectAll();
    }


    @Test
    public void TC_NonSelect_dropdown(){

        WebElement dropdown = driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        dropdown.click();
        WebElement selection = driver.findElement(By.xpath("//a[.='Facebook']"));
        selection.click();
        String actualTitle = driver.getTitle();

        String expectedtitle = "Facebook - Log In or Sign Up";
        Assert.assertEquals(actualTitle, expectedtitle);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
       // Thread.sleep(3000);
        driver.close();
    }
}
