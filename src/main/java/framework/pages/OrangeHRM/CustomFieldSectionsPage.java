package framework.pages.OrangeHRM;

import framework.pages.BasePage;
import framework.reports.ReportManager;
import framework.utils.CommonActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomFieldSectionsPage extends BasePage {

    @FindBy(xpath = "//a[starts-with(.,'add')]")
    private WebElement addCustomfieldSectionButton;

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

    public AddCustomFieldSectionModal clickOnAddCustomFieldSectionButton() {
        try {
            CommonActions.waitForElementToBeClickable(addCustomfieldSectionButton);
            CommonActions.click(addCustomfieldSectionButton);
            ReportManager.getInstance().logPass("Click on button to add new custom field section");
        } catch (Exception e) {
            ReportManager.getInstance().logTestFailed("It's not possible to click on button to add custom field section");
        }
        return new AddCustomFieldSectionModal();
    }
}
