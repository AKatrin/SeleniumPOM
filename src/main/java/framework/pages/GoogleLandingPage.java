package framework.pages;

import framework.searchResult.SearchResultPage;
import framework.utils.CommonActions;
import framework.utils.ExtentManager;
import org.openqa.selenium.By;

public class GoogleLandingPage extends BasePage {

    private By searchTextField = By.name("q");
    private By searchWithGoogleButton = By.xpath("//input[@name='btnK' and ancestor::div[@class='FPdoLc VlcLAe']]");

    public GoogleLandingPage clickOnSearchTextField(){
       // driver.findElement(searchTextField).click();
        CommonActions.click(searchTextField);
        ExtentManager.getInstance().initializeReport();
        return this;
    }

    public GoogleLandingPage setTextOnSearchTextField(String text){
        //driver.findElement(searchTextField).sendKeys(text);
        CommonActions.setText(searchTextField, text);
        return this;
    }

    public SearchResultPage clickOnSearchWithGoogleButton(){
        //WebElement button = driver.findElement(searchWithGoogleButton);
        CommonActions.click(searchWithGoogleButton);
        //button.click();
        //driver.findElement(searchWithGoogleButton).submit();
        return new SearchResultPage();
    }

    public GoogleLandingPage goTo(){
        driver.get("http://www.google.com");

        return this;
    }
}
