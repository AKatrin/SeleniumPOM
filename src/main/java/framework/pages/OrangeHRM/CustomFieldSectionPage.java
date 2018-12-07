package framework.pages.OrangeHRM;

import framework.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CustomFieldSectionPage extends BasePage {

    @FindBy(xpath = "//div[@ng-switch='ohrmtruncatedtitlenavbar.title.isArray']//li")
    private List<WebElement> breadcrumb;

    public static CustomFieldSectionPage getInstance() {
        return new CustomFieldSectionPage();
    }

    public String getTitleNavBar(String titlePage) {
        String title = "";
        try {
            if (breadcrumb.size() > 0) {
                for (int i = 0; i <= breadcrumb.size(); i++) {
                    String aux = breadcrumb.get(i).getText();
                    title = title + " " + aux;
                    if ((breadcrumb.size() - 1) == i) {
                        title = title.trim();
                        break;
                    }
                }
            }
            if (!title.contains(titlePage)) {
                title = "The title doesn't content " + titlePage;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return title;
    }
}
