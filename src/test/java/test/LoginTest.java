package test;

import framework.pages.OrangeHRM.LoginPage;
import org.testng.annotations.BeforeSuite;

public class LoginTest {

    @BeforeSuite
    public void login() {
        LoginPage login = new LoginPage();
        login
                .goTo()
                .clickOnLoginButton();
    }
}
