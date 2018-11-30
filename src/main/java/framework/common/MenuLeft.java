package framework.common;

import framework.pages.BasePage;
import framework.pages.OrangeHRM.CustomFieldSectionsPage;
import framework.reports.ReportManager;
import framework.utils.CommonActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuLeft extends BasePage {
    @FindBy(id = "menu_pim_viewPimModule")
    private WebElement pimOption;
    @FindBy(id = "menu_pim_Configuration")
    private WebElement configurationOption;
    @FindBy(id = "menu_pim_viewCustomFieldSectionList")
    private WebElement customFieldOption;

    public MenuLeft clickOnPIMOptionOfLeftMenu() {
        try {
            Thread.sleep(10000);
            CommonActions.click(pimOption);
            ReportManager.getInstance().logTestPass("click on PIM option");
        } catch (Exception e) {
            ReportManager.getInstance().logTestFailed(e.getMessage());
        }
        return this;
    }

    public MenuLeft clickOnConfigurationOption() {
        try {
            CommonActions.click(configurationOption);
            ReportManager.getInstance().logTestPass("Click on Configuration option");
        } catch (Exception e) {
            ReportManager.getInstance().logTestFailed("It's not possible to click error: " + e.getMessage());
        }
        return this;
    }

    public CustomFieldSectionsPage clickOnCustomField() {
        try {
            CommonActions.click(customFieldOption);
            ReportManager.getInstance().logTestPass("Click on Custom field option on left menu");
        } catch (Exception e) {
            ReportManager.getInstance().logTestFailed("It's not possible to click error: " + e.getMessage());
        }
        return new CustomFieldSectionsPage();
    }
}
