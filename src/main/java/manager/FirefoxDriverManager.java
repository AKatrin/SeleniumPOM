package manager;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends BrowserManager {
    protected void startService() {
        System.setProperty("webdriver.gecko.driver", BrowserConfig.getInstance().getDriverPath());
        driver = new FirefoxDriver();
    }

    protected void stopService() {

    }

    protected void createDriver() {

    }
}
