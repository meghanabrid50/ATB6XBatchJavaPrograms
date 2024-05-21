package ex_04052024;

public class Lab138 {
    public static void main(String[] args) {

        int [] [] array_2d = {
                {32,43,45},
                {34,54,33}
        };
        int row = array_2d.length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < array_2d[i].length; j++) {
                System.out.println(array_2d[i][j]);

            }

        }


    }
}
