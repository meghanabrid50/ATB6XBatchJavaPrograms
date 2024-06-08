package may.ex_20052024.interfacekeyword;

public interface Engine {
    void startEngine();
    void stopEngine();

    default void haltingEngineJustStart(){
        System.out.println("Halt the engine");
    }

    default void haltingEngineJustStop(){
        System.out.println("Halt the engine");
    }

    static void m1(){
        System.out.println("M1");
    }

    // void m2(){  --> Complete function is not allowed in interface
     //   System.out.println("M2");
   // }
}
