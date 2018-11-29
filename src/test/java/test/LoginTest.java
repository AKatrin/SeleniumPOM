package test;

import framework.pages.OrangeHRM.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{

    @Test
    public void testLoginOrangeHRM() {
        LoginPage loginPage = new LoginPage();

        loginPage
                .goTo()
                .clickOnLoginButton();
    }
}
