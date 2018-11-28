package framework.reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

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
}
