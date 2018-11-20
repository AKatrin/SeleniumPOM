import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleLandingPage extends BasePage {

    private By searchTextField = By.name("q");
    private By searchWithGoogleButton = By.xpath("//input[@name='btnK' and ancestor::div[@class='FPdoLc VlcLAe']]");

    public GoogleLandingPage clickOnSearchTextField(){
        driver.findElement(searchTextField).click();
        return this;
    }

    public GoogleLandingPage setTextOnSearchTextField(String text){
        driver.findElement(searchTextField).sendKeys(text);
        return this;
    }

    public SearchResultPage clickOnSearchWithGoogleButton(){
        WebElement button = driver.findElement(searchWithGoogleButton);
        button.click();
        //driver.findElement(searchWithGoogleButton).submit();
        return new SearchResultPage();
    }

    public GoogleLandingPage goTo(){
        driver.get("http://www.google.com");
        return this;
    }
}
