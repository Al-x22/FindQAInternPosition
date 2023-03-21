package QABrowserAutomation.Service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebPage {

    public void openWebPage(String link) {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(link);
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
