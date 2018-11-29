package test;

import framework.pages.OrangeHRM.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{

    @Test
    public void testLoginOrangeHRM() {
        LoginPage googleLandingPage = new LoginPage();

        googleLandingPage
                .goTo()
                .fillUserNameInUserNameField("admin")
                .fillPasswordInPasswordField("admin123")
                .clickOnLoginButton();
    }
}
