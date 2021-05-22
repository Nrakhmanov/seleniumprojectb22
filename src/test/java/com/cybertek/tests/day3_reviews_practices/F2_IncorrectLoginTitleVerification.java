package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_IncorrectLoginTitleVerification {
    public static void main(String[] args) throws InterruptedException {

        //setup browser driver
        WebDriverManager.chromedriver().setup();

        //create driver instance and open browser
        WebDriver driver = new ChromeDriver();

        //use the driver. object created to use selenium methods
        //maximaize browser
        driver.manage().window().maximize();

        //Go to facebook web page
        driver.get("https://www.facebook.com");

        WebElement inputUsername = driver.findElement(By.id("email"));
        inputUsername.sendKeys("bambaloo@gmail.com");

        WebElement inputPassword = driver.findElement(By.id("pass"));
        inputPassword.sendKeys("12345" + Keys.ENTER);

        String expectedtitle = "Log into Facebook";
        System.out.println("expectedtitle = " + expectedtitle);

        Thread.sleep(5000);
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        if(actualTitle.equals(expectedtitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }

        driver.close();
    }
}
