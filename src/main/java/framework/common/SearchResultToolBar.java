package framework.common;

import framework.pages.BasePage;
import framework.reports.ReportManager;
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
            ReportManager.getInstance().logTestPass("Click on Imágenes");
        }catch (Exception e) {
            ReportManager.getInstance().logTestFailed(e.getMessage() + e.getCause());
        }

    }
}
