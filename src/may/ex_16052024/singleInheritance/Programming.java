package may.ex_16052024.singleInheritance;

public class Programming {

    int version;
    String author;

     Programming() {
        System.out.println("DC");
    }

     Programming(int version, String author) {
        this.version = version;
        this.author = author;
    }

    void printInfo(){
        System.out.println("Program info -> " + this.version + " Author " +this.author);
    }
}
