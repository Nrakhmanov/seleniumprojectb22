package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Amazon_CSS_Selector {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

        WebElement amazonSearch = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));

        amazonSearch.sendKeys("wooden spoon" + Keys.ENTER);

        String expectedTitle = "Amazon.com : wooden spoon";
        String actualtitle = driver.getTitle();

        if(actualtitle.equals(expectedTitle)){
            System.out.println("title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }

        driver.close();


    }
}
