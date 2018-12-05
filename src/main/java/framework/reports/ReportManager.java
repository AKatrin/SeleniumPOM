package framework.reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportManager {
    private static ReportManager instance;
    private ExtentReports report;
    private ExtentTest extentTest;

    private ReportManager() {
        initializeReport();
    }

    public static ReportManager getInstance() {
        if (instance == null) {
            instance = new ReportManager();
        }
        return instance;
    }

    public void initializeReport() {
        String path = System.getProperty("user.dir");
        report = new ExtentReports(path + "\\ExtentReportResults.html");
    }

    public ExtentReports getExtendReport() {
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

    public void logPass(String description) {
        extentTest.log(LogStatus.PASS, description);
    }

    public void logTestFailed(String description) {
        extentTest.log(LogStatus.FAIL, description);
    }
}
