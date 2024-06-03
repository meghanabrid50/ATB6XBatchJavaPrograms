package ex_11_05_2024;

import javax.xml.transform.Source;

public class Person {
    //Attribute
    String name;
    byte age;
    long phone_no;
    String[] add;
    double height;
    String dob;
    boolean isFemale;
    float Salary;
    String eye_color;



    //Functionality
    void walk(){
        System.out.println("I can Walk");
    }

    void talk(String msg){
        System.out.println("I will say ->" + msg);
    }

    String sleep(){
        return "Sleeping";
    }

    String eat(String item){
        return item;
    }
}
