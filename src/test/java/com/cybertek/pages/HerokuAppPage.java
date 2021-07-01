package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HerokuAppPage {

    public HerokuAppPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "hot-spot")
    public WebElement square;


}
