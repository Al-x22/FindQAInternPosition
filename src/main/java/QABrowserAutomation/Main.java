package QABrowserAutomation;

import QABrowserAutomation.Service.WebPage;

public class Main {
    public static void main(String[] args) {

        WebPage webPage = new WebPage();
        webPage.openWebPage("https://playtech.ee/");
    }
}
