package framework.manager;

import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class OperaDriverManager extends BrowserManager {

    protected void startService() {
        System.setProperty("webdriver.opera.driver", BrowserConfig.getInstance().getDriverPath());
        OperaOptions options = new OperaOptions();
        //The string should be set with the path where is installed opera v 56.0..
        options.setBinary("C:\\Users\\areliez.vargas\\AppData\\Local\\Programs\\Opera\\56.0.3051.104\\opera.exe");
        driver = new OperaDriver(options );
    }

    protected void stopService() {

    }

    protected void createDriver() {

    }
}
