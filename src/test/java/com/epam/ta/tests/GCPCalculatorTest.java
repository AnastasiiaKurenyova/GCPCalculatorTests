package com.epam.ta.tests;

import com.epam.ta.pages.EstimationPage;
import com.epam.ta.pages.CalculatorPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GCPCalculatorTest extends CommonConditions {

    @Test(description = "CalculatorPageTest")
    public void CalculatorPageTest() {
        CalculatorPage calculatorPage = new CalculatorPage(driver)
                .openPage()
                .switchToCalculatorFrame()
                .setInstances(1);
        Assert.assertNotNull(calculatorPage, "Search results are empty");
    }

    @Test(description = "EstimationPageTest")
    public void EstimationPageTest()  {
        EstimationPage estimationPage = new CalculatorPage(driver)
                .openPage()
                .switchToCalculatorFrame()
                .setInstances(1)
                .addToEstimate();
        Assert.assertNotNull(estimationPage, "Search results are empty");
    }

}
