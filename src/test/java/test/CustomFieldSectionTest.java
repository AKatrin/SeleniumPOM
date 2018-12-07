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
        String headingName = "Information Additional" + digits;
        DashboardOrangeHRMPage dashboardOrangeHRMPage = new DashboardOrangeHRMPage();
        dashboardOrangeHRMPage
                .menuLeft
                .clickOnPIMOptionOfLeftMenu()
                .clickOnConfigurationOption()
                .clickOnCustomField()
                .clickOnAddCustomFieldSectionButton();
        AddCustomFieldSectionModal.getInstance()
                .setHeadingForCustomFieldSection(headingName)
                .selectAnOptionForScreen("Emergency Contacts")
                .clickOnSaveButton();
        String titleBasePage = "Custom Field Section navigate_next ";
        String titlePage = CustomFieldSectionPage.getInstance().getTitleNavBar(titleBasePage + headingName);
        Assert.assertEquals(titleBasePage + headingName, titlePage);
        Assert.assertEquals(headingName, CustomFieldSectionPage.getInstance().getTitle());
    }
}
