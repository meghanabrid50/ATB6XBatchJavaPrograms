package may.ex_25052024.Exception;

public class Lab221 {
    public static void main(String[] args) {
        try {
            String sh = args[0]; //ArrayIndexOutOfBoundException
            int x = Integer.parseInt(sh);  //NumberFormatException
            int a = 10 / x;  //ArithmeticException
            System.out.println(x);
            System.out.println(a);
        }
        catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e){
            System.out.println("Problem with the code");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
