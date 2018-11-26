package framework.manager;

import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BrowserConfig {

    public String getBrowserName() {

        JSONObject jsonObject = (JSONObject) getJSON();
        String nameBrowser = (String) jsonObject.get("browser");
        return nameBrowser;

    }

    public String getDriverPath() {

        JSONObject jsonObject = (JSONObject) getJSON();
        String driverPath = (String) jsonObject.get("driverPath");
        return driverPath;

    }



    private Object getJSON() {
        ClassLoader classLoader = getClass().getClassLoader();
        File fileJson = new File(classLoader.getResource("WebBrowser.json").getFile());
        JSONParser parser = new JSONParser();
        Object obj = null;
        try {
            obj = parser.parse(new FileReader(fileJson.getAbsolutePath()));
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }

    public static BrowserConfig getInstance() {
        return new BrowserConfig();
    }
}
