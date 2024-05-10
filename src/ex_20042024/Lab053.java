package ex_20042024;

public class Lab053 {
    public static void main(String[] args) {
        String name = "Meghana";  //Assignment Operator
        String name2 = new String("Meghana"); //New Operator
        //Both of them , actually save name , name2 in different ways JVM
        //How they store the values in JVM?
        System.out.println(name);
        System.out.println("Your name is -->"+ name);
        System.out.printf("Your name is --> %s", name);
        System.out.println("-- All the functions available in string --");

        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name2.toUpperCase());

        //Primitive Data types-  byte, iny,long, char, boolean, double , float, short
        //All of them don't have extra functionality
        //OOps- Object oriented primitive, Everything is class
        //OOPs - Fully - dont have anything which is not in class format/ primitative.
        //Java is not pure object oriented.


        //Non Premitative Data type
        //String -- Have functionalities.




    }
}
