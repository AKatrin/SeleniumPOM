package framework.utils;

import framework.manager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CommonActions {
    public static WebDriver driver = DriverManager.getInstance().getWebDriver();

    public static void setText(WebElement element, String text) {
        element.sendKeys(text);
    }

    public static void setText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static void click(WebElement element) {
        element.click();
    }

    public static void click(By by) {
        driver.findElement(by).click();
    }

    public static String getText(WebElement element) {
        return element.getAttribute("value");
    }

    public static boolean isEnabled(WebElement element) {
        return element.isEnabled();
    }

    public static boolean isClickable(WebElement element) {
        return element.isEnabled() && element.isDisplayed();
    }

    public static void waitForElementToBeClickable(WebElement element) {
        WebDriverWait wait = DriverManager.getInstance().getWebDriverWait();
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitForByToBeClickable(By by) {
        WebDriverWait wait = DriverManager.getInstance().getWebDriverWait();
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void navigate(String url) {
        driver.get(url);
    }

    public  static String getTitle() {
        String title = driver.getTitle();
        return title;
    }
    public static List<WebElement> getElements(WebElement element) {
        List<WebElement> elements = driver.findElements((By)element);
        return elements;
    }
}
