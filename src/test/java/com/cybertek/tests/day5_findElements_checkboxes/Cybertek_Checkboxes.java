package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Cybertek_Checkboxes {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/checkboxes");

        //check if checkbox 1 is not selected
        WebElement checkBox1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println(checkBox1.isSelected());


    }
}
