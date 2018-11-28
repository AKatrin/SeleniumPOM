package test;

import framework.pages.GoogleLandingPage;
import org.testng.annotations.Test;

public class TestDashboard2 extends TestBase{
    @Test
    public void testGoogleLandingPageTwo() {
        GoogleLandingPage googleLandingPage = new GoogleLandingPage();

        googleLandingPage
                .goTo()
                .setTextOnSearchTextField("Goku")
                .clickOnSearchWithGoogleButton()
        .toolBar
            .clickOnImagesMenuItem();
    }
}
