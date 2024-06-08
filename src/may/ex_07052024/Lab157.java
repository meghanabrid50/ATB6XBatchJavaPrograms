package may.ex_07052024;

public class Lab157 {
    public static void main(String[] args) {
        f1();
        String[] names= {"Meghana", "Brid"};
        String[] names2= new String[2];
        names2[0] = "Test";
        names2[1] = "Tester";
        f1(names);

    }

    static void f1(String[] a)  //Only inside the class
    {
        //for (String name : a){
       //     System.out.println(name);
      //  }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }

    }
    static void f1()  //Only inside the class
    {
       f2();
        System.out.println("F1");
    }

    static void f2()  //Only inside the class
    {
        System.out.println("f2");
    }
}

//static void f1()  //outside the class is not possible
//{

//}