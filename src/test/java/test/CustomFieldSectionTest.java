package test;

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
                .clickOnAddCustomFieldSectionButton()
                .setHeadingForCustomFieldSection("heading");
    }
}
