package manager;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends BrowserManager {
    protected void startService() {
        driver = new FirefoxDriver();
    }

    protected void stopService() {

    }

    protected void createDriver() {

    }
}
