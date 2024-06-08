package may.ex_20052024.abstraction.realEx;

public class Chrome extends BaseClass{

    @Override
    String openBrowser() {
        System.out.println("Starting chrome");
        return "";
    }

    @Override
    String closeBrowser() {
        System.out.println("Closing chrome");
        return "";
    }
}
