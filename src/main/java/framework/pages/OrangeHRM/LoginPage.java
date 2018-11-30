package framework.pages.OrangeHRM;

import framework.manager.BrowserConfig;
import framework.pages.BasePage;
import framework.reports.ReportManager;
import framework.utils.CommonActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "txtPassword")
    private WebElement inputToInsertPassword;
    @FindBy(id = "btnLogin")
    private WebElement loginButton;
    @FindBy(id = "txtUsername")
    private WebElement inputToInsertUserName;

    public LoginPage setUserNameField(String userName) {
        try {
            CommonActions.setText(inputToInsertUserName, userName);
            ReportManager.getInstance().logTestPass("Set User name field with: " + userName);
        } catch (Exception e) {
            ReportManager.getInstance().logTestFailed("The field isn't set" + e.getMessage());
        }
        return this;
    }

    public LoginPage setPasswordField(String password) {
        try {
            CommonActions.setText(inputToInsertPassword, password);
            ReportManager.getInstance().logTestPass("Set User name field with: " + password);
        } catch (Exception e) {
            ReportManager.getInstance().logTestFailed("Password field isn't set: " + e.getMessage());
        }
        return this;
    }

    public DashboardOrangeHRMPage clickOnLoginButton() {
        try {
            Thread.sleep(10000);
            CommonActions.click(loginButton);
            ReportManager.getInstance().logTestPass("Click on login button");
        } catch (Exception e) {
            ReportManager.getInstance().logTestFailed("It isn't possible to click: " + e.getMessage());
        }
        return new DashboardOrangeHRMPage();
    }

    public LoginPage goTo() {
        try {
            driver.get(BrowserConfig.getInstance().getOrangeURL());
            ReportManager.getInstance().logTestPass("Go to dashboard of OrangeHRMsm site");
        } catch (Exception e) {
            ReportManager.getInstance().logTestFailed("" + e.getMessage());
        }
        return this;
    }
}
