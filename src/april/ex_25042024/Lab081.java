package april.ex_25042024;

import java.util.Scanner;

public class Lab081 {
    public static void main(String[] args) {

        //Web Automation
        //I will ask the user which browser you want me to run code.
        //Chrome--> Start chrome, edge-->edge , firefox--> firefox

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name which you want to execute the program");
        String browser = sc.nextLine();
        browser = browser.toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("Starting the chrome browser");
                //There is selenium code to start browser
                break;
            case "edge":
                System.out.println("Starting the edge browser");
                //There is selenium code to start browser
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                //There is selenium code to start browser
                break;
            default:
                System.out.println("I do not have idea which browser to use");
        }
    }
}
