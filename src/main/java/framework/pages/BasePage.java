package framework.pages;

import framework.manager.DriverManager;
import framework.reports.ReportManager;
import framework.utils.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver driver = DriverManager.getInstance().getWebDriver();

    public BasePage() {
        PageFactory.initElements(driver, this);
    }

    public String getTitle() {
        String title = "";
        try {
            Thread.sleep(10000);
            title = CommonActions.getTitle();
            ReportManager.getInstance().logPass("The title of page is: " + title);
        } catch (Exception e) {
            ReportManager.getInstance().logTestFailed("The title doesn't get " + e.getMessage());
        }
        return title;

    }
}
