package may.ex_16052024.multilevelInheritance;

public class Lab176 {
    public static void main(String[] args) {
        //Child c = new Child();
        //c.home();

        //GrandFather gf = new GrandFather();
        //gf.home();

        //Father f = new Father();
       // f.home();


        //Dynamic Dispatch
        GrandFather grandFather = new GrandFather();
        GrandFather grandFather1 = new Father();
        //GrandFather grandFather2 = new Child();
        grandFather.home();

        //Father f1 = new Child();



    }
}
