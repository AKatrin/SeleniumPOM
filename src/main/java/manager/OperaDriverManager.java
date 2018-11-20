package manager;

import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class OperaDriverManager extends BrowserManager {

    protected void startService() {
        OperaOptions options = new OperaOptions();
        options.setBinary("C:\\Users\\areliez.vargas\\AppData\\Local\\Programs\\Opera\\56.0.3051.104\\opera.exe");
        driver = new OperaDriver(options );
    }

    protected void stopService() {

    }

    protected void createDriver() {

    }
}
