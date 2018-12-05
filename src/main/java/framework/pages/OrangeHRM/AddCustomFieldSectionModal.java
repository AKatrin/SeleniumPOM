package framework.pages.OrangeHRM;

import framework.pages.BasePage;
import framework.reports.ReportManager;
import framework.utils.CommonActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCustomFieldSectionModal extends BasePage {

    @FindBy(id = "display_name")
    private WebElement inputHeading;

    public AddCustomFieldSectionModal setHeadingForCustomFieldSection(String heading) {
        try {
            CommonActions.waitForElementToBeClickable(inputHeading);
            CommonActions.setText(inputHeading, heading);
            ReportManager.getInstance().logPass("Set heading on input with: " + heading);
        } catch (Exception e) {
            ReportManager.getInstance().logTestFailed("It's not possible set the heading");
        }
        return this;
    }
}
