package may.ex_16052024.singleInheritance;

public class Java extends Programming {
    //Single Inheritance  -- IS A
    //Java is programming language
    //Python is programming lang.

    String newfeature;
    public Java(){
        System.out.println("DC");
    }

    public Java(String newfeature) {
        this.newfeature = newfeature;
    }

    void printInfo() {
        System.out.println("Feature is -> " + this.newfeature);
    }
}
