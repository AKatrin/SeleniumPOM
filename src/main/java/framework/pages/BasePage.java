package framework.pages;

import com.relevantcodes.extentreports.ExtentReports;
import framework.manager.DriverManager;
import framework.reports.ExtentManager;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver  = DriverManager.getInstance().getWebDriver();
    protected ExtentReports report = ExtentManager.getInstance().getExtendReport();
}
