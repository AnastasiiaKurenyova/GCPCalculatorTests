package com.epam.ta.pages;

import com.epam.ta.service.TestDataReader;
import com.epam.ta.waiters.WaitersHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CalculatorPage extends AbstractPage{

    private final Logger logger = LogManager.getRootLogger();

    @FindBy(xpath = "//label[contains(text(),'Number of instances')]/following-sibling::input")
    private WebElement numberOfInstancesInput;

    @FindBy(xpath = "//*[@class='layout-align-end-start layout-row']/button")
    private WebElement addToEstimateButton;

    public CalculatorPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public CalculatorPage openPage() {
        driver.get(TestDataReader.getTestData(HOMEPAGE_URL));
        return this;
    }

    public CalculatorPage switchToCalculatorFrame() {
        driver.switchTo().frame(0).switchTo().frame(0);
        return this;
    }

    public CalculatorPage setInstances(int instances) {
        WaitersHelper.waitForVisibilityOf(driver,numberOfInstancesInput)
                .sendKeys(Integer.toString(instances));
        WaitersHelper.waitForVisibilityOf(driver,addToEstimateButton);
        logger.info("Added " + instances + " instances to Number of Instances");
        return this;
    }

    public EstimationPage addToEstimate() {
        WaitersHelper.waitForVisibilityOf(driver,addToEstimateButton).click();
        return new EstimationPage(driver);
    }

}
