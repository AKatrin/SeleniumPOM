package test;

import framework.pages.OrangeHRM.LoginPage;
import org.testng.annotations.Test;

public class CustomFieldSectionTest extends TestBase {
    @Test
    public void testCustomFieldSectionListIsLoading() {
        LoginPage login = new LoginPage();
        login
                .goTo()
                .clickOnLoginButton()
                .menuLeft
                .clickOnPIMOptionOfLeftMenu()
                .clickOnConfigurationOption()
                .clickOnCustomField();
    }
}
