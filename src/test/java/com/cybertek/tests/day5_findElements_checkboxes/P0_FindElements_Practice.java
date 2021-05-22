package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P0_FindElements_Practice {
    public static void main(String[] args) {

       WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/forgot_password");

        //body//a --> this locator will return all of the links on the page

        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));

        for (WebElement each : listOfLinks) {

            System.out.println(each.getText());
            System.out.println(each.getAttribute("href"));
            

        }
        //iter + tab --> shortcut foreach loop
        
        int numberOfLinks = listOfLinks.size();
        System.out.println("numberOfLinks = " + numberOfLinks);

        driver.close();





    }
}
