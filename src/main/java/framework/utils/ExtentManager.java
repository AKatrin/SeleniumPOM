package framework.utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentManager {


/*
    private static ExtentReports extent;

    public static ExtentReports getReporter(){
        if(extent == null){
            //Set HTML reporting file location
            String workingDir = System.getProperty("user.dir");
            extent = new ExtentReports(workingDir+"\\Reports\\ExtentReportResults.html", true);
        }
        return extent;
    }
*/

    private static ExtentManager instance;
    private ExtentReports report;
    private ExtentTest extentTest;

    private ExtentManager()
    {
        initializeReport("startTest");
    }

    public static ExtentManager getInstance()
    {
        if (instance == null)
        {
            instance = new ExtentManager();
        }
        return instance;
    }

    public void initializeReport(String testName)
    {
        report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
        extentTest = report.startTest(testName);
    }

    public ExtentReports getExtendReport()
    {
        return report;
    }
}
