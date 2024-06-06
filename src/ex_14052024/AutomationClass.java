package ex_14052024;

public class AutomationClass {

    AutomationClass(){
        databaseConnection();
        excelOpen();
    }

    void databaseConnection(){
        System.out.println("Mysql connection is created");
    }

    void excelOpen(){
        System.out.println("Excel Opened");
    }

    void testcase1(){
        System.out.println("TC1");
    }

    void testcase2(){
        System.out.println("TC2");
    }

    public static void main(String[] args) {
        AutomationClass a = new AutomationClass();
        a.testcase1();
        a.testcase2();
    }
}
