package manager;

public class WebDriverFactory {

    public static BrowserManager GetManager(BrowserType type)
    {
        BrowserManager driverManager;

        switch (type) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver", "C:\\dev\\tools\\chromeTools\\chromedriver.exe");
                driverManager = new ChromeDriverManager();
                break;
            case FIREFOX:
                System.setProperty("webdriver.gecko.driver", "C:\\dev\\tools\\firefoxTools\\geckodriver.exe");
                driverManager = new FirefoxDriverManager();
                break;
            case EDGE:
                driverManager = new EdgeDriverManager();
                break;
            case OPERA:
                System.setProperty("webdriver.opera.driver", "C:\\dev\\tools\\operaTools\\operadriver.exe");
                driverManager = new OperaDriverManager();
            default:
                driverManager = new ChromeDriverManager();
                break;
        }
        return driverManager;
    }
}
