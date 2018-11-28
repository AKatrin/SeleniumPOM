package test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import framework.pages.GoogleLandingPage;
import framework.reports.ExtentManager;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class TestDashboard2 extends TestBase{
    @Test
    public void testGoogleLandingPageTwo(Method method) {
        String methodName = method.getName();

        GoogleLandingPage googleLandingPage = new GoogleLandingPage();

        googleLandingPage
                .goTo()
                .setTextOnSearchTextField("Goku")
                .clickOnSearchWithGoogleButton()
        .toolBar
            .clickOnImagesMenuItem();
        ExtentTest logger = ExtentManager.getInstance().getExtendReport().startTest(methodName);
        logger.log(LogStatus.PASS, "The test paso");
        ExtentManager.getInstance().getExtendReport().endTest(logger);
    }
}
