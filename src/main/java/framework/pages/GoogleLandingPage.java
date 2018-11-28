package framework.pages;

import framework.searchResult.SearchResultPage;
import framework.utils.CommonActions;
import org.openqa.selenium.By;

public class GoogleLandingPage extends BasePage {

    private By searchTextField = By.name("q");
    private By searchWithGoogleButton = By.xpath("//input[@name='btnK' and ancestor::div[@class='FPdoLc VlcLAe']]");
    private By googleLogoImage = By.id("hplogo");


    public GoogleLandingPage clickOnSearchTextField(){
        CommonActions.click(searchTextField);
        return this;
    }

    public GoogleLandingPage setTextOnSearchTextField(String text){
        CommonActions.setText(searchTextField, text);
        return this;
    }

    public SearchResultPage clickOnSearchWithGoogleButton(){
        CommonActions.click(googleLogoImage);
        CommonActions.click(searchWithGoogleButton);
        return new SearchResultPage();
    }

    public GoogleLandingPage goTo(){
        driver.get("http://www.google.com");
        return this;
    }
}
