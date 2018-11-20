package framework;

import manager.DriverManager;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver  = DriverManager.getInstance().getWebDriver();
}
