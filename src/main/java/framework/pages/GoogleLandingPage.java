package framework.pages;

import framework.reports.ExtentManager;
import framework.searchResult.SearchResultPage;
import framework.utils.CommonActions;
import org.openqa.selenium.By;

public class GoogleLandingPage extends BasePage {

    private By searchTextField = By.name("q");
    private By searchWithGoogleButton = By.xpath("//input[@name='btnK' and ancestor::div[@class='FPdoLc VlcLAe']]");

    public GoogleLandingPage clickOnSearchTextField(){
        CommonActions.click(searchTextField);
        return this;
    }

    public GoogleLandingPage setTextOnSearchTextField(String text){
        try{
            CommonActions.setText(searchTextField, text);
            ExtentManager.getInstance().logTestPass("The text was set with: " + text);
        }catch (Exception e) {
            ExtentManager.getInstance().logTestFailed("The text wasn't set" + e.getMessage());
        }
        return this;
    }

    public SearchResultPage clickOnSearchWithGoogleButton(){
        try{
            CommonActions.click(searchWithGoogleButton);
            ExtentManager.getInstance().logTestPass("Click on Google search button ");
        }catch (Exception e) {
            ExtentManager.getInstance().logTestFailed(e.getMessage());
        }
        return new SearchResultPage();
    }

    public GoogleLandingPage goTo(){
        try {
            driver.get("http://www.google.com");
            ExtentManager.getInstance().logTestPass("Go to dashboard of google site");
        } catch (Exception e) {
            ExtentManager.getInstance().logTestFailed(e.getMessage());
        }
        return this;
    }
}
