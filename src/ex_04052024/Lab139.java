package ex_04052024;

public class Lab139 {
    public static void main(String[] args) {
        int [] [] array_2d = {
                {32,43},
                {34,54},
                {54,22}
        };

        for (int i = 0; i < array_2d.length; i++) {  //Row
            for (int j = 0; j < array_2d[i].length; j++) { //Col
                System.out.println(array_2d[i][j]);

            }

        }
    }
}
