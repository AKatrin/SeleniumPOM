package framework.pages.OrangeHRM;

import framework.common.MenuLeft;
import framework.manager.BrowserConfig;
import framework.pages.BasePage;
import framework.reports.ReportManager;
import framework.utils.CommonActions;

public class DashboardOrangeHRMPage extends BasePage {
    public MenuLeft menuLeft = new MenuLeft();

    public String getTitle() {
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            System.out.println(e);
        }
        return driver.getTitle();
    }

    public DashboardOrangeHRMPage goToDashboard() {
        try {
            driver.get(BrowserConfig.getInstance().getDashboard());
            Thread.sleep(5000);
            driver.navigate().refresh();
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
        return this;
    }
}
