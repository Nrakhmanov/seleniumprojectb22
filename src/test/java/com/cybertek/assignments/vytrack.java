package com.cybertek.assignments;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class vytrack {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://qa3.vytrack.com/user/login");
    }

    @Test
    public void loginMethod() throws InterruptedException {

        WebElement username = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        username.sendKeys("user4");

        WebElement passWord = driver.findElement(By.xpath("//input[@type='password']"));
        passWord.sendKeys("UserUser123" + Keys.ENTER);

        driver.navigate().refresh();

        List<WebElement> activitiesButton = driver.findElements(By.xpath("//span[@class='title title-level-1']"));
        activitiesButton.get(0).click();

        WebElement vehicleButton = driver.findElement(By.xpath("//span[.='Vehicles']"));
        vehicleButton.click();


        WebElement reset = driver.findElement(By.xpath("//i[@class='fa-repeat']"));
        reset.click();
    }
}
