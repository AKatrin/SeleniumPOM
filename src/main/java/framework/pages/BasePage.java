package framework.pages;

import framework.manager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver driver  = DriverManager.getInstance().getWebDriver();

    public BasePage(){
        PageFactory.initElements(driver, this);
    }
}
