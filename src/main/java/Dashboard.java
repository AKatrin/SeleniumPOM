
import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Dashboard extends BasePage {

    By usernameBy = By.id("email");
    By passwordBy = By.id("password");

    public static void main(String args[]) throws InterruptedException {


        System.setProperty("webdriver.gecko.driver", "C:\\dev\\tools\\firefoxTools\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");

        driver.findElement(By.id("lst-ib")).click();
        driver.findElement(By.id("lst-ib")).sendKeys("Naruto");
        driver.findElement(By.name("btnK")).click();


        driver.findElement(By.linkText("Imágenes")).click();
        List<WebElement> imagenes = driver.findElements(By.tagName("img"));

        if (imagenes.size() > 2){
            imagenes.get(2).click();
        }

        Thread.sleep(25000);
        driver.quit();
    }
}
