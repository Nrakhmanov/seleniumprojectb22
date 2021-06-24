package com.cybertek.tests.day13_actions_pom_design;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionPractices {

    @Test
    public void p2_double_click_test() {

        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        Driver.getDriver().switchTo().frame("iframeResult");

        WebElement textToDoubleClick = Driver.getDriver().findElement(By.id("demo"));

        Actions actions = new Actions(Driver.getDriver());

        BrowserUtils.sleep(2);
        actions.doubleClick(textToDoubleClick);
        actions.perform();

        String expectedInStyle = "red";
        String actual = textToDoubleClick.getAttribute("style");

        Assert.assertTrue(actual.contains(expectedInStyle));
    }
}
