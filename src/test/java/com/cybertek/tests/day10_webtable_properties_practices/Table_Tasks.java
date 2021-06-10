package com.cybertek.tests.day10_webtable_properties_practices;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Table_Tasks {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        String browser = ConfigurationReader.getProperty("browser");

        String url = ConfigurationReader.getProperty("dataTablesUrl");

        driver = WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }

    @Test
    public void task3_return_tims_due_amount() {

     //   driver.findElement(By.xpath("//table[@id='table1']//td[.='Tim']/../td[4]"));// first way of locating element
     //   driver.findElement(By.xpath("//table[@id='table1']//td[.='Tim']/following-sibling::td[2]")); // second way of locating same element

        WebElement timsDueAmountCell = driver.findElement(By.xpath("//table[@id='table1']//td[.='Tim']/../td[4]"));
        System.out.println("timsDueAmountCell = " + timsDueAmountCell.getText());

        String actualTimResult = timsDueAmountCell.getText();
        String expectedResult = "$50.00";

        Assert.assertEquals(actualTimResult, expectedResult, "Tim's cell is not returning as expected");

    }
}
