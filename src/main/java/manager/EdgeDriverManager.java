package manager;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManager extends BrowserManager {
    protected void startService() {
        driver =  new EdgeDriver();
    }

    protected void stopService() {

    }

    protected void createDriver() {

    }
}
