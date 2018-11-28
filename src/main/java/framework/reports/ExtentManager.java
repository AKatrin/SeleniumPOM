package framework.reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentManager {
    private static ExtentManager instance;
    private ExtentReports report;
    private ExtentTest extentTest;

    private ExtentManager()
    {
        initializeReport();
    }

    public static ExtentManager getInstance()
    {
        if (instance == null)
        {
            instance = new ExtentManager();
        }
        return instance;
    }

    public void initializeReport()
    {
        String path = System.getProperty("user.dir");
        report = new ExtentReports(path +"\\ExtentReportResults.html");
    }

    public ExtentReports getExtendReport()
    {
        return report;
    }

    public ExtentTest getExtentTest() {
        return extentTest;
    }

    public void startNewTest(String nameTest) {
        extentTest = report.startTest(nameTest);
    }

    public void endCurrentTest() {
        report.endTest(extentTest);
    }

    public void flushCurrentTest() {
        report.flush();
    }

    public void logTestPass(String description) {
        extentTest.log(LogStatus.PASS, description);
    }

    public void logTestFailed(String description) {
        extentTest.log(LogStatus.FAIL, description);
    }
}
