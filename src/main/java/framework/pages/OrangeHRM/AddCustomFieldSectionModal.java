package framework.pages.OrangeHRM;

import framework.pages.BasePage;
import framework.reports.ReportManager;
import framework.utils.CommonActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddCustomFieldSectionModal extends BasePage {

    @FindBy(id = "display_name")
    private WebElement inputHeading;
    @FindBy(xpath = "//div[@id='custom_field_screen_id_inputfileddiv']//input[@class='select-dropdown']")
    private WebElement screenInput;
    @FindBy(xpath = "//li[ancestor-or-self::div[@id='custom_field_screen_id_inputfileddiv']]//span")
    private List<WebElement> screenOptions; //WebElement screenOption;
    @FindBy(xpath = "//div[@id='modal1']//a[text()='Save']")
    private WebElement saveButton;

    //private List<WebElement> screenOptions;
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

    public AddCustomFieldSectionModal selectAnOptionForScreen(String optionNumber) {
        try {
            CommonActions.waitForElementToBeClickable(screenInput);
            CommonActions.click(screenInput);
            if (screenOptions.size() > 1) {
                for (int i = 1; i<= screenOptions.size(); i++) {
                   String screenSelectedText = screenOptions.get(i).getAttribute("innerHTML");
                   if (screenSelectedText.contains(optionNumber)) {
                        CommonActions.click(screenOptions.get(i));
                        Thread.sleep(3000);
                        break;
                   }
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return this;
    }

    public CustomFieldSectionPage clickOnSaveButton() {
        try {
            CommonActions.click(saveButton);
            Thread.sleep(5000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return new CustomFieldSectionPage();
    }

    public static AddCustomFieldSectionModal getInstance() {
        return new AddCustomFieldSectionModal();
    }
}
