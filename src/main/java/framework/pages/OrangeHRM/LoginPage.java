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
            ReportManager.getInstance().logPass("Set User name field with: " + userName);
        } catch (Exception e) {
            ReportManager.getInstance().logTestFailed("The field isn't set" + e.getMessage());
        }
        return this;
    }

    public LoginPage setPasswordField(String password) {
        try {
            CommonActions.setText(inputToInsertPassword, password);
            ReportManager.getInstance().logPass("Set User name field with: " + password);
        } catch (Exception e) {
            ReportManager.getInstance().logTestFailed("Password field isn't set: " + e.getMessage());
        }
        return this;
    }

    public DashboardOrangeHRMPage clickOnLoginButton() {
        try {
            CommonActions.click(loginButton);
            ReportManager.getInstance().logPass("Click on login button");
        } catch (Exception e) {
            //ReportManager.getInstance().logTestFailed("It isn't possible to click: " + e.getMessage());
        }
        return new DashboardOrangeHRMPage();
    }

    public LoginPage goTo() {
        try {
            driver.get(BrowserConfig.getInstance().getOrangeURL());
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
        return this;
    }
}
