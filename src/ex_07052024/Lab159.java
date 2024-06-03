package ex_07052024;

public class Lab159 {
    public static void main(String[] args) {
        //Web Automation

        openBrowser();
        testLoginPage1();
        testLoginPage("Page 2");
        closeBrowser();

        openBrowser();
        testLoginPage("Page 3");
        closeBrowser();

        openBrowser();
        testLoginPage("Page 4");
        closeBrowser();


    }

    static void closeBrowser() {
        System.out.println("Browser Closed");
    }

    static void testLoginPage(String page) {
        System.out.println("Testing ->" +page);
    }

    static void testLoginPage1() {
         System.out.println("Testing Page 1 Opened");
    }

    static void openBrowser() {
        System.out.println("Chrome Browser Opened");
    }
}
