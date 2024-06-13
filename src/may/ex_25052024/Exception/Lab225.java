package may.ex_25052024.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab225 {
    public static void main(String[] args) throws FileNotFoundException {
        readFile("C://a.txt");
    }
    static void readFile(String filename) throws FileNotFoundException{
        int a =  10/10;
        int c =0;
        int a1 = 10/c;
        FileReader f = new FileReader(new File("C://a.txt"));

    }
}
