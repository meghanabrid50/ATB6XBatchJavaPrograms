package may.ex_23052024;

public class Lab204 {
    public static void main(String[] args) {
        A a = new A();
        A b = new A();
        A c = new A();
        System.out.println(A.common);
        System.out.println(a.common);
        A.m1();
        a.m1();
       // A.m2();  //Can not call bcz of non static
        a.m2();



    }
}

class A{
    int age =10;
    static String common = "ABC";
    static {
        System.out.println("A");
    }
    {
        System.out.println("IIB");
    }
    static void m1(){
        System.out.println("m1");
    }
    void m2(){
        System.out.println("m2");
    }
}
