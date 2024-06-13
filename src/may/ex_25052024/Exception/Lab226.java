package may.ex_25052024.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab226 {
    public static void main(String[] args) {
        try {
            int a =10/0;  //Unchecked -> JVM don't know
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader f = new FileReader(new File("C://a.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
