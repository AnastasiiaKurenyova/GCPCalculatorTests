package com.epam.ta.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EstimationPage extends AbstractPage {

    public EstimationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

}
