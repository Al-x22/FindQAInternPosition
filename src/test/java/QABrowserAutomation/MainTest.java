package QABrowserAutomation;

import QABrowserAutomation.Service.WebPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static QABrowserAutomation.Main.writeResultToTxt;
import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    WebPage webPage;

    @BeforeEach
    public void initializeGreeter() {
        webPage = new WebPage();
    }

    // Original Task 2
    @Test
    public void accessPlaytechInternshipTabByUsingXPathAndClick() {

        webPage.openWebPage("https://playtech.ee/");
        webPage.findLinkInPage("Internship").click();
        String actualOutput = webPage.findElementInPage("Development QA Engineer (Intern)");
        webPage.quitWebPage();
        writeResultToTxt(actualOutput);

    }

    // Bonus 1 for Task 2
    @Test
    public void accessPlaytechInternshipTabByUsingCoordinates() {

        webPage.openWebPage("https://playtech.ee/");
        int[] coordinates = webPage.getLinkCoordinates("Internship");
        webPage.clickLinkInPageUsingCoordinates(coordinates[0], coordinates[1]);
        String actualOutput = webPage.findElementInPage("Development QA Engineer (Intern)");
        webPage.quitWebPage();
        writeResultToTxt(actualOutput);
    }
}