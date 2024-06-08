package may.ex_18052024.polymorphism.methodOverloading;

public class Lab189 {

    Lab189(){

    }
    Lab189(int a){

    }
    Lab189(int a, int b){

    }
    Lab189(int a, String b){

    }
    //Method Overloading--> Multiple methods with same name, but different arguments

    void gift(String s){
        System.out.println("S is a String -> "+ s);
    }

    int gift(int a){
        System.out.println("A is a Int -> "+ a);
        return a;
    }
    int gift(float x){
        System.out.println("X is a Int -> "+ x);
        return 89;
    }
    void gift(double d){
        System.out.println("D is a double -> "+ d);
    }

    public static void main(String[] args) {
        Lab189 p = new Lab189();
        p.gift(10);
        p.gift("Meghana");
    }
}
