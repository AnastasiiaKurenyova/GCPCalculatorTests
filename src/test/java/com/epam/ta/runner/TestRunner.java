package com.epam.ta.runner;

import com.epam.ta.utils.TestListeners;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestRunner {

    public static void main(String[] args) {

        TestNG tng = new TestNG();

        XmlSuite suite = new XmlSuite();
        suite.setSuiteFiles(Arrays.asList("./src/test/resources/testng-parallel.xml"));

        suite.setParallel(XmlSuite.ParallelMode.METHODS);
        suite.setThreadCount(2);

        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite);

        tng.setXmlSuites(suites);
        tng.addListener(new TestListeners());

        tng.run();
    }
}
