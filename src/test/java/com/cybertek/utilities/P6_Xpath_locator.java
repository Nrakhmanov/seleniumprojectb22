package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P6_Xpath_locator {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement button1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));

        // locating using text of the button with XPATH
       // WebElement button1 = driver.findElement(By.xpath("//button[.='Button 1']"));

        button1.click();

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));


        String expectedText = "Clicked on button one!";
        String actualText = resultText.getText();



        if(actualText.equals(expectedText)){
            System.out.println("Result test verification PASSED");
        }else{
            System.out.println("Result test verification FAILED");
        }

        driver.close();


    }
}
