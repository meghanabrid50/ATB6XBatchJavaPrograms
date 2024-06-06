package ex_14052024;

public class ATBPerson {

    String name;  //Instance variable
    long phone;
    String email;
    boolean isMarried;
    String Coursname;
    int age;


    //Default constructor
    ATBPerson(){

        Coursname ="ATB";
        System.out.println("Hello, I will be called when you create an object of class");
    }

    //Param Constructor
    ATBPerson(String givename,long phonen){
        System.out.println("Param Constructor");
        this.name=givename;
        this.phone=phonen;

    }

    ATBPerson(String givename,long phonen,int age1){
        System.out.println("Param Constructor");
        this.name=givename;
        this.phone=phonen;
        this.age= age1;

    }

    void  printDetails(){
        int age =10;  //Local Variable
        System.out.println("Printing details of the student");
    }
}
