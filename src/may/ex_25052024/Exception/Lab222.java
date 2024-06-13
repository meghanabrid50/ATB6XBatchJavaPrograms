package may.ex_25052024.Exception;

public class Lab222 {
    public static void main(String[] args) {
        try{
            String s1 = "Meghana";
            s1 = null;
            System.out.println(s1.trim());
        }
        catch (Exception e){
            System.out.println("S1 is null");
        }

        System.out.println("End of the Program");
    }
}
