package manager;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends BrowserManager {
    protected void startService() {
        System.setProperty("webdriver.chrome.driver", BrowserConfig.getInstance().getDriverPath());
        driver = new ChromeDriver();
    }

    protected void stopService() {

    }

    protected void createDriver() {

    }
}
