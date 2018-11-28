package test;

import framework.pages.GoogleLandingPage;
import org.testng.annotations.Test;

public class TestDashboard2 {
    @Test
    public void testGoogleLandingPage() {
        GoogleLandingPage googleLandingPage = new GoogleLandingPage();

        googleLandingPage
                .goTo()
                .setTextOnSearchTextField("Goku")
                .clickOnSearchWithGoogleButton()
        .toolBar
            .clickOnImagesMenuItem();
    }
}
