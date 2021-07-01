package com.cybertek.tasks;

import com.cybertek.pages.SmartBearLoginPage;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.SmartbearUtils;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SmartBear {

    SmartBearLoginPage login = new SmartBearLoginPage();


    @Test
    public void link_verifiction_task1() {

        SmartbearUtils.smartBearLogin(Driver.getDriver());

        List<WebElement> listOfLinks = Driver.getDriver().findElements(By.xpath("//body//a"));

        int count = listOfLinks.size();
        System.out.println("count of links " + count);

        for (WebElement listOfLink : listOfLinks) {
            System.out.println(listOfLink.getText());
        }
    }

    @Test
    public void order_placing_task2() {

     SmartbearUtils.smartBearLogin(Driver.getDriver());

     login.orderButton.click();

     Select product = new Select(Driver.getDriver().findElement(By.xpath("//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']")));

     product.selectByValue("FamilyAlbum");

     login.quantity.sendKeys("2");

     login.calculateButton.click();

     Faker faker = new Faker();


     login.customerName.sendKeys(faker.name().fullName());

     login.customerStreetName.sendKeys(faker.address().streetName());

     login.cityName.sendKeys(faker.address().city());

     login.stateName.sendKeys(faker.address().state());

     login.zipCode.sendKeys(faker.address().zipCode().substring(0,5));

     login.visaCard.click();

     login.cardNumber.sendKeys(faker.number().digits(16));

     login.expDate.sendKeys("02/25");

     login.processButton.click();

     WebElement message = Driver.getDriver().findElement(By.xpath("//strong"));

     System.out.println(message.getText());

     Assert.assertTrue(message.isDisplayed());

    }

    @Test
    public void order_verification_3() {

        SmartbearUtils.smartBearLogin(Driver.getDriver());

        login.verifyAllOrders.click();

        WebElement orderOfSusanMLaren = Driver.getDriver().findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr[6]//td[5]"));

       String actual = orderOfSusanMLaren.getText();
       String expected = "01/05/2010";

       Assert.assertTrue(actual.equals(expected));

    }
   /* @AfterMethod
    public void tearDown() {
        BrowserUtils.sleep(2);
        Driver.closeDriver();
    }

    */
}
