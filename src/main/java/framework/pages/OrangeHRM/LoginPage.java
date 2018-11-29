package framework.pages.OrangeHRM;

import framework.pages.BasePage;
import framework.reports.ReportManager;
import framework.utils.CommonActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    private By inputToInsertPassword = By.id("txtPassword");
    private By loginButton = By.id("btnLogin");

    @FindBy(id = "txtUsername")
    private WebElement txtUserName;

    public LoginPage fillUserNameInUserNameField(String userName) {
        try {
            CommonActions.setText(txtUserName, userName);
            ReportManager.getInstance().logTestPass("Fill User name field with: " + userName);
        } catch (Exception e) {
            ReportManager.getInstance().logTestFailed("Step Failed" + e.getMessage());
        }
        return this;
    }

    public LoginPage fillPasswordInPasswordField(String password) {
        try {
            CommonActions.setText(inputToInsertPassword, password);
            ReportManager.getInstance().logTestPass("Fill User name field with: " + password);
        } catch (Exception e) {
            ReportManager.getInstance().logTestFailed("Step Failed" + e.getMessage());
        }
        return this;
    }

    public DashboardOrangeHRMPage clickOnLoginButton() {
        try {
            CommonActions.click(loginButton);
            ReportManager.getInstance().logTestPass("Click on login button  ");
        } catch (Exception e) {
            ReportManager.getInstance().logTestFailed("Step Failed" + e.getMessage());
        }
        return new DashboardOrangeHRMPage();
    }

    public LoginPage goTo() {
        try {
            driver.get("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");
            ReportManager.getInstance().logTestPass("Go to dashboard of OrangeHRMsm site");
        } catch (Exception e) {
            ReportManager.getInstance().logTestFailed(e.getMessage());
        }
        return this;
    }
}
