package test;

import framework.pages.OrangeHRM.DashboardOrangeHRMPage;
import framework.reports.ReportManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

public class TestBase extends LoginTest {

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
