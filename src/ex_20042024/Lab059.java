package ex_20042024;

public class Lab059 {
    public static void main(String[] args) {

        String name = "The Testing Academy";  //Store in string constant pool(SCP)
        String name2 = "The Testing Academy"; //Store in string pool
        String name3 = new String("The Testing Academy"); //Store in Heap Area(OA)

        System.out.println(name == name2);  //Check the references
        System.out.println(name.equals(name2));  //Check the values/contents


        System.out.println(name == name3);  //Check the references
        System.out.println(name.equals(name3));

    }
}
