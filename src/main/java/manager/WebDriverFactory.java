package manager;

import java.io.File;

public class WebDriverFactory {

    public static BrowserManager GetManager(BrowserType type)
    {
        BrowserManager driverManager;

        switch (type) {
            case CHROME:

                driverManager = new ChromeDriverManager();
                break;
            case FIREFOX:
                driverManager = new FirefoxDriverManager();
                break;
            case EDGE:
                driverManager = new EdgeDriverManager();
                break;
            case OPERA:
                driverManager = new OperaDriverManager();
                break;
            default:
                driverManager = new ChromeDriverManager();
                break;
        }
        return driverManager;
    }
}
