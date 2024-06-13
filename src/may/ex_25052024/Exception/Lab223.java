package may.ex_25052024.Exception;

public class Lab223 {
    public static void main(String[] args) {
        try{
            int a = 0;
            int x = 10/a;

        } catch (Exception e){
            System.out.println("Exit");
        }
        finally {
            System.out.println("I am final");
        }
    }
}
