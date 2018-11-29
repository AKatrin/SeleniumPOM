package framework.common;

import framework.pages.BasePage;
import framework.reports.ExtentManager;
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
        try {
            driver.findElement(imagesMenuItem).click();
            ExtentManager.getInstance().logTestPass("Click on Imágenes");
        }catch (Exception e) {
            ExtentManager.getInstance().logTestFailed(e.getMessage() + e.getCause());
        }

    }
}
