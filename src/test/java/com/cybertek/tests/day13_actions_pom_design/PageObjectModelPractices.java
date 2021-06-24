package com.cybertek.tests.day13_actions_pom_design;

import com.cybertek.pages.LibraryLoginPage;
import com.cybertek.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageObjectModelPractices {

@Test
    public void negative_login_to_library() {

    Driver.getDriver().get("https://library2.cybertekschool.com/login.html");

    LibraryLoginPage loginPage = new LibraryLoginPage();

    loginPage.inputEmail.sendKeys("wrong@gmail.com");

    loginPage.inputPassword.sendKeys("abcdef");

    loginPage.signInButton.click();

    Assert.assertTrue(loginPage.invalidEmailFormatError.isDisplayed());

}
}
