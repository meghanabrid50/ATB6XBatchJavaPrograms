package may.ex_20052024.staticKeyword;

public class Lab201 {
    //Static -->Data Member , Function, Class
    //Static loads when class is loaded
    public static void main(String[] args) {
        ATB xyz = new ATB();
        xyz.id ="1";
        System.out.println(ATB.courseName);
    }
}

class ATB{
    static String courseName= "ATB";
    String id;

}