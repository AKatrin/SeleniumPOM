package test;

import framework.reports.ReportManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

public class TestBase {

    @BeforeMethod
    public void setup(Method method) {
        String nameMethod = method.getName();
        ReportManager.getInstance().startNewTest(nameMethod);
    }

    @AfterTest
    public void tearDown() {
        ReportManager.getInstance().endCurrentTest();
        ReportManager.getInstance().flushCurrentTest();
    }
}
