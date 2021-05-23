package com.cybertek.tests.day6_testng_intro_dropdowns;

import com.cybertek.utilities.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P03_Apple_Task {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.apple.com");

        // storing 9 web elements including "apple' logo and search box
        List<WebElement> headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));

        for (int eachLink = 1; eachLink < headerLinks.size()-1; eachLink++) {

            //System.out.println(headerLinks.get(eachLink).getText());

            headerLinks.get(eachLink).click();
            Thread.sleep(1000);

            headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));

            System.out.println("Current title in the page: " + driver.getTitle());

            List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));

            System.out.println("Total number of links in current page: " + allLinks.size());

            int linksWithNoText = 0;
            int linksWithText = 0;

            for (WebElement each : allLinks) {
                if(each.getText().isEmpty()){
                    linksWithNoText++;
                }else{
                    linksWithText++;
                }

            }
            System.out.println("--> Current page links with no text : " + linksWithNoText);
            System.out.println("--> Current page links with text : " + linksWithText);

            headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));
        }

        driver.close();

    }
}
