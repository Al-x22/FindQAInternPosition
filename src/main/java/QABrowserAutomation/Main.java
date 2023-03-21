package QABrowserAutomation;

import QABrowserAutomation.Service.WebPage;
import org.openqa.selenium.WebElement;

public class Main {
    public static void main(String[] args) {

        WebPage webPage = new WebPage();
        webPage.openWebPage("https://playtech.ee/");
        webPage.findLinkInPage("Internship").click();

        String elementToFind = webPage.findElementInPage("Development QA Engineer (Intern)");
        System.out.println(elementToFind);

        webPage.quitWebPage();

    }
}
