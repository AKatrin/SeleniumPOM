package framework.common;

import framework.BasePage;
import org.openqa.selenium.By;

public class SearchResultToolBar extends BasePage {
    private By allMenuItem = By.id("lst-ib");
    private By imagesMenuItem = By.xpath("//a[contains(.,'Imágenes')]");

    public void clickOnAllMenuItem(){
        driver.findElement(allMenuItem).click();
    }

    public void clickOnImagesMenuItem() {
        /*WebDriverWait wait = new WebDriverWait(driver, 30000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(imagesMenuItem));*/
        driver.findElement(imagesMenuItem).click();
    }
}
