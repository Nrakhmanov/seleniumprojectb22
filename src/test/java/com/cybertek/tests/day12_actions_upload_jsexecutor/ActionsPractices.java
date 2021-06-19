package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsPractices {


    @Test
    public void tc15_actions_hover() {

        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");

        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement img3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));


        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));

        // We must create object of Actions class
        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(img1).perform();

        Assert.assertTrue(user1.isDisplayed());

        BrowserUtils.sleep(1);

        actions.moveToElement(img2).perform();

        Assert.assertTrue(user2.isDisplayed());

        BrowserUtils.sleep(1);

        actions.moveToElement(img3).perform();

        Assert.assertTrue(user3.isDisplayed());


        Driver.closeDriver();



    }

    @Test
    public void scrolling_test() {

        Driver.getDriver().get("http://practice.cybertekschool.com/");

        Actions actions = new Actions(Driver.getDriver());

        WebElement cybertekSchoolLink = Driver.getDriver().findElement(By.linkText("Cybertek School"));

        BrowserUtils.sleep(2);
        actions.moveToElement(cybertekSchoolLink).perform();

        BrowserUtils.sleep(2);
        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform();

        //BrowserUtils.sleep(2);
        //actions.sendKeys(Keys.PAGE_UP).perform();


        BrowserUtils.sleep(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        BrowserUtils.sleep(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();



        Driver.closeDriver();

    }
}
