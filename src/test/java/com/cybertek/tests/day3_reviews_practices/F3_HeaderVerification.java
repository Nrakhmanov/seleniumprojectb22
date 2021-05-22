package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F3_HeaderVerification {
    public static void main(String[] args) {

        //setup browser driver
        WebDriverManager.chromedriver().setup();

        //create driver instance and open browser
        WebDriver driver = new ChromeDriver();

        //use the driver. object created to use selenium methods
        //maximaize browser
        driver.manage().window().maximize();

        //Go to facebook web page
        driver.get("https://www.facebook.com");

        WebElement header = driver.findElement(By.className("_8eso")); //alt+ENTER - short cut for auto-generating variable type

        String expectedHeader = "Connect with friends and the world around you on Facebook.";
        String actualHeader = header.getText();

        if(actualHeader.equals(expectedHeader)){
            System.out.println("Header verification PASSED");
        }else{
            System.out.println("Header verification FAILED");
        }

        driver.close();

    }
}
