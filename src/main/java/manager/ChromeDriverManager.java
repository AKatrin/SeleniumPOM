package manager;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends BrowserManager {
    protected void startService() {
        driver = new ChromeDriver();
    }

    protected void stopService() {

    }

    protected void createDriver() {

    }
}
