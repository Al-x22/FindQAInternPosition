package QABrowserAutomation.Service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebPage {

    WebDriver driver = new FirefoxDriver();

    public void openWebPage(String link) {
        driver.manage().window().maximize();
        driver.get(link);
        System.out.println(driver.getTitle());
    }
    public void quitWebPage() {
        driver.quit();
    }
    public WebElement findLinkInPage (String element){
        return driver.findElement(By.xpath("//a[text()='" + element + "']"));
    }
}
