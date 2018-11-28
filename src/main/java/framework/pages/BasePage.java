package framework.pages;

import framework.manager.DriverManager;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver  = DriverManager.getInstance().getWebDriver();
}
