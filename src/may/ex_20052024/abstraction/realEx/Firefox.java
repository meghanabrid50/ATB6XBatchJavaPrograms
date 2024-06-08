package may.ex_20052024.abstraction.realEx;

public class Firefox extends BaseClass{
    @Override
    String openBrowser() {
        System.out.println("Starting firefox");
        return "";
    }

    @Override
    String closeBrowser() {
        System.out.println("Closing firefox");
        return "";
    }
}
