package may.ex_20052024.interfacekeyword.intervieQ;

public class Lab199 {
}
interface I1{}
interface I2{}
class A{} //Concrete class
class B{ }
abstract class C{}
class Test1 extends A{}
class Test2 extends B{}
//class Test3 extend A,B{}  -> Multiple Inheritance
class Test4 implements I1,I2{}
class Test5 extends A implements I1,I2{}
//class Test6 implements I1,I2 extends A{} --> This is not allowed
//interface I3 extends A{}
//interface I4 implements A{}
//interface I5 extends A,B{}
interface I6 extends I1,I2{}