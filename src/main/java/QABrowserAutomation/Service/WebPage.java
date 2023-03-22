package QABrowserAutomation.Service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebPage {

    WebDriver driver = new FirefoxDriver();

    public void openWebPage(String link) {
        driver.manage().window().maximize();
        driver.get(link);
    }

    public void quitWebPage() {
        driver.quit();
    }
    public String getTitle() {return driver.getTitle();}

    public WebElement findLinkInPage(String element) {
        return driver.findElement(By.xpath("//a[text()='" + element + "']"));
    }

    public String findElementInPage(String sentenceToSearch) {

        try {
            // By waiting until h3 is loaded, I can assure that the whole html has loaded, and then being able
            // to get the whole body properly
            new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(driver -> driver.findElement(By.tagName("h3")));

            WebElement body = driver.findElement(By.tagName("body"));
            String bodyText = body.getText();

            String[] paragraphs = bodyText.split("\\n\\s*\\n"); // split the body text into paragraphs

            for (String paragraph : paragraphs) {
                if (paragraph.contains(sentenceToSearch)) {
                    return "The following text contains '" + sentenceToSearch + "':\n\n" + paragraph;
                } else return "'" + sentenceToSearch + "' is not shown on the page.";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "There is an error with the element you want to search in the page. Please try again.";
    }

    //  Bonus Tasks
    public void clickLinkInPageUsingCoordinates(int x, int y) {
        new Actions(driver).moveByOffset(x + 5, y).click().build().perform();
        sleep(2500);
    }

    public int[] getLinkCoordinates(String link) {
        WebElement internshipTab = findLinkInPage(link);
        int x = internshipTab.getLocation().getX();
        int y = internshipTab.getLocation().getY();

        return new int[]{x, y};
    }

    public void sleep(int i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
