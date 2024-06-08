package may.ex_16052024.singleInheritance;

public class Lab174 {
    public static void main(String[] args) {
        //Inheritance
        //Inherit attributes and behaviour from the parent , Grand Parent

        //Superclass | Parent class | Base class
        //Subclass | Child class | Derived Class

        //Parent -> Child

        //Child extends Parent
        //extends keyword-> Parent's attributes are available to the child class.
        //Single Inheritance
        //Parent -> Programming class
        //Child -> Java Class

        //Java extends Programming
        Programming p = new Programming(12,"KO posan");
        Java j = new Java("Lambda exp");
        p.printInfo();
        j.printInfo();

        Programming p1 = new Programming(12 , "Van Russom");
        p1.printInfo();

        Python py = new Python();
        py.printInfo();

    }
}
