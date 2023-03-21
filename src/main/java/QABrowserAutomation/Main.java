package QABrowserAutomation;

import QABrowserAutomation.Service.WebPage;

import java.io.FileWriter;
import java.io.IOException;

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
        String elementToFind = webPage.findElementInPage("Development QA Engineer (Intern)");
        System.out.println(elementToFind);
        writeResultToTxt(elementToFind);

//      Task 4
        webPage.quitWebPage();
    }

    public static void writeResultToTxt (String result){
        try {
            FileWriter writer = new FileWriter("result.txt");
            writer.write(result);
            writer.close();
            System.out.println("Result saved to result.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
