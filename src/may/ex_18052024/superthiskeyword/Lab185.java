package may.ex_18052024.superthiskeyword;

public class Lab185 {
    public static void main(String[] args) {
        Dog d = new Dog();
        Dog d2 = new Dog("Lab");
  //Constructor Chaining -> Child DC -> Parents DC

    }
}

class Animal{
    String type;
    public Animal(){
        System.out.println("Animal DC");
    }
    Animal(String type){
        System.out.println("Animal PC");
    }
}

class Dog extends Animal{
    String breed;

    public Dog(String breed)
    {
        super("DOG Type");
        this.breed = breed;
    }

    Dog(){
        //super();
        System.out.println("Dog DC");
    }

    void display(){
        System.out.println("Type: "+ type + ", Breed: "+ this.breed);
    }
}