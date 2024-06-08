package may.ex_04052024;

public class Lab137 {
    public static void main(String[] args) {
        //2d array

        int [] [] array_2d = {
                {32,43,45},
                {34,54,33},
                {54,22,21}
        };

        for (int i = 0; i < array_2d.length; i++) {  //Row
            for (int j = 0; j < array_2d[i].length; j++) { //Col
                System.out.println(array_2d[i][j]);

            }

        }




        int [] [] arr_2d = new int[3][3];
        //  | 0, 0, 0 |
        //  | 0, 0, 0 |
        //  | 0, 0, 0 |

        arr_2d [0] [0] =34;
        //  |34, 0, 0 |
        //  | 0, 0, 0 |
        //  | 0, 0, 0 |

        arr_2d [0] [1] =12;
        //  |34,12, 0 |
        //  | 0, 0, 0 |
        //  | 0, 0, 0 |

    }
}
