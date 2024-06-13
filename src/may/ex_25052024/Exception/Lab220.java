package may.ex_25052024.Exception;

import java.io.FileInputStream;

public class Lab220 {
    public static void main(String[] args) {
        //Exception
        //Checked -> JVM Knows
       try {
           FileInputStream f = new FileInputStream("C:/log.txt");
       }
       catch (Exception e)
       {
           System.out.println(e.getMessage());
       }

        //Unchecked -> JVM don't know
        int a =10;
        int c = a/10;
        System.out.println(c);
    }


}
