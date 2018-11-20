package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class DriverManager {

    private static DriverManager instance;
    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    private DriverManager()
    {
        initializeDriver();
    }

    public static DriverManager getInstance()
    {
        if (instance == null)
        {
            instance = new DriverManager();
        }
        return instance;
    }

    public void initializeDriver()
    {
        BrowserType driverType = BrowserType.CHROME;

        webDriver = WebDriverFactory.GetManager(driverType).getDriver();
        webDriver.manage().window().maximize();
    }

    public void quitWebDriver()
    {
        webDriver.quit();
    }

    public WebDriver getWebDriver()
    {
        return webDriver;
    }

    public WebDriverWait getWebDriverWait()
    {
        return webDriverWait;
    }


}
