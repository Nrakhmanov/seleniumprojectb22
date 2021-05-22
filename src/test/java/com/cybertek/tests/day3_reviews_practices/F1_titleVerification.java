package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F1_titleVerification {
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

        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook - Log In or Sign Up";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }



        driver.close();
    }
}
