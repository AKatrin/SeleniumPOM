package framework.pages.OrangeHRM;

import framework.common.MenuLeft;
import framework.manager.BrowserConfig;
import framework.pages.BasePage;

public class DashboardOrangeHRMPage extends BasePage {
    public MenuLeft menuLeft = new MenuLeft();

    public DashboardOrangeHRMPage goToDashboard() {
        try {
            driver.get(BrowserConfig.getInstance().getDashboard());
            driver.navigate().refresh();
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
        return this;
    }
}
