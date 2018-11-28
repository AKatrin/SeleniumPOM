package test;

import framework.reports.ExtentManager;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class TestBase {

    @BeforeMethod
    public void setup (Method method) {
       //  it will be invoked before every test method
       String nameMethod = method.getName();
        ExtentManager.getInstance().startNewTest(nameMethod);
    }

    @AfterClass
    public void tearDown () {
        ExtentManager.getInstance().endCurrentTest();
        ExtentManager.getInstance().flushCurrentTest();
    }

}
