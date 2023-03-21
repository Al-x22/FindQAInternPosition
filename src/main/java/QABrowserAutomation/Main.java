package QABrowserAutomation;

import QABrowserAutomation.Service.WebPage;

public class Main {
    public static void main(String[] args) {

//      Task 1
        WebPage webPage = new WebPage();
        webPage.openWebPage("https://playtech.ee/");

//      Task 2 Without Coordinates
//      webPage.findLinkInPage("Internship").click();

//      Task 2 With Coordinates
        int[] coordinates = webPage.getLinkCoordinates("Internship");
        webPage.clickLinkInPageUsingCoordinates(coordinates[0], coordinates[1]);
//      Give some time for page to reload fully
        webPage.sleep(2500);

//      Task 3
        String elementToFind = webPage.findElementInPage("to create technology");
        System.out.println(elementToFind);

//      Task 4
        webPage.quitWebPage();

    }
}
