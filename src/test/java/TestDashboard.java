import org.testng.annotations.Test;

public class TestDashboard {
    @Test
    public void testGoogleLandingPage() {
        GoogleLandingPage googleLandingPage = new GoogleLandingPage();

        googleLandingPage
                .goTo()
                .setTextOnSearchTextField("Naruto")
                .clickOnSearchWithGoogleButton()
        .toolBar
            .clickOnImagenesMenuItem();
    }
}
