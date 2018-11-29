package test;

import framework.reports.ReportManager;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class TestBase {

    @BeforeMethod
    public void setup (Method method) {
       //  it will be invoked before every test method
       String nameMethod = method.getName();
        ReportManager.getInstance().startNewTest(nameMethod);
    }

    @AfterTest
    public void tearDown () {
        ReportManager.getInstance().endCurrentTest();
        ReportManager.getInstance().flushCurrentTest();
    }
}
