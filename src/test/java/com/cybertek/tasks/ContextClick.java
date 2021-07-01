package com.cybertek.tasks;

import com.cybertek.pages.HerokuAppPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ContextClick {

    @Test
    public void context_click_test() {
        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");

        HerokuAppPage herokuAppPage = new HerokuAppPage();

        Actions actions = new Actions(Driver.getDriver());

        actions.contextClick(herokuAppPage.square).perform();

        BrowserUtils.sleep(2);
        Driver.getDriver().switchTo().alert().accept();


    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }
}
