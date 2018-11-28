package test;

import framework.reports.ExtentManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    @BeforeClass
    public void setup () {
       //  it will be invoked before every test method
    }

    @AfterClass
    public void tearDown () {
        ExtentManager.getInstance().getExtendReport().flush();
    }

}
