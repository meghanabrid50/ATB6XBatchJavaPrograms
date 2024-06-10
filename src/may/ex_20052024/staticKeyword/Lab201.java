package may.ex_20052024.staticKeyword;

public class Lab201 {
    //Static -->Data Member , Function, Class
    //Static loads when class is loaded
    public static void main(String[] args) {
//        ATB xyz = new ATB("8687655787");
//        ATB abc = new ATB("+1687658787");
//
//        xyz.printDetails();
//        abc.printDetails();
//
//        System.out.println(ATB.courseName);

        ATB lmp = new ATB("74863389385");
    }
}

class ATB{

    static {
        System.out.println("SIB-> I will be executed when class is loaded. Executed only 1 time");
    }
    {
        System.out.println("IIB --> Instance initialization block. Loaded whenever object of class is created.");
    }
    static String courseName= "ATB"; //Statuc variable
    String phoneNo;//Instance variable

    public ATB(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public void printDetails(){
        System.out.println("Your Details " + this.phoneNo);
    }
}