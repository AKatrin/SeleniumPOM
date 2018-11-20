package common;

import framework.BasePage;
import org.openqa.selenium.By;

public class SearchResultToolBar extends BasePage {
    private By todosMenuItem = By.id("lst-ib");
    private By imagenesMenuItem = By.xpath("//a[contains(.,'Imágenes')]");

    public void clickOnTodosMenuItem(){
        driver.findElement(todosMenuItem).click();
    }

    public void clickOnImagenesMenuItem() {
        /*WebDriverWait wait = new WebDriverWait(driver, 30000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(imagenesMenuItem));*/
        driver.findElement(imagenesMenuItem).click();
    }
}
