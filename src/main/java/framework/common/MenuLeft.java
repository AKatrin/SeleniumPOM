package framework.common;

import framework.pages.BasePage;
import framework.pages.OrangeHRM.CustomFieldSectionsPage;
import framework.reports.ReportManager;
import framework.utils.CommonActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuLeft extends BasePage {
    @FindBy(xpath = "//li[@id='menu_pim_viewPimModule']/a")
    private WebElement pimOption;
    @FindBy(id = "menu_pim_Configuration")
    private WebElement configurationOption;
    @FindBy(id = "menu_pim_viewCustomFieldSectionList")
    private WebElement customFieldOption;

    private WebElement buttonAddEmploye;

    public MenuLeft clickOnPIMOptionOfLeftMenu() {
        try {
            CommonActions.waitForElementToBeClickable(pimOption);
            CommonActions.click(pimOption);
            ReportManager.getInstance().logPass("click on PIM option");
        } catch (Exception e) {
            ReportManager.getInstance().logTestFailed(e.getMessage());
            throw new RuntimeException(e);
        }
        return this;
    }

    public MenuLeft clickOnConfigurationOption() {
        try {
            CommonActions.click(configurationOption);
            ReportManager.getInstance().logPass("Click on Configuration option");
        } catch (Exception e) {
            ReportManager.getInstance().logTestFailed("It's not possible to click error: " + e.getMessage());
        }
        return this;
    }

    public CustomFieldSectionsPage clickOnCustomField() {
        try {
            CommonActions.click(customFieldOption);
            ReportManager.getInstance().logPass("Click on Custom field option on left menu");
        } catch (Exception e) {
            ReportManager.getInstance().logTestFailed("It's not possible to click error: " + e.getMessage());
        }
        return new CustomFieldSectionsPage();
    }

    public void clickOnButtonAddEmployee() {

    }
}
