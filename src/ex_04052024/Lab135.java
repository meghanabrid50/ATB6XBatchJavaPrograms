package ex_04052024;

public class Lab135 {
    public static void main(String[] args) {
        int sal[]= {30,50,100,34,90,10,999,-1,-2};

        int max_sal = Integer.MIN_VALUE;  //-2147483648
       // int max_sal=0;  We can take 0 also but if negative numbers are in array then it will give proper result

        for (int i = 0; i < sal.length; i++) {

            if (sal[i] > max_sal)
            {
                max_sal= sal[i];
            }

        }
        System.out.println("Max sal is ->" + max_sal);
    }
}
