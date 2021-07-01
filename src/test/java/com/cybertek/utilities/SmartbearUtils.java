package com.cybertek.utilities;

import com.cybertek.pages.SmartBearLoginPage;
import org.openqa.selenium.WebDriver;

public class SmartbearUtils {

    public static void smartBearLogin(WebDriver driver) {

        SmartBearLoginPage login = new SmartBearLoginPage();

    Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    login.username.sendKeys("Tester");
    login.password.sendKeys("test");
    login.loginButton.click();

    }


}
