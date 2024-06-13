package may.ex_25052024.Exception;

public class Lab211 {
    public static void main(String[] args) {
        try {
            String sh = args[0]; //ArrayIndexOutOfBoundException
            int x = Integer.parseInt(sh);  //NumberFormatException
            int a = 10 / x;  //ArithmeticException
            System.out.println(x);
            System.out.println(a);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        //JVM will be initialized
        //Creates and start main method
        //main thread will do the following tasks
        //1 : Collects the command line arguments
        //2: Creates the string array with CLA
        //3: Calls main method by passing string array as parameters
        //Lab211.main(5)
        //Now control will be transferred to main thread to main method
        //Control will come back to main method in two ways
        //A : When problem comes in main -> JVM
        //Creates the object of identified exception class
        //Exception a = new Exception()



    }
}
