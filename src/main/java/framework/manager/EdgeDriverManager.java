package framework.manager;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManager extends BrowserManager {
    protected void startService() {
        System.setProperty("webdriver.edge.driver", BrowserConfig.getInstance().getDriverPath());
        driver =  new EdgeDriver();
    }

    protected void stopService() {

    }

    protected void createDriver() {

    }
}
