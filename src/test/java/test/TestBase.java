package test;

import com.github.mirreck.FakeFactory;
import framework.pages.OrangeHRM.DashboardOrangeHRMPage;
import framework.reports.ReportManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;

public class TestBase extends LoginTest {
    private FakeFactory fakeFactory= new FakeFactory();
    protected String digits = fakeFactory.digits(3);
    @BeforeMethod
    public void setup(Method method) {
        String nameMethod = method.getName();
        ReportManager.getInstance().startNewTest(nameMethod);
    }

    @AfterMethod
    public void tearDown() {
        ReportManager.getInstance().endCurrentTest();
        ReportManager.getInstance().flushCurrentTest();
        DashboardOrangeHRMPage dashboardOrangeHRMPage = new DashboardOrangeHRMPage();
        dashboardOrangeHRMPage.goToDashboard();
    }
}
