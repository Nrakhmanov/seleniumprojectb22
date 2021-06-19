package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadPractice {

    @Test
    public void upload_test() {
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");

        //String path = "C:\\Users\\nurid\\Desktop\\minion.jpg";
        String path = "C:\\Users\\nurid\\Desktop\\HTML Class\\minion.jpg";

        WebElement choosefile = Driver.getDriver().findElement(By.id("file-upload"));

        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));

        BrowserUtils.sleep(3);

        choosefile.sendKeys(path);

        uploadButton.click();


        WebElement fileUploadedMessage = Driver.getDriver().findElement(By.tagName("h3"));

        Assert.assertTrue(fileUploadedMessage.isDisplayed());

        Driver.closeDriver();




    }
}
