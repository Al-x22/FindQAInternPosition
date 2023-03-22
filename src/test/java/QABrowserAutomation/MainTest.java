package QABrowserAutomation;

import QABrowserAutomation.Service.WebPage;
import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static QABrowserAutomation.Main.writeResultToTxt;

class MainTest {

    WebPage webPage;

    @BeforeEach
    public void initializeWebPage() {
        webPage = new WebPage();

        webPage.openWebPage("https://playtech.ee/");
        boolean titleMatches = pageTitleMatches("Home – Playtech");
        Assert.isTrue(titleMatches, "Error during loading Home Playtech page");

    }

    // Main Tasks
    @Test
    public void accessPlaytechInternshipTabByUsingXPathAndClick() {

        webPage.findLinkInPage("Internship").click();
        boolean secTitleMatches = pageTitleMatches("Internship – Playtech");
        Assert.isTrue(secTitleMatches, "Error during loading of Internship page");

        String actualOutput = webPage.findElementInPage("Development QA Engineer (Intern)");
        System.out.println(actualOutput);

    }

    // Bonus for Tasks
    @Test
    public void accessPlaytechInternshipTabByUsingCoordinates() {

        int[] coordinates = webPage.getLinkCoordinates("Internship");
        webPage.clickLinkInPageUsingCoordinates(coordinates[0], coordinates[1]);

        webPage.findLinkInPage("Internship").click();
        boolean secTitleMatches = pageTitleMatches("Internship – Playtech");
        Assert.isTrue(secTitleMatches, "Error during loading of Internship page");

        String actualOutput = webPage.findElementInPage("Development QA Engineer (Intern)");
        writeResultToTxt(actualOutput);
    }

    @AfterEach
    public void closingWebPage() {
        webPage.quitWebPage();
    }

    public Boolean pageTitleMatches(String expectedTitle) {
        String pageName = webPage.getTitle();
        return pageName.equals(expectedTitle);
    }

}