package may.ex_18052024.polymorphism.methodOverriding;

import may.ex_18052024.polymorphism.methodOverloading.Dog;
import may.ex_18052024.polymorphism.methodOverloading.Hound;

public class LAb190 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();

        Hound h = new Hound();
        h.bark();

        Dog d1 = new Hound();  //Dynamic Dispatch -> Runtime Polymorphism
        d1.bark();
    }
}
