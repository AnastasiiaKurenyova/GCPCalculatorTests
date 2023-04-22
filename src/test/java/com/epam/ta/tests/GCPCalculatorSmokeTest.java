package com.epam.ta.tests;

import com.epam.ta.pages.CalculatorPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GCPCalculatorSmokeTest extends CommonConditions{

    @Test(description = "CalculatorPageTest")
    public void CalculatorPageTest() {
        CalculatorPage calculatorPage = new CalculatorPage(driver)
                .openPage()
                .switchToCalculatorFrame()
                .setInstances(1);
        Assert.assertNotNull(calculatorPage, "Search results are empty");

    }
}
