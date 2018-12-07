package test;

import framework.pages.OrangeHRM.AddCustomFieldSectionModal;
import framework.pages.OrangeHRM.CustomFieldSectionPage;
import framework.pages.OrangeHRM.DashboardOrangeHRMPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomFieldSectionTest extends TestBase {

    @Test
    public void testCustomFieldSectionListIsLoading() {
        DashboardOrangeHRMPage dashboardOrangeHRMPage = new DashboardOrangeHRMPage();
        String title = dashboardOrangeHRMPage
                .menuLeft
                .clickOnPIMOptionOfLeftMenu()
                .clickOnConfigurationOption()
                .clickOnCustomField()
                .getTitle();
        Assert.assertEquals("Custom Field Sections", title);
    }

    @Test
    public void testCreateACustomFieldSection() {
        DashboardOrangeHRMPage dashboardOrangeHRMPage = new DashboardOrangeHRMPage();
        dashboardOrangeHRMPage
                .menuLeft
                .clickOnPIMOptionOfLeftMenu()
                .clickOnConfigurationOption()
                .clickOnCustomField()
                .clickOnAddCustomFieldSectionButton();
        AddCustomFieldSectionModal.getInstance()
                .setHeadingForCustomFieldSection("heading" + digits)
                .selectAnOptionForScreen("Emergency Contacts" )
                .clickOnSaveButton();
        String title = CustomFieldSectionPage.getInstance().getTitle();
        Assert.assertEquals("heading" + digits, title);
    }
}
