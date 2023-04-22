package com.epam.ta.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


import static com.epam.ta.utils.SaveScreenshot.saveScreenshot;


public class TestListeners implements ITestListener {

    private final Logger logger = LogManager.getRootLogger();

    @Override
    public void onTestStart(ITestResult result) {
        logger.info("Test execution start: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        logger.info("Test executed successfully: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        saveScreenshot();
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }


}
